import android.os.SystemProperties;
import android.util.Log;
import java.util.concurrent.ExecutorService;

public final class feft implements ffmj {
    public final feic a;
    public final ExecutorService b;
    public boolean c;

    public feft(feic feic0) {
        ExecutorService executorService0 = clhl.b.b(clhr.b);
        super();
        this.c = false;
        this.a = feic0;
        this.b = executorService0;
    }

    public static void a(String s) {
        if(Log.isLoggable("BleAdvertiser", 3)) {
            Log.d("BleAdvertiser", s);
        }
    }

    public static final boolean b() {
        return SystemProperties.getInt("ro.oem.ble_advertising_interval", 0) == -1;
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("BleDeviceAdvertiser Advertising Interval: " + SystemProperties.getInt("ro.oem.ble_advertising_interval", 0));
        bbpd0.println("BleDeviceAdvertiser is advertising: " + this.c);
    }
}

