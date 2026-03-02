import com.google.android.gms.measurement.internal.AppMetadata;
import j..util.Objects;

final class crlc implements Runnable {
    final AppMetadata a;
    final crih b;

    public crlc(crih crih0, AppMetadata appMetadata0) {
        this.a = appMetadata0;
        Objects.requireNonNull(crih0);
        this.b = crih0;
        super();
    }

    @Override
    public final void run() {
        crqq crqq0 = this.b.a;
        crqq0.F();
        crqq0.E();
        crqq0.G();
        AppMetadata appMetadata0 = this.a;
        batl.s(appMetadata0);
        String s = appMetadata0.a;
        batl.q(s);
        int v = 0;
        if(crqq0.n().t(crif.as)) {
            crqq0.av();
            int v1 = crqq0.n().f(null, crif.ab);
            crqq0.n();
            long v2 = System.currentTimeMillis() - crcu.A();
            while(v < v1 && crqq0.am(v2)) {
                ++v;
            }
        }
        else {
            crqq0.n();
            long v3 = crcu.C();
            while(((long)v) < v3 && crqq0.an(s)) {
                ++v;
            }
        }
        if(crqq0.n().t(crif.at)) {
            crqq0.Q();
        }
        crpy crpy0 = crqq0.u;
        crta crta0 = crta.b(appMetadata0.E);
        crpy0.n();
        if(crta0 == crta.b && !crpy.az(s)) {
            crry crry0 = crpy0.au().d(s);
            if(crry0 != null && (crry0.b & 0x200) != 0 && !(crry0.l == null ? crsa.a : crry0.l).e.isEmpty()) {
                crqq0.aJ().k.b("[sgtm] Going background, trigger client side upload. appId", s);
                crqq0.av();
                crqq0.aj(s, System.currentTimeMillis());
            }
        }
    }
}

