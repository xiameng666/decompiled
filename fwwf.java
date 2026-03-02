import android.content.Context;
import android.net.wifi.ScanResult;
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

final class fwwf implements fwvz {
    private final Context a;
    private final Executor b;
    private final fwep c;
    private final WifiRttManager d;
    private final fwvz e;
    private final fvwz f;

    public fwwf(Context context0, WifiRttManager wifiRttManager0, fwep fwep0, fwvz fwvz0, fvwz fvwz0, Executor executor0) {
        this.a = context0;
        this.d = wifiRttManager0;
        this.e = fwvz0;
        this.f = fvwz0;
        this.c = fwep0;
        this.b = executor0;
    }

    @Override  // fwvz
    public final void a(int v, List list0, fvvg[] arr_fvvg, int v1, int v2, int v3, int v4) {
        RangingRequest rangingRequest0;
        List list1 = new ArrayList();
        for(Object object0: list0) {
            fwvy[] arr_fwvy = (fwvy[])object0;
            for(int v5 = 0; v5 < arr_fwvy.length; ++v5) {
                fwvy fwvy0 = arr_fwvy[v5];
                if(fwvy0 != null) {
                    ScanResult scanResult0 = fwvy0.h;
                    if(scanResult0 != null && fwvy0.e) {
                        list1.add(scanResult0);
                    }
                }
            }
        }
        fwep fwep0 = this.c;
        if(fwep0 != null && (huvd.a.f().m() & 2L) != 0L) {
            list1 = fwep0.c(list1, SystemClock.elapsedRealtime());
        }
        else {
            int v6 = RangingRequest.getMaxPeers();
            int v7 = list1.size();
            Collections.sort(list1, new fwwd());
            if(v7 > v6) {
                list1.subList(v6, v7).clear();
            }
        }
        if(!list1.isEmpty()) {
            int v8 = RangingRequest.getMaxPeers();
            RangingRequest.Builder rangingRequest$Builder0 = new RangingRequest.Builder();
            Iterator iterator1 = list1.iterator();
            while(true) {
                if(!iterator1.hasNext()) {
                    rangingRequest0 = rangingRequest$Builder0.build();
                    break;
                }
                Object object1 = iterator1.next();
                ScanResult scanResult1 = (ScanResult)object1;
                if(v8 == 0) {
                    rangingRequest0 = rangingRequest$Builder0.build();
                    break;
                }
                try {
                    rangingRequest$Builder0.addAccessPoint(scanResult1);
                }
                catch(IllegalArgumentException unused_ex) {
                }
                --v8;
            }
            try {
                if(Build.VERSION.SDK_INT < 33 || cjmf.b(this.a, "android.permission.NEARBY_WIFI_DEVICES") == 0) {
                    this.d.startRanging(rangingRequest0, this.b, new fwwe(this.e, v, list0, this.f, list1.size(), v1, v4));
                }
            }
            catch(IllegalArgumentException unused_ex) {
                this.e.a(v, list0, null, v1, 0, -1, v4);
            }
            return;
        }
        this.e.a(v, list0, null, v1, 0, -1, v4);
    }
}

