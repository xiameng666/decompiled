import j..util.Collection.-EL;
import java.util.List;

public final class bpkf implements gfsi {
    public final bpkl a;
    public final long b;
    public final List c;

    public bpkf(bpkl bpkl0, long v, List list0) {
        this.a = bpkl0;
        this.b = v;
        this.c = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        List list0 = this.c;
        bpkl bpkl0 = this.a;
        synchronized(bpkl0.k) {
            if(bpkl0.d.i() && ((Long)bpkl0.d.d()).equals(Long.valueOf(this.b))) {
                long v1 = bpkl0.h.a();
                bpkl0.h(v1, list0, bouv.e(((fqzl)object0)));
                bpkl0.d = gfqx.a;
                if(!bpkl0.e.isEmpty()) {
                    boolean z = Collection.-EL.stream(bpkl0.e).anyMatch(new bpju());
                    bpkl0.e(((fqzl)object0));
                    bpkl0.j(z, v1);
                }
                return null;
            }
        }
        return null;
    }
}

