import android.content.Context;
import android.content.SharedPreferences;

public final class gxva {
    private final Context a;

    public gxva(Context context0) {
        this.a = context0;
    }

    public final long a() {
        return this.b().getLong("key_timestamp_first_time_using_fast_pair", -1L);
    }

    public final SharedPreferences b() {
        return this.a.getSharedPreferences("discovery_shared_pref", 4);
    }

    public final void c(boolean z) {
        this.b().edit().putBoolean("has_pending_app_install", z).commit();
    }

    public final void d(boolean z) {
        this.b().edit().putString("key_has_provider_sent_session_nonce", (z ? "HAS_SESSION_NONCE" : "NO_SESSION_NONCE")).commit();
    }

    public final void e(long v) {
        this.b().edit().putLong("key_timestamp_first_time_using_fast_pair", v).commit();
    }

    public final boolean f() {
        return this.b().getBoolean("key_has_le_audio_peripheral", false);
    }

    public final boolean g() {
        return this.j() == 2;
    }

    public final boolean h() {
        return this.b().getBoolean("nearby_debug_mode", hvoz.a.f().x());
    }

    public final boolean i() {
        return this.b().getBoolean("notification_settings_devcie", hvoz.a.f().y());
    }

    public final int j() {
        switch(this.b().getString("key_has_provider_sent_session_nonce", "UNKNOWN")) {
            case "HAS_SESSION_NONCE": {
                return 2;
            }
            case "NO_SESSION_NONCE": {
                return 3;
            }
            case "UNKNOWN": {
                return 1;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    public final int k(String s) {
        if(!this.b().contains(s)) {
            return 2;
        }
        return this.b().getBoolean(s, true) ? 3 : 4;
    }
}

