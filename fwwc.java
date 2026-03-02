import android.content.Context;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiScanner.ScanSettings;
import android.net.wifi.WifiScanner;
import android.os.WorkSource;
import java.util.concurrent.Executor;

public class fwwc extends fwwa {
    public fwwc() {
    }

    public fwwc(byte[] arr_b) {
    }

    @Override  // fwwn
    public void e(Context context0, fwvz fwvz0, boolean z, fwyc fwyc0, fvwz fvwz0, Executor executor0) {
        WifiScanner wifiScanner0 = (WifiScanner)context0.getSystemService("wifiscanner");
        if(wifiScanner0 == null) {
            WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
            if((fwyc0 instanceof fyay)) {
                WorkSource workSource0 = ((fyay)fwyc0).d();
                try {
                    if(workSource0 == null) {
                        wifiManager0.startScan();
                    }
                    else {
                        wifiManager0.startScan(workSource0);
                    }
                }
                catch(Exception unused_ex) {
                    goto label_10;
                }
            }
            else {
                try {
                label_10:
                    wifiManager0.startScan();
                }
                catch(NullPointerException unused_ex) {
                }
            }
            this.c();
            return;
        }
        WifiScanner.ScanSettings wifiScanner$ScanSettings0 = this.a(z, context0);
        fwws fwws0 = new fwws(fwvz0, wifiScanner$ScanSettings0.band);
        try {
            if((fwyc0 instanceof fyay)) {
                WorkSource workSource1 = ((fyay)fwyc0).d();
                if(workSource1 == null) {
                    wifiScanner0.startScan(wifiScanner$ScanSettings0, fwws0);
                }
                else {
                    wifiScanner0.startScan(wifiScanner$ScanSettings0, fwws0, workSource1);
                }
            }
            else {
                wifiScanner0.startScan(wifiScanner$ScanSettings0, fwws0);
            }
        }
        catch(IllegalStateException unused_ex) {
            executor0.execute(new fwwb(fwws0));
        }
        super.c();
    }
}

