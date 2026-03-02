import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;

public final class eroh {
    public final String a;
    public final int b;
    public final String c;
    public int d;
    public String e;

    public eroh(ScanResult scanResult0, int v) {
        this.a = scanResult0.SSID;
        this.b = WifiManager.calculateSignalLevel(scanResult0.level, 4);
        this.c = erqr.c(scanResult0);
        this.d = v;
    }

    public final boolean a() {
        return this.d == 13;
    }

    @Override
    public final String toString() {
        return "AccessPoint<" + this.a + ">";
    }
}

