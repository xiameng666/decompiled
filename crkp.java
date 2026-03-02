import android.os.Process;
import j..util.Objects;
import java.util.concurrent.BlockingQueue;
import jeb.synthetic.FIN;

final class crkp extends Thread {
    final crkq a;
    private final Object b;
    private final BlockingQueue c;
    private boolean d;

    public crkp(crkq crkq0, String s, BlockingQueue blockingQueue0) {
        Objects.requireNonNull(crkq0);
        this.a = crkq0;
        super();
        this.d = false;
        this.b = new Object();
        this.c = blockingQueue0;
        this.setName(s);
    }

    public final void a() {
        synchronized(this.b) {
            this.b.notifyAll();
        }
    }

    private final void b() {
        crkq crkq0 = this.a;
        Object object0 = crkq0.d;
        synchronized(object0) {
            if(!this.d) {
                crkq0.e.release();
                object0.notifyAll();
                if(this == crkq0.b) {
                    crkq0.b = null;
                }
                else if(this == crkq0.c) {
                    crkq0.c = null;
                }
                else {
                    crkq0.aJ().c.a("Current scheduler thread is neither worker nor network");
                }
                this.d = true;
            }
        }
    }

    private final void c(InterruptedException interruptedException0) {
        this.a.aJ().f.b(this.getName() + " was interrupted", interruptedException0);
    }

    @Override
    public final void run() {
        int v3;
        Object object1;
        for(boolean z = false; !z; z = true) {
            try {
                this.a.e.acquire();
            }
            catch(InterruptedException interruptedException0) {
                this.c(interruptedException0);
            }
        }
        try {
            int v1 = Process.getThreadPriority(Process.myTid());
            while(true) {
                BlockingQueue blockingQueue0 = this.c;
                crko crko0 = (crko)blockingQueue0.poll();
                if(crko0 == null) {
                    Object object0 = this.b;
                    synchronized(object0) {
                        if(blockingQueue0.peek() == null) {
                            try {
                                object0.wait(30000L);
                            }
                            catch(InterruptedException interruptedException1) {
                                this.c(interruptedException1);
                            }
                        }
                    }
                    object1 = this.a.d;
                    __monitor_enter(object1);
                    v3 = FIN.finallyOpen$NT();
                    if(this.c.peek() == null) {
                        break;
                    }
                    FIN.finallyExec$NT(v3);
                }
                else {
                    Process.setThreadPriority((crko0.a ? v1 : 10));
                    crko0.run();
                }
            }
            this.b();
            FIN.finallyCodeBegin$NT(v3);
            __monitor_exit(object1);
            FIN.finallyCodeEnd$NT(v3);
        }
        finally {
            this.b();
        }
    }
}

