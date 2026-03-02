import android.content.Context;

public final class fmjf {
    public String a;
    public final Context b;
    public final gmcg c;
    public final flbe d;
    public final fieo e;
    public hjkd f;

    public fmjf(Context context0, flbe flbe0, fieo fieo0) {
        this.a = null;
        this.b = context0;
        this.c = flbs.b().a;
        this.d = flbe0;
        this.e = fieo0;
        this.f = new hjkd(new hjji());
    }

    @Deprecated
    public fmjf(String s) {
        this(null, null, null);
        this.a = s;
    }

    public static final iapn a(String s, String s1, iapk iapk0) {
        flbj.c("ScottyStub", a.l(s, s1, "Got Scotty Error: ", " requestId="));
        return new iapn(iapk0.e(new fmja(s1)));
    }

    public static final iapn b(String s, String s1, iapk iapk0, Throwable throwable0) {
        flbj.d("ScottyStub", a.l(s, s1, "Got Scotty Error: ", " requestId="), throwable0);
        return new iapn(iapk0.e(new fmja(s1, throwable0)));
    }
}

