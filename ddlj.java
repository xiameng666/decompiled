import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class ddlj {
    public final bbng a;
    public final dcpn b;
    private final Context c;

    public ddlj(Context context0, bbng bbng0) {
        this.c = context0;
        this.a = bbng0;
        this.b = dcpn.f(context0);
    }

    public final cjpc a() {
        return cjqh.a(this.c, "nearby", "nearbysharing:fastinitblacklist:state", 0);
    }

    public final boolean b() {
        boolean z = cjpd.i(this.a(), "enable_long_timeout_for_hide_dismissed_notification", false);
        long v = System.currentTimeMillis() - cjpd.b(this.a(), "most_recent_notification_dismissed_timestamp", 0L);
        if(z && v < TimeUnit.SECONDS.toMillis(hvqs.I())) {
            dcvz.a.b().p("Not showing fast init notifications for the long timeout: the user recently dismissed the notification twice.", new Object[0]);
            return true;
        }
        if(v < hvqs.J()) {
            dcvz.a.b().p("Not showing fast init notifications: the user recently dismissed the notification.", new Object[0]);
            return true;
        }
        return false;
    }
}

