import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;

public final class azhq {
    public final Context a;
    public final bbng b;
    public azgv c;

    public azhq(Context context0, bbng bbng0) {
        this.a = context0;
        this.b = bbng0;
    }

    public final long a() {
        return this.a.getSharedPreferences("timing_control_pref", 0).getLong("last_record_wall_time_millis", 0L);
    }

    public final long b() {
        long v = System.currentTimeMillis();
        SharedPreferences sharedPreferences0 = this.a.getSharedPreferences("timing_control_pref", 0);
        return v >= sharedPreferences0.getLong("last_record_wall_time_millis", 0L) ? Math.max(sharedPreferences0.getLong("next_upload_time_millis", 0L) - v, 0L) : 0L;
    }

    public final void c() {
        SharedPreferences sharedPreferences0 = this.a.getSharedPreferences("timing_control_pref", 0);
        long v = Math.max(sharedPreferences0.getLong("server_suggested_interval_millis", 0L), azie.b(((gful_cronetEngineProvider)new azhp()), "qos_silent_window_min_millis", Long.valueOf(10000L)).longValue());
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        long v1 = System.currentTimeMillis();
        sharedPreferences$Editor0.putLong("last_record_wall_time_millis", v1);
        sharedPreferences$Editor0.putLong("next_upload_time_millis", v1 + v);
        sharedPreferences$Editor0.apply();
    }
}

