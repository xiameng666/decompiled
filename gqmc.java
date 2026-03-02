import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public final class gqmc {
    static final Comparator a;
    public static final int b;
    private final ArrayList c;
    private final HashSet d;
    private ggdy e;
    private gged_interceptors f;
    private gfsx g;
    private ggfn h;
    private ggfp i;
    private gfsx j;

    static {
        gqmc.a = ggmo.g(new gqma()).f(new gqmb());
    }

    public gqmc() {
        this.c = new ArrayList();
        this.d = new HashSet();
    }

    public gqmc(byte[] arr_b) {
        this.c = new ArrayList();
        this.d = new HashSet();
        this.g = gfqx.a;
        this.j = gfqx.a;
    }

    public final gqmd a() {
        ArrayList arrayList0 = this.c;
        Collections.sort(arrayList0, gqmc.a);
        if(this.e == null) {
            if(this.f == null) {
                this.e = new ggdy();
            }
            else {
                ggdy ggdy0 = new ggdy();
                this.e = ggdy0;
                ggdy0.k(this.f);
                this.f = null;
            }
        }
        this.e.k(arrayList0);
        HashSet hashSet0 = this.d;
        if(this.h == null) {
            if(this.i == null) {
                this.h = new ggfn();
            }
            else {
                ggfn ggfn0 = new ggfn();
                this.h = ggfn0;
                ggfn0.k(this.i);
                this.i = null;
            }
        }
        this.h.k(hashSet0);
        ggdy ggdy1 = this.e;
        if(ggdy1 != null) {
            this.f = ggdy1.h();
        }
        else if(this.f == null) {
            this.f = ggna.a;
        }
        ggfn ggfn1 = this.h;
        if(ggfn1 != null) {
            this.i = ggfn1.h();
        }
        else if(this.i == null) {
            this.i = ggnj.a;
        }
        gqmd gqmd0 = new gqlp(this.f, this.g, this.i, this.j);
        gged_interceptors gged0 = gqmd0.a;
        boolean z = true;
        gftb.r(((boolean)(gged0.isEmpty() ^ 1)), "Credential Group must be non-empty");
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for(int v = 0; v < ((ggna)gged0).c; ++v) {
            gqms gqms0 = (gqms)gged0.get(v);
            hashSet1.add(gqms0.e());
            hashSet2.add(gqms0.b());
            hashSet3.add(gqms0.c());
            hashSet4.add(gqms0.a());
        }
        gftb.q(hashSet1.size() <= 1);
        gftb.q(hashSet2.size() <= 1);
        gftb.q(hashSet3.size() <= 1);
        if(hashSet4.size() > 1) {
            z = false;
        }
        gftb.q(z);
        return gqmd0;
    }

    public final void b(gged_interceptors gged0) {
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.d(((gqms)gged0.get(v1)));
        }
    }

    public final void c(Collection collection0) {
        this.d.addAll(collection0);
    }

    public final void d(gqms gqms0) {
        this.c.add(gqms0);
        if(gqms0.a().i()) {
            this.j = gfsx.m(gqlz.c(((String)gqms0.a().d())));
        }
    }

    public final void e(String s) {
        this.g = gfsx.m(s);
    }
}

