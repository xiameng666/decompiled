import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.internal.Preconditions;
import java.util.concurrent.TimeUnit;

public final class ebjf {
    public static final bboh a;
    public final donp b;
    public Account c;
    public dyra d;
    public gmcg e;
    private final dyfv f;
    private final String g;
    private final Context h;

    static {
        ebjf.a = bboh.b("Pay", bbcu.cZ);
    }

    public ebjf(dyfv dyfv0, donp donp0, String s, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.f = dyfv0;
        this.b = donp0;
        this.g = s;
        this.h = context0;
    }

    public final gmcg a() {
        gmcg gmcg0 = this.e;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("highSpeedExecutor");
        return null;
    }

    public final void b() {
        evql evql0;
        String s = this.f.d;
        ibuq.e(s, "getAccountName(...)");
        String s1 = eccr.b(this.h, s);
        Context context0 = AppContextProvider.a();
        ibuq.e(context0, "getApplicationContext(...)");
        ibuq.c(s1);
        dola dola0 = dlmg.a(context0, s, s1);
        dmgr dmgr0 = new dmgr(this.g);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new ebjy(dola0, dmgr0, new done(), new edop(), domv0).inject(this);
        dyra dyra0 = this.d;
        if(dyra0 == null) {
            ibuq.j("octopusCardManager");
            dyra0 = null;
        }
        switch(dzar.k(dyra0.f) - 1) {
            case 1: {
                String s2 = dyra0.b.name;
                ibuq.e(s2, "name");
                ibuq.f(s2, "accountName");
                String s3 = fsgr.a(s2, null, null, null, "GET_READINESS_STATUS", null, 46);
                ficj ficj0 = dyra0.h.a.a(1L, TimeUnit.MINUTES);
                dyra0.h.g(ficj0, 0x31A01, s2);
                evql evql1 = dyra0.h.b.a(s3).g(new fsfm(ficj0));
                dyqf dyqf0 = new dyqf(dyra0);
                evql0 = evql1.f(dyra0.g, dyqf0);
                break;
            }
            case 3: {
                evql0 = dyra0.e(dyil.c);
                break;
            }
            default: {
                evql0 = dyra0.e(dyil.b);
            }
        }
        dyqg dyqg0 = new dyqg(dyra0);
        evql evql2 = evql0.h(dyra0.g, dyqg0);
        evql2.y(this.a(), new ebjd(new ebjc(this)));
        evql2.v(this.a(), new ebje(this));
    }
}

