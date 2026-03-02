import android.content.Context;
import android.content.SharedPreferences.Editor;
import java.util.concurrent.TimeUnit;

public final class arfw {
    public final bakc a;
    public final long b;

    private arfw(bakc bakc0, int v) {
        this.a = bakc0;
        batl.b(v >= 0);
        this.b = TimeUnit.MINUTES.toMillis(((long)v));
    }

    public static arfw a(Context context0) {
        return new arfw(new bakc(context0, "com.google.android.gms.backup.migrate.service.MigrationStatusRecorder", true), ((int)hqhq.a.j().o()));
    }

    public final void b() {
        batl.j();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
        sharedPreferences$Editor0.putLong("migration_start_time_millis", System.currentTimeMillis());
        sharedPreferences$Editor0.apply();
    }
}

