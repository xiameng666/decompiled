import android.content.Context;
import android.net.wifi.WifiScanner.ScanSettings;
import android.net.wifi.WifiScanner;
import android.net.wifi.rtt.WifiRttManager;
import android.os.WorkSource;

final class fvpt extends fvpq {
    private final fwyc e;

    public fvpt(Context context0, fvls fvls0, fvlt fvlt0, fybc fybc0, fwyc fwyc0, long v, WifiRttManager wifiRttManager0) {
        super(context0, fvls0, fvlt0, fybc0, v, wifiRttManager0);
        this.e = fwyc0;
    }

    @Override  // fvpq
    public final void g() {
    }

    @Override  // fvpq
    public final void h() {
        WifiScanner wifiScanner0 = (WifiScanner)this.a.getSystemService("wifiscanner");
        fvps fvps0 = new fvps(this);
        WifiScanner.ScanSettings wifiScanner$ScanSettings0 = new WifiScanner.ScanSettings();
        wifiScanner$ScanSettings0.band = 7;
        wifiScanner$ScanSettings0.reportEvents = 3;
        wifiScanner$ScanSettings0.numBssidsPerScan = 100;
        wifiScanner$ScanSettings0.periodInMs = 0;
        fwyc fwyc0 = this.e;
        if((fwyc0 instanceof fyay)) {
            WorkSource workSource0 = ((fyaz)fwyc0).b;
            if(workSource0 != null) {
                wifiScanner0.startScan(wifiScanner$ScanSettings0, fvps0, workSource0);
                return;
            }
            wifiScanner0.startScan(wifiScanner$ScanSettings0, fvps0);
            return;
        }
        wifiScanner0.startScan(wifiScanner$ScanSettings0, fvps0);
    }

    @Override  // fvpq
    public final void o() {
    }
}

