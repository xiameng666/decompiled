import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.smartdevice.utils.wifi.WifiDiscoveryManager.WifiScanResultsReceiver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public final class erqq {
    public final Handler a;
    public final Runnable b;
    public final WifiManager c;
    private final Context d;
    private final Pattern e;
    private final erqp f;
    private BroadcastReceiver g;
    private final Set h;

    public erqq(Context context0, Pattern pattern0, erqp erqp0) {
        WifiManager wifiManager0 = erqr.b(context0);
        super();
        this.a = hygl.a.d().l() ? new clht(Looper.getMainLooper()) : new clht();
        this.b = new erqo(this);
        this.h = new HashSet();
        batl.s(context0);
        this.d = context0;
        batl.s(pattern0);
        this.e = pattern0;
        this.f = erqp0;
        batl.s(wifiManager0);
        this.c = wifiManager0;
    }

    public final void a() {
        synchronized(this) {
            if(this.d()) {
                return;
            }
            this.c(this.c.getScanResults());
            WifiDiscoveryManager.WifiScanResultsReceiver wifiDiscoveryManager$WifiScanResultsReceiver0 = new WifiDiscoveryManager.WifiScanResultsReceiver(this);
            this.g = wifiDiscoveryManager$WifiScanResultsReceiver0;
            IntentFilter intentFilter0 = new IntentFilter("android.net.wifi.SCAN_RESULTS");
            jwe.b(this.d, wifiDiscoveryManager$WifiScanResultsReceiver0, intentFilter0, 2);
            this.a.post(this.b);
        }
    }

    public final void b() {
        synchronized(this) {
            if(!this.d()) {
                return;
            }
            BroadcastReceiver broadcastReceiver0 = this.g;
            if(broadcastReceiver0 != null) {
                this.d.unregisterReceiver(broadcastReceiver0);
                this.g = null;
            }
            this.a.removeCallbacksAndMessages(this.b);
            this.h.clear();
        }
    }

    public final void c(List list0) {
        synchronized(this) {
            HashMap hashMap0 = new HashMap();
            if(list0 != null) {
                for(Object object0: list0) {
                    ScanResult scanResult0 = (ScanResult)object0;
                    if(this.e.matcher(scanResult0.SSID).matches()) {
                        hashMap0.put(scanResult0.SSID, scanResult0);
                    }
                }
            }
            Set set0 = hashMap0.keySet();
            Set set1 = this.h;
            Set set2 = bajm.a(set0, set1);
            Set set3 = bajm.a(hashMap0.keySet(), set2);
            Set set4 = bajm.a(set1, hashMap0.keySet());
            if(!set2.isEmpty()) {
                HashSet hashSet0 = new HashSet();
                for(Object object1: set2) {
                    ScanResult scanResult1 = (ScanResult)hashMap0.get(((String)object1));
                    if(scanResult1 != null) {
                        hashSet0.add(scanResult1);
                    }
                }
                this.f.r(hashSet0);
            }
            if(!set3.isEmpty()) {
                HashSet hashSet1 = new HashSet();
                for(Object object2: set3) {
                    ScanResult scanResult2 = (ScanResult)hashMap0.get(((String)object2));
                    if(scanResult2 != null) {
                        hashSet1.add(scanResult2);
                    }
                }
                this.f.t(hashSet1);
            }
            if(!set4.isEmpty()) {
                this.f.s(set4);
            }
            set1.addAll(set2);
            set1.removeAll(set4);
        }
    }

    public final boolean d() {
        synchronized(this) {
        }
        return this.g != null;
    }
}

