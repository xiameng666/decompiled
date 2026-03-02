import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.reporting.collectors.WifiScanReporter.ScanReceiver;
import java.util.HashSet;
import java.util.Set;

public final class fxqk {
    public static final bboh a;
    public final Set b;
    public final Context c;
    public final bbng d;
    public final Object e;
    public boolean f;
    public fxqj g;
    private WifiScanReporter.ScanReceiver h;

    static {
        fxqk.a = bboh.b("GCoreUlr", bbcu.g);
    }

    public fxqk(Context context0, bbng bbng0) {
        this.b = new HashSet();
        this.e = new Object();
        this.c = context0;
        this.d = bbng0;
    }

    public final void a(fxqj fxqj0) {
        synchronized(this) {
            if(this.f) {
                return;
            }
            this.g = fxqj0;
            if(this.h == null) {
                this.h = new WifiScanReporter.ScanReceiver(this);
                if(bbqa.c()) {
                    WifiScanReporter.ScanReceiver wifiScanReporter$ScanReceiver0 = this.h;
                    IntentFilter intentFilter0 = new IntentFilter("android.net.wifi.SCAN_RESULTS");
                    jwe.b(this.c, wifiScanReporter$ScanReceiver0, intentFilter0, 4);
                }
                else {
                    WifiScanReporter.ScanReceiver wifiScanReporter$ScanReceiver1 = this.h;
                    IntentFilter intentFilter1 = new IntentFilter("android.net.wifi.SCAN_RESULTS");
                    jwe.b(this.c, wifiScanReporter$ScanReceiver1, intentFilter1, 2);
                }
            }
            this.f = true;
        }
    }

    public final void b() {
        synchronized(this) {
            if(!this.f) {
                return;
            }
            Context context0 = this.c;
            fxva.b(context0, "com.google.android.location.reporting.ACTION_WIFI_SCAN_RESULTS").cancel();
            WifiScanReporter.ScanReceiver wifiScanReporter$ScanReceiver0 = this.h;
            if(wifiScanReporter$ScanReceiver0 != null) {
                try {
                    context0.unregisterReceiver(wifiScanReporter$ScanReceiver0);
                }
                catch(IllegalArgumentException unused_ex) {
                    fxqw.f("Try to unregister a  wifi scan reporter receiver before register it!");
                }
                finally {
                    this.h = null;
                }
            }
            synchronized(this.e) {
                this.g = null;
                this.b.clear();
            }
            this.f = false;
        }
    }
}

