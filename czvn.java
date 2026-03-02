import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.FIN;

public final class czvn implements Runnable {
    public final czvo a;

    public czvn(czvo czvo0) {
        this.a = czvo0;
    }

    @Override
    public final void run() {
        int v1;
        while(true) {
            czvo czvo0 = this.a;
            czvm czvm0 = (czvm)czvo0.b.poll();
            if(czvm0 == null) {
                AtomicBoolean atomicBoolean0 = czvo0.c;
                __monitor_enter(atomicBoolean0);
                v1 = FIN.finallyOpen$NT();
                if(czvo0.b.isEmpty() && atomicBoolean0.get()) {
                    atomicBoolean0.set(false);
                    try {
                        atomicBoolean0.wait();
                        if(czvo0.d.get()) {
                            break;
                        }
                    }
                    catch(InterruptedException unused_ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                FIN.finallyCodeBegin$NT(v1);
                __monitor_exit(atomicBoolean0);
                FIN.finallyCodeEnd$NT(v1);
            }
            else {
                DataOutputStream dataOutputStream0 = czvo0.a;
                synchronized(dataOutputStream0) {
                    try {
                        dataOutputStream0.writeInt(czvm0.b.length);
                        dataOutputStream0.write(czvm0.b);
                        dataOutputStream0.flush();
                        czvm0.a.q(Boolean.valueOf(true));
                    }
                    catch(IOException iOException0) {
                        czvm0.a.r(iOException0);
                    }
                }
            }
        }
        FIN.finallyExec$NT(v1);
    }
}

