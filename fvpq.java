import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager.WifiLock;
import android.net.wifi.WifiManager;
import android.net.wifi.rtt.RangingRequest.Builder;
import android.net.wifi.rtt.RangingRequest;
import android.net.wifi.rtt.WifiRttManager;
import android.os.Build.VERSION;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class fvpq extends fvnr {
    protected final Context a;
    protected final WifiManager b;
    protected final WifiRttManager c;
    final Runnable d;
    private final boolean e;
    private final long f;
    private WifiManager.WifiLock g;

    public fvpq(Context context0, fvls fvls0, fvlt fvlt0, fybc fybc0, long v) {
        super(fvls0, fvlt0, fybc0);
        this.d = new fvpo(this);
        gftb.check(context0);
        this.a = context0;
        this.b = (WifiManager)context0.getSystemService("wifi");
        this.c = null;
        this.f = v;
        this.e = false;
    }

    public fvpq(Context context0, fvls fvls0, fvlt fvlt0, fybc fybc0, long v, WifiRttManager wifiRttManager0) {
        super(fvls0, fvlt0, fybc0);
        this.d = new fvpo(this);
        gftb.check(context0);
        this.a = context0;
        this.b = (WifiManager)context0.getSystemService("wifi");
        this.c = wifiRttManager0;
        this.f = v;
        this.e = huvd.a.f().A();
    }

    protected final void a(boolean z) {
        this.m.removeCallbacks(this.d);
        this.m.postDelayed(this.d, (z ? this.f : Math.max(5000L, this.f)));
    }

    @Override  // fvnr
    protected final void b() {
        WifiManager.WifiLock wifiManager$WifiLock0 = this.b.createWifiLock(2, "WifiScanner");
        this.g = wifiManager$WifiLock0;
        wifiManager$WifiLock0.setReferenceCounted(false);
        this.g.acquire();
        this.g();
        this.n();
    }

    @Override  // fvnr
    protected final void c() {
        try {
            if(this.g != null && this.g.isHeld()) {
                this.g.release();
            }
            this.o();
        }
        catch(IllegalArgumentException unused_ex) {
        }
    }

    protected final void d(long v, List list0) {
        this.e(v, list0, 0L, null);
    }

    protected final void e(long v, List list0, long v1, List list1) {
        synchronized(this) {
            if(list0 != null) {
                fvln fvln0 = new fvln(this.m, v, list0, v1, list1);
                this.m.post(fvln0);
                this.i(fvns.a, v, null);
            }
        }
    }

    public final void f(List list0) {
        int v4;
        long v1;
        int v;
        if(list0 == null) {
            list0 = this.b.getScanResults();
        }
        boolean z = false;
        if(list0 == null) {
            v1 = 0L;
            v = 0;
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(((ScanResult)object0) == null) {
                    iterator0.remove();
                }
            }
            Iterator iterator1 = list0.iterator();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                ScanResult scanResult0 = (ScanResult)object1;
                if(scanResult0 == null || scanResult0.SSID == null) {
                    continue;
                }
                String s = scanResult0.BSSID;
                String s1 = scanResult0.SSID;
                if(s != null && !fpwe.d(s)) {
                    throw new IllegalArgumentException("Invalid MAC Address: " + s);
                }
                if(s1 == null) {
                    throw new IllegalArgumentException("Null SSID.");
                }
                if(!fpwe.b(s1)) {
                    continue;
                }
                iterator1.remove();
                continue;
            }
            v = list0.size();
            v1 = SystemClock.elapsedRealtime();
        }
        if(this.c != null && !list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList(list0);
            Collections.sort(arrayList0, new fvpn());
            ArrayList arrayList1 = new ArrayList();
            for(int v2 = 0; v2 < arrayList0.size() && arrayList1.size() < RangingRequest.getMaxPeers(); ++v2) {
                ScanResult scanResult1 = (ScanResult)arrayList0.get(v2);
                if(scanResult1.is80211mcResponder()) {
                    arrayList1.add(scanResult1);
                }
            }
            if(this.e) {
                v4 = 0;
                for(int v3 = 0; v3 < arrayList0.size() && arrayList1.size() < RangingRequest.getMaxPeers(); ++v3) {
                    ScanResult scanResult2 = (ScanResult)arrayList0.get(v3);
                    if(!scanResult2.is80211mcResponder()) {
                        arrayList1.add(scanResult2);
                        ++v4;
                    }
                }
            }
            else {
                v4 = 0;
            }
            if(!arrayList1.isEmpty()) {
                RangingRequest.Builder rangingRequest$Builder0 = new RangingRequest.Builder();
                int v5 = arrayList1.size();
                int v7 = 0;
                for(int v6 = 0; v6 < v5; ++v6) {
                    ScanResult scanResult3 = (ScanResult)arrayList1.get(v6);
                    if(scanResult3.channelWidth != -1) {
                        try {
                            rangingRequest$Builder0.addAccessPoint(scanResult3);
                            ++v7;
                        }
                        catch(IllegalArgumentException unused_ex) {
                        }
                    }
                }
                if(v7 > 0 && (Build.VERSION.SDK_INT < 33 || cjmf.b(this.a, "android.permission.NEARBY_WIFI_DEVICES") == 0)) {
                    if((((double)(((float)v4) / ((float)v7))) >= huvd.a.f().b()) && RangingRequest.getMinRttBurstSize() <= 2 && RangingRequest.getMaxRttBurstSize() >= 2) {
                        rangingRequest$Builder0.setRttBurstSize(2);
                    }
                    RangingRequest rangingRequest0 = rangingRequest$Builder0.build();
                    Executor executor0 = this.a.getMainExecutor();
                    fvpp fvpp0 = new fvpp(this, v1, list0);
                    this.c.startRanging(rangingRequest0, executor0, fvpp0);
                    return;
                }
            }
        }
        if(v > 0) {
            z = true;
        }
        this.a(z);
        this.d(v1, list0);
    }

    public abstract void g();

    public abstract void h();

    public final void n() {
        this.m.removeCallbacks(this.d);
        this.h();
        this.m.postDelayed(this.d, this.f + 2000L);
    }

    public abstract void o();
}

