import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;

public final class ekqx {
    public final PowerManager a;

    public ekqx(Context context0) {
        Object object0 = context0.getSystemService("power");
        this.a = object0 == null ? null : ((PowerManager)object0);
    }

    public final boolean a() {
        return this.a != null && this.a.isDeviceIdleMode();
    }

    public final boolean b() {
        if(Build.VERSION.SDK_INT >= 34) {
            hrwo.a.b().n();
        }
        return this.a != null && this.a.isPowerSaveMode();
    }

    public final boolean c() {
        return this.a != null && this.a.isInteractive();
    }
}

