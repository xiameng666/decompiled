import android.content.Context;

public final class ebuf {
    public static final bboh a;
    public final dyfv b;
    public final donp c;
    public final Context d;
    public dypj e;
    public gmcg f;
    public fhwb g;
    public fich h;

    static {
        ebuf.a = bboh.b("Pay", bbcu.cZ);
    }

    public ebuf(dyfv dyfv0, donp donp0, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(context0, "context");
        super();
        this.b = dyfv0;
        this.c = donp0;
        this.d = context0;
    }

    public final gmcg a() {
        gmcg gmcg0 = this.f;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("highSpeedExecutor");
        return null;
    }
}

