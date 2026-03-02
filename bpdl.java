import android.accounts.Account;

public final class bpdl implements glzn {
    public final bpik a;
    public final gtas b;

    public bpdl(bpik bpik0, gtas gtas0) {
        this.a = bpik0;
        this.b = gtas0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gftb.q(((fqzl)object0).e);
        bpik bpik0 = this.a;
        gtas gtas0 = this.b;
        if((((fqzl)object0).b & 0x20) != 0) {
            fqxm fqxm0 = ((fqzl)object0).j;
            if(fqxm0 == null) {
                fqxm0 = fqxm.a;
            }
            gfsx gfsx0 = bpik0.c(fqxm0);
            if(!gfsx0.i()) {
                return gdta.g(gmbu.i(gfqx.a)).i(new bpgp(bpik0, gtas0, ((fqzl)object0)), bpik0.m);
            }
            return bpik0.u(((Account)gfsx0.d())) ? gdta.g(bpik0.q(((fqzl)object0), gfsx.m(gtas0), false, ((Account)gfsx0.d()))).i(new bpgp(bpik0, gtas0, ((fqzl)object0)), bpik0.m) : gdta.g(gdta.g(bpik0.n(((fqzl)object0))).h(new bphm(), gmap.a)).i(new bpgp(bpik0, gtas0, ((fqzl)object0)), bpik0.m);
        }
        return gdta.g(gdta.g(bpik0.g(((fqzl)object0), gfsx.m(gtas0), false)).i(new bphk(bpik0, gtas0), bpik0.m)).i(new bpgp(bpik0, gtas0, ((fqzl)object0)), bpik0.m);
    }
}

