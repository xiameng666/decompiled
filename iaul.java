import j..util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public final class iaul extends iaxx {
    public final iavn a;
    public final String b;
    public final AtomicInteger c;
    final iaum d;
    private volatile iapk e;
    private iapk f;
    private iapk g;
    private final iauk h;

    public iaul(iaum iaum0, iavn iavn0, String s) {
        Objects.requireNonNull(iaum0);
        this.d = iaum0;
        super();
        this.c = new AtomicInteger(0x80000001);
        this.h = new iauk(this);
        this.a = iavn0;
        gftb.z(s, "authority");
        this.b = s;
    }

    @Override  // iaxx
    protected final iavn a() {
        return this.a;
    }

    @Override  // iaxx
    public final iauy b(gRPCMethodDescriptor iaoj0, iaof_metadata iaof0, iakq iakq0, ialc[] arr_ialc) {
        iauy iauy0;
        Executor executor0;
        iakn iakn0 = iakq0.e == null ? null : iakq0.e;
        if(iakn0 != null) {
            iauk iauk0 = this.h;
            iakl iakl0 = new iakl(this.a, iaoj0, iaof0, iakq0, iauk0, arr_ialc);
            if(this.c.incrementAndGet() > 0) {
                iauk0.a();
                return new iaxs(this.e, arr_ialc);
            }
            iakm iakm0 = new iakm(this, iaoj0, iakq0);
            try {
                if((iakn0 instanceof iamm) && ((iamm)iakn0).b()) {
                    executor0 = iakq0.c;
                    if(executor0 == null) {
                        executor0 = this.d.a;
                    }
                }
                else {
                    executor0 = this.d.a;
                }
                iakn0.a(iakm0, executor0, iakl0);
            }
            catch(Throwable throwable0) {
                iakl0.b(iapk.j.f("Credentials should use fail() instead of throwing exceptions").e(throwable0));
            }
            synchronized(iakl0.a) {
                iauy0 = iakl0.b;
                if(iauy0 == null) {
                    iakl0.d = new iaxg();
                    iauy0 = iakl0.d;
                    iakl0.b = iauy0;
                    return iauy0;
                }
            }
            return iauy0;
        }
        return this.c.get() >= 0 ? new iaxs(this.e, arr_ialc) : this.a.b(iaoj0, iaof0, iakq0, arr_ialc);
    }

    public final void e() {
        iapk iapk1;
        iapk iapk0;
        synchronized(this) {
            if(this.c.get() != 0) {
                return;
            }
            iapk0 = this.f;
            iapk1 = this.g;
            this.f = null;
            this.g = null;
        }
        if(iapk0 != null) {
            super.p(iapk0);
        }
        if(iapk1 != null) {
            super.q(iapk1);
        }
    }

    @Override  // iaxx
    public final void p(iapk iapk0) {
        gftb.z(iapk0, "status");
        synchronized(this) {
            AtomicInteger atomicInteger0 = this.c;
            if(atomicInteger0.get() < 0) {
                this.e = iapk0;
                atomicInteger0.addAndGet(0x7FFFFFFF);
                if(atomicInteger0.get() != 0) {
                    this.f = iapk0;
                    return;
                }
                super.p(iapk0);
            }
        }
    }

    @Override  // iaxx
    public final void q(iapk iapk0) {
        gftb.z(iapk0, "status");
        synchronized(this) {
            AtomicInteger atomicInteger0 = this.c;
            if(atomicInteger0.get() < 0) {
                this.e = iapk0;
                atomicInteger0.addAndGet(0x7FFFFFFF);
            }
            else if(this.g != null) {
                return;
            }
            if(atomicInteger0.get() != 0) {
                this.g = iapk0;
                return;
            }
        }
        super.q(iapk0);
    }
}

