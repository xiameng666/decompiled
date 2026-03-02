import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class crkq extends crlv {
    public static final AtomicLong a;
    public crkp b;
    public crkp c;
    public final Object d;
    public final Semaphore e;
    public volatile boolean f;
    private final PriorityBlockingQueue g;
    private final BlockingQueue h;
    private final Thread.UncaughtExceptionHandler i;
    private final Thread.UncaughtExceptionHandler j;

    static {
        crkq.a = new AtomicLong(0x8000000000000000L);
    }

    public crkq(crkt crkt0) {
        super(crkt0);
        this.d = new Object();
        this.e = new Semaphore(2);
        this.g = new PriorityBlockingQueue();
        this.h = new LinkedBlockingQueue();
        this.i = new crkn(this, "Thread death: Uncaught exception on worker thread");
        this.j = new crkn(this, "Thread death: Uncaught exception on network thread");
    }

    public final Future a(Callable callable0) {
        this.l();
        Future future0 = new crko(this, callable0, false);
        if(Thread.currentThread() == this.b) {
            if(!this.g.isEmpty()) {
                this.aJ().f.a("Callable skipped the worker queue.");
            }
            ((crko)future0).run();
            return future0;
        }
        this.k(((crko)future0));
        return future0;
    }

    public final Future b(Callable callable0) {
        this.l();
        Future future0 = new crko(this, callable0, true);
        if(Thread.currentThread() == this.b) {
            ((crko)future0).run();
            return future0;
        }
        this.k(((crko)future0));
        return future0;
    }

    public final void c() {
        if(Thread.currentThread() != this.b) {
            return;
        }
        throw new IllegalStateException("Call not expected from worker thread");
    }

    public final void d(Runnable runnable0) {
        this.l();
        batl.s(runnable0);
        crko crko0 = new crko(this, runnable0, false, "Task exception on network thread");
        synchronized(this.d) {
            BlockingQueue blockingQueue0 = this.h;
            blockingQueue0.add(crko0);
            crkp crkp0 = this.c;
            if(crkp0 == null) {
                crkp crkp1 = new crkp(this, "Measurement Network", blockingQueue0);
                this.c = crkp1;
                crkp1.setUncaughtExceptionHandler(this.j);
                this.c.start();
            }
            else {
                crkp0.a();
            }
        }
    }

    @Override  // crlv
    protected final boolean e() {
        return false;
    }

    public final void f(Runnable runnable0) {
        this.l();
        batl.s(runnable0);
        this.k(new crko(this, runnable0, false, "Task exception on worker thread"));
    }

    public final void g(Runnable runnable0) {
        this.l();
        this.k(new crko(this, runnable0, true, "Task exception on worker thread"));
    }

    public final boolean i() {
        return Thread.currentThread() == this.b;
    }

    public final void j(AtomicReference atomicReference0, long v, String s, Runnable runnable0) {
        synchronized(atomicReference0) {
            this.aK().f(runnable0);
            try {
                atomicReference0.wait(v);
                goto label_7;
            }
            catch(InterruptedException unused_ex) {
            }
            this.aJ().f.a("Interrupted waiting for " + s);
        }
        return;
    label_7:
        if(atomicReference0.get() == null) {
            this.aJ().f.a("Timed out waiting for " + s);
        }
    }

    private final void k(crko crko0) {
        synchronized(this.d) {
            PriorityBlockingQueue priorityBlockingQueue0 = this.g;
            priorityBlockingQueue0.add(crko0);
            crkp crkp0 = this.b;
            if(crkp0 == null) {
                crkp crkp1 = new crkp(this, "Measurement Worker", priorityBlockingQueue0);
                this.b = crkp1;
                crkp1.setUncaughtExceptionHandler(this.i);
                this.b.start();
            }
            else {
                crkp0.a();
            }
        }
    }

    @Override  // crlu
    public final void n() {
        if(Thread.currentThread() == this.b) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }
}

