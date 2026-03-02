import java.util.concurrent.atomic.AtomicBoolean;

public final class cjdd implements Runnable {
    public final cjdf a;
    public final cjde b;
    public final AtomicBoolean c;

    public cjdd(cjdf cjdf0, cjde cjde0, AtomicBoolean atomicBoolean0) {
        this.a = cjdf0;
        this.b = cjde0;
        this.c = atomicBoolean0;
    }

    @Override
    public final void run() {
        cjdf cjdf0 = this.a;
        __monitor_enter(cjdf0.a);
        Object object0 = cjdf0.d;
        __monitor_exit(cjdf0.a);
        cjde cjde0 = this.b;
        boolean z = false;
        Exception exception0 = null;
        if(object0 != null) {
            try {
                cjde0.c(object0);
                z = true;
            }
            catch(Exception exception0) {
                if((exception0 instanceof RuntimeException)) {
                    throw (RuntimeException)exception0;
                }
            }
        }
        cjde0.a(z);
        this.c.set(true);
        if(exception0 != null) {
            cjdf0.d(exception0);
        }
    }
}

