import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;

public final class eyec {
    private final Context a;

    public eyec() {
        this.a = AppContextProvider.a();
    }

    public final void a() {
        Settings.Secure.putInt(this.a.getContentResolver(), "ActiveUnlockDistanceBasedRelockSetting", 0);
    }

    public final void b() {
        Settings.Secure.putInt(this.a.getContentResolver(), "ActiveUnlockDistanceBasedRelockSetting", 1);
    }

    public final void c() {
        Settings.Secure.putInt(this.a.getContentResolver(), "ActiveUnlockDistanceBasedRelockSupport", 0);
    }

    public final void d() {
        Settings.Secure.putInt(this.a.getContentResolver(), "ActiveUnlockDistanceBasedRelockSupport", 1);
    }

    public final boolean e() {
        return Settings.Secure.getInt(this.a.getContentResolver(), "ActiveUnlockDistanceBasedRelockSetting", 0) == 1;
    }

    public final boolean f() {
        return Settings.Secure.getInt(this.a.getContentResolver(), "ActiveUnlockDistanceBasedRelockSupport", 0) == 1;
    }
}

