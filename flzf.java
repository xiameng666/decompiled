import com.google.android.libraries.messaging.lighter.model..AutoValue_AccountContext;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.KeyPair;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class flzf implements flzo {
    private final flvq a;
    private final ContactId b;
    private final String c;
    private final gmcd d;
    private final fiei e;
    private final fiej f;

    public flzf(ContactId contactId0, flce flce0, fiei fiei0, String s, fiej fiej0, gmcd gmcd0) {
        this.a = new flvq(flce0);
        this.b = contactId0;
        this.e = fiei0;
        this.c = s;
        this.f = fiej0;
        this.d = gmcd0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        hnxb hnxb0 = flvq.b(this.b);
        gmcd gmcd0 = flvq.d(this.e);
        gmcd gmcd1 = flvq.c(this.f, hnxb0.d, hnxb0.e, null);
        return gmbu.d(new gmcd[]{gmcd0, this.d, gmcd1}).a(new flvp(this.a, hnxl0, hnxb0, gmcd0, this.c, gmcd1, this.d), gmap.a);
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flze(((hnwp)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        hnwq hnwq0 = (hnwq)object0;
        int v = 2;
        if((hnwq0.b & 2) != 0) {
            try {
                boolean z = hnwq0.c;
                fmat fmat0 = AccountContext.e();
                fmay fmay0 = new fmay(null);
                fmay0.f(this.b);
                fmat0.e(fmay0);
                fmat0.c(hnwq0.e);
                fmat0.d((z ? fmav.a : fmav.b));
                AccountContext accountContext0 = fmat0.a();
                fmbj fmbj0 = fmbl.a();
                fmbj0.d(flbn.a((hnwq0.d == null ? hnwy.a : hnwq0.d).b.toByteArray()));
                fmbj0.e(((KeyPair)gmbu.r(this.d)));
                TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                flba.a();
                hnwy hnwy0 = hnwq0.d == null ? hnwy.a : hnwq0.d;
                fmbj0.f(timeUnit0.toMicros(System.currentTimeMillis()) + hnwy0.c);
                flba.a();
                fmbj0.g(System.currentTimeMillis());
                fmbl fmbl0 = fmbj0.a();
                flku flku0 = new flku(null);
                if(z) {
                    v = 0;
                }
                flku0.c(v);
                flku0.d(accountContext0);
                flku0.b(fmbl0);
                return flku0.a();
            }
            catch(ExecutionException executionException0) {
                flbj.d("RegRpcHandler", "Failed parsing RegisterResponse.", executionException0);
            }
        }
        flku flku1 = new flku(null);
        flku1.c(1);
        return flku1.a();
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.b);
        fmai0.p(uUID0.toString());
        fmai0.j(2);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        gfsx gfsx0 = ((flkv)object0).b;
        if(gfsx0.i()) {
            fmai fmai0 = fmaj.a();
            fmai0.g(10003);
            fmai0.n(((.AutoValue_AccountContext)gfsx0.d()).b.f());
            fmai0.o(((.AutoValue_AccountContext)gfsx0.d()).c.toStringUtf8());
            fmai0.p(uUID0.toString());
            fmai0.j(2);
            fmai0.f(1);
            fmai0.e(v);
            flsl0.b(fmai0.a());
            return;
        }
        fmai fmai1 = fmaj.a();
        fmai1.g(10003);
        fmai1.n(this.b);
        fmai1.p(uUID0.toString());
        fmai1.j(2);
        fmai1.f(2);
        fmai1.e(v);
        flsl0.b(fmai1.a());
    }
}

