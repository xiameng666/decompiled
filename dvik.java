import android.content.Context;

public final class dvik {
    public static final bboh a;
    public static final String b;
    public static final String c;
    public final Context d;
    public final String e;
    public final String f;

    static {
        dvik.a = bboh.b("Pay", bbcu.cZ);
        dvik.b = String.format("%s=? AND %s=? AND %s=?", "account_id", "environment", "collector_id");
        dvik.c = String.format("%s=? AND %s=?", "account_id", "environment");
    }

    public dvik(Context context0, String s, String s1) {
        this.d = context0;
        this.e = s;
        this.f = s1;
    }
}

