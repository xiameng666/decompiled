import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class caai {
    public final caae a;
    public final cjpc b;
    public final bbng c;
    private static final long d;
    private final List e;

    static {
        bboh.b("OptInPreferences", bbcu.bz);
        caai.d = TimeUnit.DAYS.toSeconds(7L);
    }

    public caai(caae caae0, cjpc cjpc0, bbng bbng0) {
        this.a = caae0;
        this.b = cjpc0;
        this.c = bbng0;
        this.e = new ArrayList();
    }

    public final int a() {
        cjpc cjpc0 = this.b;
        int v = cjpd.a(cjpc0, "optInState", 2);
        int v1 = cjpd.a(cjpc0, "optInLanguageVersion", 0);
        switch(v) {
            case 0: {
                return 0;
            }
            case 1: {
                if(this.a.a() == null) {
                    return this.e();
                }
                return v1 >= 0 ? 0 : 2;
            }
            default: {
                long v2 = System.currentTimeMillis();
                if(!cjpd.h(cjpc0, "optInLastDeclineMillisSinceEpoch") && cjpd.h(cjpc0, "optInNextPromptSecondsSinceEpoch")) {
                    long v3 = cjpd.b(cjpc0, "optInNextPromptSecondsSinceEpoch", 0L);
                    return v2 < TimeUnit.SECONDS.toMillis(v3 - caai.d) + hugt.a.d().k() ? 3 : this.e();
                }
                return v2 < cjpd.b(cjpc0, "optInLastDeclineMillisSinceEpoch", 0L) + hugt.a.d().k() ? 3 : this.e();
            }
        }
    }

    public final void b(caah caah0) {
        synchronized(this) {
            this.e.add(caah0);
        }
    }

    public final void c(Account account0, int v, int v1) {
        synchronized(this) {
            for(Object object0: this.e) {
                ((caah)object0).a(account0, v, v1);
            }
        }
    }

    public final void d(String s) {
        if(s != null) {
            this.a.d(s);
        }
        int v = this.a();
        cjpa cjpa0 = this.b.c();
        cjpa0.f("optInState", 0);
        cjpa0.j("optInNextPromptSecondsSinceEpoch");
        cjpa0.j("optInOneMoreChance");
        cjpa0.j("optInLastDeclineMillisSinceEpoch");
        cjpa0.j("optInNumDeclines");
        cjpd.f(cjpa0);
        this.c(this.a.a(), v, 0);
    }

    private final int e() {
        return this.a.e().length <= 0 ? 3 : 2;
    }
}

