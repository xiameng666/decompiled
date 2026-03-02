import com.google.android.libraries.messaging.lighter.model..AutoValue_AccountContext;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..time.Instant;
import java.security.KeyPair;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public final class flzd implements flzo {
    private final AccountContext a;
    private final flvq b;
    private final String c;
    private final KeyPair d;
    private final Instant e;
    private final fiei f;

    public flzd(AccountContext accountContext0, flce flce0, fiei fiei0, String s, KeyPair keyPair0, Instant instant0) {
        this.a = accountContext0;
        this.b = new flvq(flce0);
        this.f = fiei0;
        this.c = s;
        this.d = keyPair0;
        this.e = instant0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        hnxb hnxb0 = flvq.b(this.a.c().f());
        gmcd gmcd0 = flvq.d(this.f);
        return gmbu.d(new gmcd[]{gmcd0}).a(new flvm(this.b, hnxl0, this.e, this.d, hnxb0, gmcd0, this.c), gmap.a);
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flzc(((hnwn)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        if((((hnwo)object0).b & 2) != 0) {
            fmat fmat0 = AccountContext.e();
            fmay fmay0 = new fmay(null);
            fmay0.f(this.a.c().f());
            fmat0.e(fmay0);
            fmat0.c(((hnwo)object0).f);
            fmat0.d(fmav.a);
            AccountContext accountContext0 = fmat0.a();
            fmbj fmbj0 = fmbl.a();
            hnwy hnwy0 = ((hnwo)object0).c;
            if(hnwy0 == null) {
                hnwy0 = hnwy.a;
            }
            fmbj0.d(flbn.a(hnwy0.b.toByteArray()));
            TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
            flba.a();
            long v = timeUnit0.toMicros(System.currentTimeMillis());
            hnwy hnwy1 = ((hnwo)object0).c;
            if(hnwy1 == null) {
                hnwy1 = hnwy.a;
            }
            fmbj0.f(v + hnwy1.c);
            flba.a();
            fmbj0.g(System.currentTimeMillis());
            fmbj0.e(this.d);
            fmbl fmbl0 = fmbj0.a();
            flks flks0 = flkt.a();
            flks0.d = 2;
            flks0.a = gfsx.m(accountContext0);
            flks0.b = gfsx.m(fmbl0);
            return flks0.a();
        }
        if(((hnwo)object0).d) {
            flbj.a("RegRefreshRpcHandler", "RegisterRefreshResponse: retry with server timestamp");
            flks flks1 = flkt.a();
            flks1.d = 4;
            flks1.c = gfsx.m(Long.valueOf(((hnwo)object0).e));
            return flks1.a();
        }
        flks flks2 = flkt.a();
        flks2.d = 3;
        return flks2.a();
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(1);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        gfsx gfsx0 = ((flkt)object0).a;
        fmai0.n(((.AutoValue_AccountContext)gfsx0.d()).b.f());
        fmai0.o(((.AutoValue_AccountContext)gfsx0.d()).c.toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.e(v);
        int v1 = ((flkt)object0).d;
        if(v1 == 2) {
            if(gfsx0.i()) {
                fmai0.j(1);
                fmai0.f(1);
                flsl0.b(fmai0.a());
                return;
            }
        }
        else if(v1 == 4) {
            fmai0.j(1);
            fmai0.f(3);
            flsl0.b(fmai0.a());
            return;
        }
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.j(1);
        fmai0.f(2);
        flsl0.b(fmai0.a());
    }
}

