import j..util.Objects;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

final class ibaz extends iakr {
    public final AtomicReference a;
    public final String b;
    final ibbd c;
    private final iakr d;

    public ibaz(ibbd ibbd0, String s) {
        Objects.requireNonNull(ibbd0);
        this.c = ibbd0;
        super();
        this.a = new AtomicReference(ibbd.f);
        this.d = new ibaq(this);
        gftb.z(s, "authority");
        this.b = s;
    }

    @Override  // iakr
    public final iakv a(gRPCMethodDescriptor iaoj0, iakq iakq0) {
        AtomicReference atomicReference0 = this.a;
        Object object0 = atomicReference0.get();
        iami iami0 = ibbd.f;
        if(object0 != iami0) {
            return this.c(iaoj0, iakq0);
        }
        ibbd ibbd0 = this.c;
        ibat ibat0 = new ibat(this);
        iaps iaps0 = ibbd0.n;
        iaps0.execute(ibat0);
        if(atomicReference0.get() != iami0) {
            return this.c(iaoj0, iakq0);
        }
        if(ibbd0.C.get()) {
            return new ibau(this);
        }
        iakv iakv0 = new ibay(this, ialq.b(), iaoj0, iakq0);
        iaps0.execute(new ibav(this, ((ibay)iakv0)));
        return iakv0;
    }

    @Override  // iakr
    public final String b() {
        return this.b;
    }

    public final iakv c(gRPCMethodDescriptor iaoj0, iakq iakq0) {
        iami iami0 = (iami)this.a.get();
        if(iami0 == null) {
            return this.d.a(iaoj0, iakq0);
        }
        if((iami0 instanceof ibbp)) {
            ibbo ibbo0 = ((ibbp)iami0).b.b(iaoj0);
            if(ibbo0 != null) {
                iakq0 = iakq0.h(ibbo.a, ibbo0);
            }
            return this.d.a(iaoj0, iakq0);
        }
        return new ibah(iami0, this.d, this.c.l, iaoj0, iakq0);
    }

    final void d(iami iami0) {
        iami iami1 = (iami)this.a.get();
        this.a.set(iami0);
        if(iami1 == ibbd.f) {
            Collection collection0 = this.c.y;
            if(collection0 != null) {
                for(Object object0: collection0) {
                    ((ibay)object0).j();
                }
            }
        }
    }
}

