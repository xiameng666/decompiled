import android.content.Context;
import android.net.wifi.WifiScanner.ScanSettings;
import android.os.PowerManager;
import android.os.SystemClock;

public class fwwa extends fwwn {
    private long a;

    public fwwa() {
        this.a = 0x8000000000000000L;
    }

    protected WifiScanner.ScanSettings a(boolean z, Context context0) {
        WifiScanner.ScanSettings wifiScanner$ScanSettings0 = new WifiScanner.ScanSettings();
        wifiScanner$ScanSettings0.reportEvents = 3;
        wifiScanner$ScanSettings0.numBssidsPerScan = 25;
        wifiScanner$ScanSettings0.periodInMs = 0;
        if(fvrx.a(z, bbnp.k(context0), this.a, SystemClock.elapsedRealtime())) {
            wifiScanner$ScanSettings0.band = 7;
            return wifiScanner$ScanSettings0;
        }
        wifiScanner$ScanSettings0.band = 3;
        return wifiScanner$ScanSettings0;
    }

    @Override  // fwwn
    public final fwus b() {
        if(humf.c()) {
            return new fwuq();
        }
        try {
            return new fwup();
        }
        catch(NoClassDefFoundError unused_ex) {
            return super.b();
        }
    }

    protected final void c() {
        this.a = SystemClock.elapsedRealtime();
    }

    @Override  // fwwn
    public final boolean d(PowerManager powerManager0) {
        return powerManager0 == null ? false : powerManager0.isDeviceIdleMode();
    }
}

