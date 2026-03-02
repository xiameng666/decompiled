import android.accounts.Account;
import android.content.Context;

public final class ebub {
    public static final bboh a;
    public final dyfv b;
    public final donp c;
    public final String d;
    public final Context e;
    public Account f;
    public String g;
    public dyra h;
    public dxzq i;
    public gmcg j;

    static {
        ebub.a = bboh.b("Pay", bbcu.cZ);
    }

    public ebub(dyfv dyfv0, donp donp0, String s, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.b = dyfv0;
        this.c = donp0;
        this.d = s;
        this.e = context0;
    }

    public final gmcg a() {
        gmcg gmcg0 = this.j;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("highSpeedExecutor");
        return null;
    }
}

