import android.app.KeyguardManager;
import android.content.Context;

public final class aiig {
    private final KeyguardManager a;

    public aiig(Context context0) {
        KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
        super();
        this.a = keyguardManager0;
    }

    public final boolean a() {
        return !this.a.isDeviceLocked();
    }

    public final boolean b() {
        return this.a.isDeviceSecure();
    }
}

