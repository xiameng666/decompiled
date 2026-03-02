import android.content.Context;
import android.content.SharedPreferences.Editor;
import java.util.concurrent.TimeUnit;

public final class aqwn {
    public static final baun a;
    public final bakc b;

    static {
        aqwn.a = aqql.a("VersionInfoHelper");
    }

    private aqwn(bakc bakc0) {
        this.b = bakc0;
    }

    public static aqwn a(Context context0) {
        return new aqwn(new bakc(context0, "version_info_settings", true));
    }

    public final gfsx b() {
        gfsx gfsx0;
        try {
            gfsx0 = gfsx.l(this.b.getString("versionInfoToken", null));
        }
        catch(bakb bakb0) {
            aqwn.a.n("Error reading version_info from shared preferences", bakb0, new Object[0]);
            return gfqx.a;
        }
        if(!gfsx0.i()) {
            return gfqx.a;
        }
        try {
            long v = this.b.getLong("versionInfoTimestamp", -1L);
            long v1 = System.currentTimeMillis();
        }
        catch(bakb bakb1) {
            aqwn.a.n("Error reading version_info from shared preferences", bakb1, new Object[0]);
            return gfqx.a;
        }
        if(Long.compare(v, 0L) < 0) {
            aqwn.a.m("Found version info but no timestamp in shared preferences. Clearing version info.", new Object[0]);
            this.c();
            return gfqx.a;
        }
        if(v1 < v) {
            aqwn.a.d("Clock has rolled backwards. Clearing version info from shared prefs", new Object[0]);
            this.c();
            return gfqx.a;
        }
        if(v1 > v + TimeUnit.SECONDS.toMillis(hqmx.a.b().a())) {
            aqwn.a.d("Version info in shared prefs expired. Clearing version info.", new Object[0]);
            this.c();
            return gfqx.a;
        }
        return gfsx0;
    }

    private final void c() {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.b.edit();
        sharedPreferences$Editor0.remove("versionInfoToken");
        sharedPreferences$Editor0.remove("versionInfoTimestamp");
        sharedPreferences$Editor0.apply();
    }
}

