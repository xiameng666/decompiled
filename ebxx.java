import android.accounts.Account;
import android.content.Context;

public final class ebxx {
    public static final bboh a;
    public final dyfv b;
    public final donp c;
    public final String d;
    public final Context e;
    public Account f;
    public String g;
    public dyra h;
    public dyth i;
    public gmcg j;
    public dxzq k;
    public fsge l;

    static {
        ebxx.a = bboh.b("Pay", bbcu.cZ);
    }

    public ebxx(dyfv dyfv0, donp donp0, String s, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.b = dyfv0;
        this.c = donp0;
        this.d = s;
        this.e = context0;
    }

    public final dyra a() {
        dyra dyra0 = this.h;
        if(dyra0 != null) {
            return dyra0;
        }
        ibuq.j("octopusCardManager");
        return null;
    }

    public final gmcg b() {
        gmcg gmcg0 = this.j;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("highSpeedExecutor");
        return null;
    }
}

