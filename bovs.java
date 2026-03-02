import android.accounts.Account;
import android.content.Context;

public final class bovs implements fqxf {
    public static final bboh a;
    public final fgvt b;
    public final frli c;
    private final Context d;
    private final Account e;

    static {
        bovs.a = bboh.b("UserDataCacheImpl", bbcu.eD);
    }

    public bovs(Context context0, frli frli0, Account account0, fgvt fgvt0) {
        this.d = context0;
        this.c = frli0;
        this.e = account0;
        this.b = fgvt0;
    }

    @Override  // fqxf
    public final gmcd a(gszv gszv0) {
        bouy bouy0 = new bouy(this, gszv0);
        return this.c.b(bouy0, gmap.a);
    }

    @Override  // fqxf
    public final gmcd b() {
        bouz bouz0 = new bouz();
        return this.c.b(bouz0, gmap.a);
    }

    @Override  // fqxf
    public final gmcd c() {
        return gdtf.j(this.c.a(), new bovg(), gmap.a);
    }

    @Override  // fqxf
    public final gmcd d() {
        return gdtf.j(this.c.a(), new bovi(), gmap.a);
    }

    @Override  // fqxf
    public final gmcd e() {
        boux boux0 = new boux();
        return this.c.b(boux0, gmap.a);
    }

    @Override  // fqxf
    public final gmcd f(Iterable iterable0) {
        bovp bovp0 = new bovp(iterable0);
        return this.c.b(bovp0, gmap.a);
    }

    @Override  // fqxf
    public final gmcd g(fqzu fqzu0) {
        bovb bovb0 = new bovb(fqzu0);
        return this.c.b(bovb0, gmap.a);
    }

    @Override  // fqxf
    public final gmcd h() {
        return gdtf.j(this.c.a(), new bovc(), gmap.a);
    }

    public final void i(boolean z, boolean z1, boolean z2) {
        cljp cljp0 = cljp.a(this.d);
        if(z) {
            if(bpsr.b()) {
                clkn clkn0 = bprs.b();
                clkn0.w("com.google.android.gms.findmydevice.spot.sync.SpotPublicKeysRefreshService");
                clkn0.q("FMD_SPOT_OF_SPKR");
                bprs.s("one-off SPOT public key refresh", cljp0, clkn0.a());
            }
            bprs.r(cljp0);
            bprs.o(cljp0, this.e);
        }
        else {
            bprs.f(cljp0, this.e.name);
        }
        if(z1) {
            bprs.m(cljp0, false);
        }
        bprs.p(cljp0, this.e, z);
        bprs.k(cljp0, this.e, z2);
    }

    public static boolean j(Iterable iterable0) {
        return gggq.v(iterable0, new bovo());
    }
}

