import android.content.Context;

public final class absk {
    private static absk a;
    private final cjpc b;

    public absk(Context context0) {
        this.b = cjqh.a(context0, "analytics", "GoogleAnalyticsPlayLogs", 0);
    }

    public static absk a(Context context0) {
        synchronized(absk.class) {
            if(absk.a == null) {
                absk.a = new absk(context0.getApplicationContext());
            }
        }
        return absk.a;
    }

    public final void b() {
        synchronized(this) {
            cjpa cjpa0 = this.b.c();
            cjpa0.d();
            cjpd.g(cjpa0);
        }
    }

    public final void c() {
        synchronized(this) {
            cjpa cjpa0 = this.b.c();
            cjpa0.f("hitsReceived", cjpd.a(this.b, "hitsReceived", 0) + 1);
            cjpd.g(cjpa0);
        }
    }
}

