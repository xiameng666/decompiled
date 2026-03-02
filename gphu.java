import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class gphu implements gpkv {
    public static final iakp a;
    public static final iaoa b;
    public static final iaoa c;
    private static final iaoa d;
    private static final iaoa e;
    private final gfsx f;
    private final ggeo g;
    private gmcd h;
    private boolean i;
    private boolean j;

    static {
        gphu.a = new iakp("com.google.frameworks.client.data.android.auth.AuthContextInterceptor", Boolean.valueOf(false));
        gphu.b = new iant("AuthContextInterceptor-RETRIABLE_OAUTH_ERROR", iaof_metadata.c);
        gphu.c = new iant("AuthContextInterceptor-RETRIED_WITH_FORCED_REAUTH", iaof_metadata.c);
        gphu.d = new iant("Authorization", iaof_metadata.c);
        gphu.e = new iant("X-Auth-Time", iaof_metadata.c);
    }

    public gphu(gfsx gfsx0, ggeo ggeo0) {
        this.i = false;
        this.j = false;
        this.f = gfsx0;
        this.g = ggeo0;
    }

    @Override  // gpkv
    public final gpmb a(gpkt gpkt0) {
        try {
            gphy gphy0 = (gphy)gmbu.r(this.h);
            gftb.r(((boolean)(gpkt0.a.j(gphu.d) ^ 1)), "Already attached auth token");
            gpkt0.a.i(gphu.d, "Bearer " + gphy0.a);
            String s = gphy0.a();
            gpkt0.a.i(gphu.e, s);
            return gpmb.a;
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            return (throwable0 instanceof gphx) ? gpmb.b(iaph.q.a().e(throwable0.getCause()), new iaof_metadata()) : gpmb.b(iapk.d(throwable0), new iaof_metadata());
        }
    }

    @Override  // gpkv
    public final gpmb b(gpkt gpkt0) {
        boolean z = false;
        iakq iakq0 = gpkt0.b;
        this.j = ((Boolean)iakq0.j(gphu.a)).booleanValue();
        gphs gphs0 = (gphs)iakq0.j(gphs.a);
        gftb.z(gphs0, "Using AuthContextStrategy, but did not set AuthContext");
        ggeo ggeo0 = this.g;
        String s = gphs0.c;
        if(!ggeo0.containsKey(s)) {
            if(!s.equals("incognito") && !s.equals("pseudonymous")) {
                z = true;
            }
            gftb.r(z, "Used non-google account without enabling API Key fallback");
            iakp iakp0 = gpgy.a;
            gphv gphv0 = ((gpgx)iakq0.j(iakp0)).e;
            this.i = true;
            gfsx gfsx0 = this.f;
            Object object0 = gfsx0.i() ? gfsx0.d() : ((gphl)iakq0.j(gphl.a)).b();
            try(gdqb gdqb0 = gdsp.e("com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "processAuthToken", 150, "AuthContextInterceptor#tokenFuture")) {
                gmce gmce0 = new gmce(gdrx.h(new gpht(gpkt0, gphv0, gphs0, ((Set)object0))));
                gdqb0.a(gmce0);
                ((gpgx)iakq0.j(iakp0)).d.execute(gmce0);
                this.h = gmce0;
                return gpmb.c(gmce0);
            }
        }
        gpid gpid0 = (gpid)ggeo0.get(gphs0.c);
        throw null;
    }

    @Override  // gpkv
    public final gpmc c(gpks gpks0) {
        iaph iaph0 = gpks0.a.t;
        if((iaph0.equals(iaph.q) || iaph0.equals(iaph.h)) && this.i) {
            gpks0.b.i(gphu.b, "");
        }
        if(this.j) {
            gpks0.b.i(gphu.c, "");
        }
        return gpmc.a;
    }

    @Override  // gpkv
    public final gpmb d() {
        return gpmb.a;
    }

    @Override  // gpkv
    public final gpmb e() {
        return gpmb.a;
    }

    @Override  // gpkv
    public final void f() {
    }

    @Override  // gpkv
    public final void g() {
    }
}

