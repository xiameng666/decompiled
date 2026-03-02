import android.content.Context;

public abstract class alef {
    public final Context a;

    public alef(Context context0) {
        this.a = context0;
    }

    public abstract String a(String arg1);

    public abstract String b(String arg1);

    public final void c(String s) {
        this.a.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).edit().remove(this.b(s)).apply();
    }

    public final void d(String s, long v) {
        this.a.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).edit().putLong(this.b(s), v).apply();
    }
}

