import java.util.concurrent.atomic.AtomicBoolean;

public final class bphw implements glzn {
    public final bpik a;
    public final fqzl b;
    public final AtomicBoolean c;
    public final boov d;

    public bphw(bpik bpik0, fqzl fqzl0, AtomicBoolean atomicBoolean0, boov boov0) {
        this.a = bpik0;
        this.b = fqzl0;
        this.c = atomicBoolean0;
        this.d = boov0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!((gfsx)object0).i()) {
            return gmbu.i(gfqx.a);
        }
        if(gggq.v(this.b.l, new bpgd(((gfsx)object0)))) {
            this.c.set(true);
            return gmbu.i(gfqx.a);
        }
        return gdta.g(this.d.a().b()).h(new bpgf(((gfsx)object0)), this.a.m);
    }
}

