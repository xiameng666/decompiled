import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.TWR;

public abstract class cjdq extends cjdf {
    private final AtomicBoolean Vq;
    public volatile Object e;

    protected cjdq(Executor executor0, Object object0) {
        super(executor0, object0);
        this.Vq = new AtomicBoolean(false);
    }

    @Override  // cjdf
    protected final void e(Object object0) {
        gftb.check(object0);
        this.e = object0;
        this.j();
    }

    @Override  // cjdf
    protected void f() {
        this.e = null;
    }

    protected abstract cjcn h();

    protected final Object i() {
        Object object0 = this.e;
        gftb.check(object0);
        return object0;
    }

    protected void j() {
    }

    protected void k(boolean z) {
    }

    public final void l() {
        this.m(true);
    }

    public final void m(boolean z) {
        Object object0 = this.e;
        if(object0 != null && !this.Vq.getAndSet(true)) {
            this.k(z);
            if(z) {
                this.h().ix(object0, this);
                return;
            }
            this.ir(new cjdp(this, object0));
        }
    }

    protected final void n() {
        Object object0 = this.e;
        if(object0 != null) {
            cjcn cjcn0 = this.h();
            cjdo cjdo0 = new cjdo();
            synchronized(cjcn0.a) {
                cjcv cjcv0 = cjcn0.r();
                try {
                    cjcm cjcm0 = cjcn0.c;
                    cjcm0.b();
                    try {
                        bxd bxd0 = cjcn0.b;
                        int v = bxd0.e(object0);
                        if(v >= 0) {
                            cjdf cjdf0 = (cjdf)bxd0.i(v);
                            cjdo0.a(cjdf0);
                            cjcn0.iu(cjdf0);
                        }
                    }
                    catch(Throwable throwable2) {
                        TWR.safeClose$NT(cjcm0, throwable2);
                        throw throwable2;
                    }
                    cjcm0.close();
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(cjcv0, throwable1);
                    throw throwable1;
                }
                cjcv0.close();
            }
        }
    }
}

