import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiAvailableChannel;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiScanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class czkc {
    public static czkc a;
    public final WifiManager b;
    final WifiScanner c;
    public final gfvb d;
    private final Context e;
    private String f;
    private int g;
    private boolean h;

    private czkc(Context context0) {
        WifiManager wifiManager0 = (WifiManager)context0.getSystemService("wifi");
        WifiScanner wifiScanner0 = (WifiScanner)context0.getSystemService(WifiScanner.class);
        super();
        this.h = false;
        this.e = context0;
        this.b = wifiManager0;
        this.c = wifiScanner0;
        gfvh gfvh0 = new gfvh();
        gfvh0.g(hvog.a.bk().dC(), TimeUnit.MINUTES);
        gfvh0.h(6L);
        this.d = gfvh0.b();
        this.f = czmk.l(context0);
    }

    private final gged_interceptors A(int v) {
        if(this.b == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        if(this.u() == 2) {
            arrayList0.addAll(this.B(8, v));
        }
        if(this.t() == 2) {
            arrayList0.addAll(this.B(6, v));
        }
        arrayList0.addAll(this.B(1, v));
        return gged_interceptors.i(arrayList0);
    }

    private final List B(int v, int v1) {
        List list0 = new ArrayList();
        WifiManager wifiManager0 = this.b;
        if(wifiManager0 != null && gxyh.d(this.e)) {
            try {
                for(Object object0: wifiManager0.getUsableChannels(v, v1)) {
                    WifiAvailableChannel wifiAvailableChannel0 = (WifiAvailableChannel)object0;
                    if(!hvol.a.r().S()) {
                    }
                    else if((wifiAvailableChannel0.getOperationalModes() & v1) != v1) {
                        continue;
                    }
                    list0.add(Integer.valueOf(wifiAvailableChannel0.getFrequencyMhz()));
                }
                Collections.shuffle(list0);
            }
            catch(SecurityException securityException0) {
                czkq.a.b().f(securityException0).p("Querying usable channels failed. Is location not enabled?", new Object[0]);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                czkq.a.b().f(illegalArgumentException0).k("Querying usable channels failed because invalid parameter Wi-Fi Band : %s(%d) or OP Mode : %s(%d)", czkc.x(v), Integer.valueOf(v), czkc.w(v1), Integer.valueOf(v1));
            }
            catch(UnsupportedOperationException unused_ex) {
                czkq.a.b().i("Querying usable channels is unsupported on the local device or unsupported on %s of %s.", czkc.x(v), czkc.w(v1));
            }
            return list0;
        }
        return list0;
    }

    private final boolean C() {
        String s = czmk.l(this.e);
        if(s.equals(this.f)) {
            return false;
        }
        this.f = s;
        return true;
    }

    private static final String D(int v) {
        switch(v) {
            case 1: {
                return "STA";
            }
            case 2: {
                return "SAP";
            }
            case 4: {
                return "WFD_GC";
            }
            case 8: {
                return "WFD_GO";
            }
            case 16: {
                return "AWARE";
            }
            case 0x20: {
                return "TDLS";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    public final SharedPreferences a() {
        return this.e.getSharedPreferences("nearbymediums:devicepreference", 0);
    }

    public static czkc b(Context context0) {
        synchronized(czkc.class) {
            if(czkc.a == null) {
                czkc czkc0 = new czkc(context0);
                czkc.a = czkc0;
                czkc0.l();
            }
        }
        return czkc.a;
    }

    public final gged_interceptors c(boolean z) {
        List list1;
        if(gxyh.d(this.e)) {
            WifiScanner wifiScanner0 = this.c;
            if(wifiScanner0 != null) {
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                try {
                    if(this.t() == 2) {
                        if(z) {
                            arrayList1.addAll(wifiScanner0.getAvailableChannels(6));
                        }
                        else {
                            if(hvol.a.r().cz()) {
                                List list0 = wifiScanner0.getAvailableChannels(2);
                                ArrayList arrayList3 = new ArrayList();
                                for(Object object0: list0) {
                                    Integer integer0 = (Integer)object0;
                                    if(!czmk.P(integer0.intValue())) {
                                        arrayList3.add(integer0);
                                    }
                                }
                                list1 = gged_interceptors.i(arrayList3);
                            }
                            else {
                                list1 = wifiScanner0.getAvailableChannels(2);
                            }
                            arrayList1.addAll(list1);
                        }
                        czkq.a.b().h("Query 5G available channels from WifiScanner %s", arrayList1);
                    }
                    arrayList2.addAll(wifiScanner0.getAvailableChannels(1));
                    czkq.a.b().h("Query 2.4G available channels from WifiScanner %s", arrayList2);
                }
                catch(SecurityException unused_ex) {
                    return null;
                }
                Collections.shuffle(arrayList1);
                Collections.shuffle(arrayList2);
                arrayList0.addAll(arrayList1);
                arrayList0.addAll(arrayList2);
                return gged_interceptors.i(arrayList0);
            }
        }
        return null;
    }

    public final gged_interceptors d() {
        return this.c(false);
    }

    public final gged_interceptors e(int v, int v1) {
        WifiManager wifiManager0 = this.b;
        if(wifiManager0 == null) {
            return ggna.a;
        }
        if(gxyh.d(this.e)) {
            try {
                List list0 = wifiManager0.getUsableChannels(v, v1);
                Collections.shuffle(list0);
                return gged_interceptors.i(list0);
            }
            catch(SecurityException securityException0) {
                czkq.a.b().f(securityException0).p("Querying usable channels failed. Is location not enabled?", new Object[0]);
                return ggna.a;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                czkq.a.b().f(illegalArgumentException0).i("Querying usable channels failed because invalid parameter Wi-Fi Band : %s or OP Mode : %d", czkc.x(v), Integer.valueOf(v1));
                return ggna.a;
            }
            catch(UnsupportedOperationException unused_ex) {
                czkq.a.b().i("Querying usable channels is unsupported on the local device or unsupported on band : %s of mode : %d.", czkc.x(v), Integer.valueOf(v1));
                return ggna.a;
            }
        }
        return ggna.a;
    }

    public final gged_interceptors f() {
        if(this.r()) {
            this.d.g();
        }
        return this.z(16);
    }

    public final gged_interceptors g() {
        if(this.r()) {
            this.d.g();
        }
        return this.z(4);
    }

    public final gged_interceptors h() {
        if(this.r()) {
            this.d.g();
        }
        return this.z(8);
    }

    public final gged_interceptors i() {
        if(this.r()) {
            this.d.g();
        }
        return this.z(2);
    }

    public final gged_interceptors j() {
        if(this.r()) {
            this.d.g();
        }
        return this.z(1);
    }

    public final gged_interceptors k() {
        if(this.r()) {
            this.d.g();
        }
        return this.z(0x20);
    }

    public final void l() {
        synchronized(this) {
            try {
                this.n();
                this.o();
            }
            catch(IllegalStateException illegalStateException0) {
                czkq.a.e().f(illegalStateException0).p("Failed to refresh device capabilities!", new Object[0]);
            }
        }
    }

    public final void m() {
        gfvb gfvb0 = this.d;
        gfvb0.g();
        this.f = czmk.l(this.e);
        this.g = dack.a(this.e).a();
        boolean z = this.q();
        if(hvol.aA() && z) {
            gged_interceptors gged0 = gged_interceptors.q(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(8), Integer.valueOf(16), Integer.valueOf(0x20));
            int v = ((ggna)gged0).c;
            int v1 = 0;
            while(v1 < v) {
                int v2 = (int)(((Integer)gged0.get(v1)));
                gged_interceptors gged1 = this.A(v2);
                switch(v2) {
                    case 4: 
                    case 8: {
                        break;
                    }
                    case 16: {
                        v2 = 16;
                        break;
                    }
                    default: {
                        goto label_21;
                    }
                }
                cunf cunf0 = czkq.a.b();
                String s = gged1 == null ? "null" : czmk.y(gged1);
                cunf0.i("[DeviceCapabilities] Refresh cache wifi mode %s channels %s", czkc.D(v2), s);
            label_21:
                Integer integer0 = v2;
                if(gged1 == null) {
                    gged1 = ggna.a;
                }
                gfvb0.h(integer0, gged1);
                ++v1;
            }
            return;
        }
        czkq.a.b().i("[DeviceCapabilities] Skip refreshing cached wifi channels because it is not supported (refreshCacheWifiChannelsRightAfterNetworkCallbackInvoked:%s isWifiGetUsableChannelsSupported:%s)", Boolean.valueOf(hvol.aA()), Boolean.valueOf(z));
    }

    final void n() {
        WifiManager wifiManager0 = this.b;
        if(wifiManager0 != null && wifiManager0.isWifiEnabled()) {
            this.v("is_5g_band_supported", (wifiManager0.is5GHzBandSupported() ? 2 : 3));
        }
    }

    final void o() {
        WifiManager wifiManager0 = this.b;
        if(wifiManager0 != null && wifiManager0.isWifiEnabled()) {
            this.v("is_6g_band_supported", (wifiManager0.is6GHzBandSupported() ? 2 : 3));
        }
    }

    public final void p(boolean z) {
        this.a().edit().putBoolean("is_wifi_auto_selection_stopped", z).apply();
    }

    public final boolean q() {
        return !hvol.aA() || !this.h ? this.y(this.b, 4) : true;
    }

    public final boolean r() {
        if(hvol.aA()) {
            return this.C();
        }
        if(!this.C()) {
            int v = dack.a(this.e).a();
            if(v == this.g) {
                return false;
            }
            this.g = v;
        }
        return true;
    }

    final int s(String s) {
        switch(this.a().getString(s, "UNKNOWN")) {
            case "SUPPORTED": {
                return 2;
            }
            case "UNKNOWN": {
                return 1;
            }
            case "UNSUPPORTED": {
                return 3;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    public final int t() {
        int v1;
        synchronized(this) {
            if(this.s("is_5g_band_supported") == 1) {
                this.n();
            }
            v1 = this.s("is_5g_band_supported");
        }
        return v1;
    }

    public final int u() {
        int v1;
        synchronized(this) {
            if(this.s("is_6g_band_supported") == 1) {
                this.o();
            }
            v1 = this.s("is_6g_band_supported");
        }
        return v1;
    }

    final void v(String s, int v) {
        this.a().edit().putString(s, (v == 2 ? "SUPPORTED" : "UNSUPPORTED")).apply();
    }

    static final String w(int v) {
        switch(v) {
            case 1: {
                return "OP_MODE_STA";
            }
            case 2: {
                return "OP_MODE_SAP";
            }
            case 4: {
                return "OP_MODE_WIFI_DIRECT_CLI";
            }
            case 8: {
                return "OP_MODE_WIFI_DIRECT_GO";
            }
            case 16: {
                return "OP_MODE_WIFI_AWARE";
            }
            case 0x20: {
                return "OP_MODE_TDLS";
            }
            default: {
                return a.f(v, "UNKNOWN_OP_MODE(", ")");
            }
        }
    }

    static final String x(int v) {
        switch(v) {
            case 1: {
                return "WIFI_BAND_24_GHZ";
            }
            case 2: {
                return "WIFI_BAND_5_GHZ";
            }
            case 6: {
                return "WIFI_BAND_5_GHZ_WITH_DFS";
            }
            case 7: {
                return "WIFI_BAND_BOTH_WITH_DFS";
            }
            case 8: {
                return "WIFI_BAND_6_GHZ";
            }
            case 15: {
                return "WIFI_BAND_24_5_WITH_DFS_6_GHZ";
            }
            default: {
                return a.f(v, "UNKNOWN_WIFI_BAND(", ")");
            }
        }
    }

    public final boolean y(WifiManager wifiManager0, int v) {
        if(wifiManager0 == null) {
            czkq.a.b().i("%s In isGetUsableChannelsSupported(), platform version is lower than S or WifiManager is null (WifiManager is actually %s)", "[DeviceCapabilities]", "null");
            return false;
        }
        try {
            wifiManager0.getUsableChannels(1, v);
            this.h = true;
            return true;
        }
        catch(SecurityException | IllegalArgumentException | UnsupportedOperationException exception0) {
            czkq.a.b().f(exception0).p("Querying wifi usable channels failed with exception", new Object[0]);
            return false;
        }
    }

    private final gged_interceptors z(int v) {
        boolean z;
        gfvb gfvb0 = this.d;
        Integer integer0 = v;
        gged_interceptors gged0 = (gged_interceptors)gfvb0.d(integer0);
        if(gged0 == null) {
            gged_interceptors gged1 = this.A(v);
            if(gged1 == null) {
                gged1 = ggna.a;
            }
            gged0 = gged1;
            gfvb0.h(integer0, gged0);
            z = true;
        }
        else {
            z = false;
        }
        czkq.a.b().j("[DeviceCapabilities] Get wifi usable channels from cache for mode %s (tryToRefreshCache:%s channels:%s)", czkc.D(v), Boolean.valueOf(z), czmk.y(gged0));
        return gged0;
    }
}

