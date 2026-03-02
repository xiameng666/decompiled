import java.io.Closeable;
import java.util.concurrent.Executor;

public abstract class cjdn extends cjdm {
    private volatile Object d;

    public cjdn(Object object0, ibrt ibrt0) {
        ibuq.f(ibrt0, "coroutineContext");
        super(object0, ibrt0);
    }

    public cjdn(Executor executor0, Object object0) {
        ibuq.f(executor0, "executor");
        this(object0, icdt.b(executor0));
    }

    @Override  // cjdm
    protected final void e(Object object0) {
        ibuq.f(object0, "key");
        this.d = object0;
        super.e(object0);
        this.k();
    }

    @Override  // cjdm
    protected void f() {
        this.d = null;
    }

    public abstract cjcp i();

    public final Object j() {
        Object object0 = this.d;
        ibuq.c(object0);
        return object0;
    }

    protected void k() {
    }

    public final void l() {
        Object object0 = this.d;
        if(object0 != null && this.h()) {
            this.i().t(object0, this);
        }
    }

    public final void m() {
        cjcp cjcp0 = this.i();
        Object object0 = this.j();
        ibuq.f(object0, "key");
        ibuq.f(object0, "key");
        synchronized(cjcp0.a) {
            cjdm cjdm0 = (cjdm)cjcp0.b.get(object0);
            if(cjdm0 != null) {
                Closeable closeable0 = cjcp0.e();
                try {
                    Closeable closeable1 = cjcp0.im();
                    try {
                        cjcp0.p(cjdm0);
                    }
                    catch(Throwable throwable2) {
                        ibsx.a(closeable1, throwable2);
                        throw throwable2;
                    }
                    ibsx.a(closeable1, null);
                }
                catch(Throwable throwable1) {
                    ibsx.a(closeable0, throwable1);
                    throw throwable1;
                }
                ibsx.a(closeable0, null);
            }
        }
    }
}

