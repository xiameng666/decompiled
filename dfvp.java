import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.ParcelUuid;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.UwbRangingData;
import com.google.android.gms.nearby.connection.UwbSenderInfo;
import com.google.android.gms.nearby.sharing.RangingData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class dfvp implements dfsj {
    final ScheduledExecutorService a;
    final Map b;
    final Map c;
    final Map d;
    final gmcq e;
    public final Map f;
    final cuvg g;
    final cuus h;
    final cuwp i;
    final cuwv j;
    public static final int k;
    private static final Strategy l;
    private static final ParcelUuid m;
    private final Context n;
    private cuvm o;
    private final ConnectivityManager p;
    private final ExecutorService q;
    private final LinkedHashMap r;
    private dfsq s;
    private final Map t;
    private final Map u;
    private final Map v;
    private final Map w;
    private czly x;
    private dfzz y;
    private dfzz z;

    static {
        dfvp.l = Strategy.c;
        dfvp.m = cutq.a("FEF3");
    }

    public dfvp(Context context0) {
        this.q = cuui.d();
        this.a = cuui.f();
        this.r = new LinkedHashMap();
        this.b = new bxd();
        this.t = new bxd();
        this.u = new bxd();
        this.c = new bxd();
        this.d = new bxd();
        this.v = new bxd();
        this.w = new bxd();
        this.e = gmcq.b(hvqs.b());
        this.f = new bxd();
        this.g = new dfux(this);
        this.h = new dfvc(this);
        this.i = new dfvg(this);
        this.j = new dfvj(this);
        this.n = context0;
        this.p = (ConnectivityManager)context0.getSystemService("connectivity");
    }

    // Detected as a lambda impl.
    public final void A(String s, cuwu cuwu0, dfvm dfvm0) {
        synchronized(this) {
            this.v(cuwu0.i, dfvm0);
            this.R().k(s, cuwu0).A(new dfuq());
        }
    }

    public final void B() {
        synchronized(this) {
            this.S();
            cuui.h(this.a, "NearbyConnectionsManagerAlarmExecutor");
            cuui.h(this.q, "NearbyConnectionsManagerExecutor");
        }
    }

    public final void C() {
        synchronized(this) {
            this.R().s();
            this.z = null;
        }
    }

    public final void D() {
        synchronized(this) {
            this.R().u();
            this.r.clear();
            this.y = null;
            this.s = null;
        }
    }

    final boolean E() {
        synchronized(this) {
        }
        return !this.u.isEmpty();
    }

    public final boolean F(String s) {
        cuvf cuvf0;
        synchronized(this) {
            cuvf0 = (cuvf)this.d.get(s);
            if(cuvf0 == null) {
                return false;
            }
        }
        return cuvf0.e;
    }

    public final byte[] G(String s) {
        cuvf cuvf0;
        synchronized(this) {
            cuvf0 = (cuvf)this.d.get(s);
            if(cuvf0 == null) {
                return null;
            }
        }
        return cuvf0.c;
    }

    public final dfum H(byte[] arr_b, String s, byte[] arr_b1, int v, int v1, boolean z) {
        gmcu gmcu0;
        ConnectionOptions connectionOptions0 = new ConnectionOptions();
        cuvj.a(connectionOptions0);
        connectionOptions0.l = v1 != 2;
        ArrayList arrayList0 = new ArrayList(hvqs.aL().b);
        ArrayList arrayList1 = new ArrayList();
        if(hvqz.B()) {
            arrayList1.addAll(new ArrayList(hvqs.aN().b));
        }
        Integer integer0 = (int)11;
        if(arrayList0.contains(integer0)) {
            arrayList1.add(integer0);
        }
        Integer integer1 = (int)5;
        if(arrayList0.contains(integer1) && z) {
            arrayList1.add(integer1);
        }
        Integer integer2 = (int)6;
        if(arrayList0.contains(integer2) && !arrayList1.contains(integer2)) {
            arrayList1.add(integer2);
        }
        Integer integer3 = (int)9;
        if(arrayList0.contains(integer3) && this.aa(v, dftl.c, 3)) {
            arrayList1.add(integer3);
        }
        Integer integer4 = (int)10;
        if(arrayList0.contains(integer4)) {
            arrayList1.add(integer4);
        }
        Integer integer5 = (int)2;
        if(arrayList0.contains(integer5)) {
            arrayList1.add(integer5);
        }
        Integer integer6 = (int)4;
        if(arrayList0.contains(integer6)) {
            arrayList1.add(integer6);
        }
        Integer integer7 = (int)7;
        if(arrayList0.contains(integer7)) {
            arrayList1.add(integer7);
        }
        connectionOptions0.p = bbmt.g(arrayList1);
        ArrayList arrayList2 = new ArrayList(hvog.bf().b);
        if(!this.aa(v, dftl.c, 3) && arrayList2.contains(integer3)) {
            arrayList2.remove(arrayList2.indexOf(integer3));
        }
        if(hvqz.af() && !arrayList2.contains(integer3) && v != 1) {
            arrayList2.add(Integer.valueOf(12));
        }
        connectionOptions0.o = bbmt.g(arrayList2);
        if(arr_b1 != null && arr_b1.length == 6) {
            connectionOptions0.i = arr_b1;
        }
        synchronized(this) {
            gmcu0 = (gmcu)this.b.get(s);
        }
        if(gmcu0 == null) {
            synchronized(this) {
                gmcu0 = new gmcu();
                this.b.put(s, gmcu0);
            }
            cuvm cuvm0 = this.R();
            cuvj.b(connectionOptions0);
            int v2 = cuuc.c("requestConnection", cuvm0.i(arr_b, s, this.g, connectionOptions0), hvqs.o());
            synchronized(this) {
                if(v2 != 0) {
                    dcvz.a.e().h("Failed to connect to the remote shareTarget: %s", cuvu.a(v2));
                    this.R().r(s);
                    this.b.remove(s);
                    return null;
                }
                goto label_70;
            }
            return null;
        }
    label_70:
        synchronized(this) {
            if(v1 == 3) {
                dcvz.a.d().h("Payloads sent to endpoint %s requires high quality mediums", s);
                dfvo dfvo0 = new dfvo(s);
                this.v.put(s, dfvo0);
            }
        }
        dcvz.a.b().h("Connecting to remote %s priority", (z ? "with" : "without"));
        return (dfum)cuuc.h("connect", gmcu0, hvqs.r());
    }

    public final int I(byte[] arr_b, dfzz dfzz0, dfso dfso0) {
        int v4;
        synchronized(this) {
            this.z = dfzz0;
            int v1 = dgag.b(arr_b.length) ^ 1;
            dftl dftl0 = dfso0.a;
            int v2 = dfvp.O(dftl0);
            if(v2 == 0) {
                dcvz.a.e().h("Failed to advertise due to mode:  %s", dftl0);
                return 13;
            }
            if(hvol.ah()) {
                cuvm cuvm0 = this.R();
                AdvertisingOptions advertisingOptions0 = this.Q(dfso0, ((boolean)v1), dftl0, v2);
                czdm czdm0 = new czdm(((czdu)cuvm0), this.h);
                azyf azyf0 = ((czdu)cuvm0).a.a(((azts)cuvm0), new Object(), "advertising");
                cyyf cyyf0 = ((czdu)cuvm0).a;
                azyq azyq0 = new azyq();
                azyq0.c = azyf0;
                azyq0.d = new Feature[]{cumh.f};
                azyq0.a = new czbu(((czdu)cuvm0), arr_b, ((azts)cuvm0).iD(czdm0, cuus.class.getName()), advertisingOptions0);
                azyq0.b = new czbv();
                azyq0.e = 0x4F2;
                return cuuc.c("startAdvertising", cyyf0.c(((azts)cuvm0), azyq0.a()), hvqs.r());
            }
            cuvm cuvm1 = this.R();
            AdvertisingOptions advertisingOptions1 = this.Q(dfso0, ((boolean)v1), dftl0, v2);
            v4 = cuuc.c("startAdvertising", cuvm1.n(arr_b, "NearbySharing", this.g, advertisingOptions1), hvqs.r());
        }
        return v4;
    }

    public final int J(dfzz dfzz0, dfsq dfsq0) {
        int v1;
        synchronized(this) {
            this.y = dfzz0;
            this.s = dfsq0;
            cuvm cuvm0 = this.R();
            DiscoveryOptions discoveryOptions0 = dfvp.Y(dfsq0);
            v1 = cuuc.c("startDiscovery", cuvm0.o("NearbySharing", this.i, discoveryOptions0), hvqs.r());
        }
        return v1;
    }

    public final int K(dfzz dfzz0, dfsq dfsq0) {
        int v1;
        synchronized(this) {
            this.y = dfzz0;
            this.s = dfsq0;
            cuvm cuvm0 = this.R();
            DiscoveryOptions discoveryOptions0 = dfvp.V(dfsq0);
            v1 = cuuc.c("startDiscovery", cuvm0.o("NearbySharing", this.i, discoveryOptions0), hvqs.r());
        }
        return v1;
    }

    public final int L(dfzz dfzz0, dfsq dfsq0) {
        int v1;
        synchronized(this) {
            this.y = dfzz0;
            this.s = dfsq0;
            cuvm cuvm0 = this.R();
            DiscoveryOptions discoveryOptions0 = dfvp.Z(dfsq0);
            v1 = cuuc.c("startDiscovery", cuvm0.o("NearbySharing", this.i, discoveryOptions0), hvqs.r());
        }
        return v1;
    }

    public final int M(byte[] arr_b, dfzz dfzz0, dfso dfso0) {
        int v3;
        synchronized(this) {
            this.z = dfzz0;
            int v1 = dgag.b(arr_b.length) ^ 1;
            dftl dftl0 = dfso0.a;
            int v2 = dfvp.O(dftl0);
            if(v2 == 0) {
                dcvz.a.e().h("Failed to advertise due to mode:  %s", dftl0);
                return 13;
            }
            v3 = cuuc.c("updateAdvertisingOptions", this.R().w(arr_b, this.Q(dfso0, ((boolean)v1), dftl0, v2)), hvqs.r());
        }
        return v3;
    }

    final void N(long v) {
        long v2;
        synchronized(this) {
            Long long0 = v;
            dfvm dfvm0 = (dfvm)this.t.get(long0);
            if(dfvm0 == null) {
                v2 = v;
            }
            else {
                v2 = v;
                dfvm0.a(v2, 0L, dfvl.e);
            }
            dcvz.a.b().h("Cancelling payload %s", long0);
            cuuc.c("cancelPayload", this.R().d(v2), hvqs.r());
        }
    }

    public static int O(dftl dftl0) {
        int v = dftl0.ordinal();
        switch(v) {
            case 0: {
                return (int)hvqs.Y();
            }
            case 1: {
                return (int)hvqs.Z();
            }
            case 2: {
                return 3;
            }
            case 3: {
                return (int)hvqs.aa();
            }
            default: {
                if(v == 4) {
                    return (int)hvqs.ab();
                }
                throw new RuntimeException(null, null);
            }
        }
    }

    public final void P(String s) {
        synchronized(this) {
            cuuc.c("initiateBandwidthUpgrade", this.R().e(s), hvqs.r());
        }
    }

    private final AdvertisingOptions Q(dfso dfso0, boolean z, dftl dftl0, int v) {
        String s1;
        String s;
        ArrayList arrayList1;
        int v1 = z || dftl0 != dftl.b ? v : 1;
        ArrayList arrayList0 = new ArrayList();
        dftl dftl1 = dfso0.a;
        if(hvqz.B() && dftl1 != dftl.d && djbz.h(this.n)) {
            arrayList0.addAll(new ArrayList(hvqs.aN().b));
        }
        int v2 = dftl1.ordinal();
        switch(v2) {
            case 0: {
                arrayList1 = new ArrayList(hvqs.aH().b);
                break;
            }
            case 1: {
                arrayList1 = new ArrayList(hvqs.aI().b);
                break;
            }
            case 2: {
                arrayList1 = new ArrayList(hvqs.aG().b);
                break;
            }
            case 3: {
                arrayList1 = new ArrayList(hvqs.aJ().b);
                break;
            }
            default: {
                if(v2 != 4) {
                    throw new RuntimeException(null, null);
                }
                arrayList1 = new ArrayList(hvqs.aK().b);
                break;
            }
        }
        for(Object object0: arrayList1) {
            Integer integer0 = (Integer)object0;
            if(!arrayList0.contains(integer0)) {
                arrayList0.add(integer0);
            }
        }
        dftl dftl2 = dftl.c;
        if(dftl1 != dftl2 && hvqz.a.b().aL() && !djbz.h(this.n)) {
            arrayList0.removeAll(Arrays.asList(new Integer[]{((int)5), ((int)6)}));
        }
        if(!dfso0.f) {
            arrayList0.removeAll(Arrays.asList(new Integer[]{((int)2)}));
        }
        int v3 = dfso0.b;
        if(!this.X(v3)) {
            arrayList0.removeAll(Arrays.asList(new Integer[]{((int)9)}));
        }
        int[] arr_v = bbmt.g(arrayList0);
        AdvertisingOptions advertisingOptions0 = new AdvertisingOptions();
        advertisingOptions0.a = dfvp.l;
        cuut.c(advertisingOptions0);
        advertisingOptions0.l = true;
        advertisingOptions0.r = dfso0.c;
        advertisingOptions0.w = dfso0.g;
        cuut.a(advertisingOptions0);
        advertisingOptions0.x = arr_v;
        ArrayList arrayList2 = new ArrayList(hvog.bf().b);
        if(!(hvqz.a.b().ay() ? this.X(v3) : this.aa(v3, dftl1, v1))) {
            Integer integer1 = (int)9;
            if(arrayList2.contains(integer1)) {
                arrayList2.remove(arrayList2.indexOf(integer1));
            }
        }
        if(hvqz.af() && !arrayList2.contains(Integer.valueOf(9)) && v3 != 1) {
            arrayList2.add(Integer.valueOf(12));
        }
        advertisingOptions0.y = bbmt.g(arrayList2);
        advertisingOptions0.F = hvqz.N();
        advertisingOptions0.G = hvqz.O();
        advertisingOptions0.H = dfso0.i;
        int v4 = 0;
        if(hvqz.I()) {
            advertisingOptions0.A = v;
            boolean z1 = dfso0.h;
            advertisingOptions0.C = z1;
            cunf cunf0 = dcvz.a.b();
            switch(v) {
                case -1: {
                    s = "ULTRA_LOW_POWER";
                    break;
                }
                case 0: {
                    s = "UNSPECIFIED";
                    break;
                }
                case 1: {
                    s = "LOW_POWER";
                    break;
                }
                case 2: {
                    s = "BALANCED_POWER";
                    break;
                }
                case 3: {
                    s = "HIGH_POWER";
                    break;
                }
                default: {
                    s = a.f(v, "UNKNOWN[", "]");
                }
            }
            Boolean boolean0 = Boolean.valueOf(z1);
            StringBuilder stringBuilder0 = new StringBuilder("[");
            while(v4 < arr_v.length) {
                int v5 = arr_v[v4];
                if(stringBuilder0.length() > 2) {
                    stringBuilder0.append(", ");
                }
                switch(v5) {
                    case 2: {
                        s1 = "BLUETOOTH";
                        break;
                    }
                    case 3: {
                        s1 = "WIFI_HOTSPOT";
                        break;
                    }
                    case 4: {
                        s1 = "BLE";
                        break;
                    }
                    case 5: {
                        s1 = "WIFI_LAN";
                        break;
                    }
                    case 6: {
                        s1 = "WIFI_AWARE";
                        break;
                    }
                    case 7: {
                        s1 = "NFC";
                        break;
                    }
                    case 8: {
                        s1 = "WIFI_DIRECT";
                        break;
                    }
                    case 9: {
                        s1 = "WEB_RTC";
                        break;
                    }
                    case 10: {
                        s1 = "BLE_L2CAP";
                        break;
                    }
                    case 11: {
                        s1 = "USB";
                        break;
                    }
                    default: {
                        s1 = a.f(v5, "UNKNOWN[", "]");
                    }
                }
                stringBuilder0.append(s1);
                ++v4;
                arr_v = arr_v;
            }
            stringBuilder0.append("]");
            cunf0.j("Started advertising with power level = %s and isAllowGattConnections = %s and advertising mediums %s.", s, boolean0, stringBuilder0.toString());
        }
        else {
            dcvz.a.b().p("Started advertising.", new Object[0]);
        }
        if(!z) {
            advertisingOptions0.h = dfvp.m;
        }
        UwbSenderInfo[] arr_uwbSenderInfo = dfso0.d;
        if(this.x == null) {
            this.x = new czly(this.n);
        }
        if(this.x.j() && dftl0 == dftl2) {
            cuut.b(advertisingOptions0);
            if(arr_uwbSenderInfo != null) {
                advertisingOptions0.s = arr_uwbSenderInfo;
            }
        }
        cuut.d(advertisingOptions0);
        return advertisingOptions0;
    }

    private final cuvm R() {
        if(this.o == null) {
            cuvs cuvs0 = new cuvs();
            cuvs0.a = "nearby.sharing";
            cuvt cuvt0 = new cuvt(cuvs0);
            this.o = cumi.a(this.n, cuvt0);
        }
        return this.o;
    }

    private final void S() {
        cuvm cuvm0 = this.o;
        if(cuvm0 != null) {
            cuvm0.t();
        }
        this.r.clear();
        this.b.clear();
        this.t.clear();
        this.j();
        this.c.clear();
        this.d.clear();
        this.w.clear();
        Map map0 = this.v;
        for(Object object0: map0.values()) {
            ((dfvo)object0).a();
        }
        map0.clear();
        this.y = null;
        this.s = null;
        this.z = null;
    }

    private final void T(String s, cuvf cuvf0, cuvl cuvl0) {
        synchronized(this) {
            if(!cuvl0.a.e()) {
                return;
            }
            dfzz dfzz0 = this.z;
            if(dfzz0 == null) {
                this.k(s);
                return;
            }
            Map map0 = this.c;
            if(((bzs)map0).d_num == 1) {
                dcvz.a.e().h("Ignoring incoming connection for endpoint %s because we can\'t accept extra incoming connection.", s);
                this.k(s);
                return;
            }
            dfum dfum0 = new dfum(this.n, this, s);
            map0.put(s, dfum0);
            dfzz0.aU(new dfxp(dfzz0, cuvf0.f, dfum0, s));
        }
    }

    private final void U(String s, cuvl cuvl0) {
        synchronized(this) {
            Map map0 = this.b;
            if(!map0.containsKey(s)) {
                this.k(s);
                return;
            }
            gmcu gmcu0 = (gmcu)map0.remove(s);
            if(gmcu0 == null) {
                return;
            }
            if(!cuvl0.a.e()) {
                gmcu0.r(new Exception("Failed to connect."));
                return;
            }
            dfum dfum0 = new dfum(this.n, this, s);
            this.c.put(s, dfum0);
            gmcu0.q(dfum0);
        }
    }

    private static final DiscoveryOptions V(dfsq dfsq0) {
        cuwm cuwm0 = new cuwm();
        cuwm0.j(dfvp.l);
        cuwm0.g(dfvp.m);
        cuwm0.h(dfsq0.e);
        ArrayList arrayList0 = new ArrayList(hvqs.aM().b);
        ArrayList arrayList1 = new ArrayList();
        Integer integer0 = (int)11;
        if(arrayList0.contains(integer0)) {
            arrayList1.add(integer0);
        }
        Integer integer1 = (int)5;
        if(arrayList0.contains(integer1)) {
            arrayList1.add(integer1);
        }
        Integer integer2 = (int)6;
        if(arrayList0.contains(integer2)) {
            arrayList1.add(integer2);
        }
        Integer integer3 = (int)2;
        if(arrayList0.contains(integer3) && dfsq0.h) {
            arrayList1.add(integer3);
        }
        Integer integer4 = (int)4;
        if(arrayList0.contains(integer4)) {
            arrayList1.add(integer4);
        }
        Integer integer5 = (int)7;
        if(arrayList0.contains(integer5)) {
            arrayList1.add(integer5);
        }
        cuwm0.e(bbmt.g(arrayList1));
        cuwm0.b(hvqz.N());
        cuwm0.d(hvqz.O());
        if(dfsq0.b()) {
            cuwm0.f(true);
            cuwm0.l(dfsq0.c);
            cuwm0.m(dfsq0.d);
            cuwm0.k(dfsq0.g);
        }
        return cuwm0.a();
    }

    private static final int[] W(dfsq dfsq0) {
        ArrayList arrayList0 = new ArrayList(hvqs.aO().b);
        ArrayList arrayList1 = new ArrayList();
        Integer integer0 = (int)11;
        if(arrayList0.contains(integer0)) {
            arrayList1.add(integer0);
        }
        Integer integer1 = (int)5;
        if(arrayList0.contains(integer1)) {
            arrayList1.add(integer1);
        }
        Integer integer2 = (int)6;
        if(arrayList0.contains(integer2)) {
            arrayList1.add(integer2);
        }
        Integer integer3 = (int)2;
        if(arrayList0.contains(integer3) && dfsq0.h) {
            arrayList1.add(integer3);
        }
        Integer integer4 = (int)4;
        if(arrayList0.contains(integer4)) {
            arrayList1.add(integer4);
        }
        Integer integer5 = (int)7;
        if(arrayList0.contains(integer5)) {
            arrayList1.add(integer5);
        }
        return bbmt.g(arrayList1);
    }

    private final boolean X(int v) {
        if(v == 1) {
            return false;
        }
        ConnectivityManager connectivityManager0 = this.p;
        Network network0 = connectivityManager0.getActiveNetwork();
        if(network0 == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(network0);
        if(networkCapabilities0 == null) {
            return false;
        }
        if(!networkCapabilities0.hasCapability(13) && !networkCapabilities0.hasCapability(19)) {
            return false;
        }
        if(networkCapabilities0.hasCapability(12) && networkCapabilities0.hasCapability(16) && networkCapabilities0.hasCapability(20)) {
            return v == 3 ? networkCapabilities0.hasCapability(11) : true;
        }
        return false;
    }

    private static final DiscoveryOptions Y(dfsq dfsq0) {
        cuwm cuwm0 = new cuwm();
        cuwm0.j(dfvp.l);
        cuwm0.g(dfvp.m);
        cuwm0.h(dfsq0.e);
        cuwm0.e(dfvp.W(dfsq0));
        cuwm0.b(hvqz.N());
        cuwm0.d(hvqz.O());
        cuwm0.i(((int)hvqs.Y()));
        cuwm0.f(false);
        cuwm0.c(false);
        return cuwm0.a();
    }

    private static final DiscoveryOptions Z(dfsq dfsq0) {
        cuwm cuwm0 = new cuwm();
        cuwm0.j(dfvp.l);
        cuwm0.g(dfvp.m);
        cuwm0.h(dfsq0.e);
        cuwm0.e(dfvp.W(dfsq0));
        cuwm0.b(hvqz.N());
        cuwm0.d(hvqz.O());
        cuwm0.i(((int)hvqs.Y()));
        if(dfsq0.b()) {
            cuwm0.f(true);
            cuwm0.l(dfsq0.c);
            cuwm0.m(dfsq0.d);
            cuwm0.k(dfsq0.g);
        }
        return cuwm0.a();
    }

    @Override  // dfsj
    public final void a(String s) {
        this.R().l(s).A(new dfur(s));
    }

    private final boolean aa(int v, dftl dftl0, int v1) {
        return v1 <= 1 || dftl0 == dftl.a || dftl0 == dftl.d ? false : this.X(v);
    }

    public final int b(dfsq dfsq0) {
        synchronized(this) {
            this.s = dfsq0;
            if(this.y != null) {
                return cuuc.c("updateDiscoveryOptions", this.R().x(dfvp.Y(dfsq0)), hvqs.r());
            }
            dcvz.a.e().p("Ignored transition to non interruptive discovery", new Object[0]);
        }
        return 13;
    }

    public final int c() {
        synchronized(this) {
            dfsq dfsq0 = this.s;
            if(this.y != null && dfsq0 != null) {
                return cuuc.c("updateDiscoveryOptions", this.R().x(dfvp.V(dfsq0)), hvqs.r());
            }
            dcvz.a.e().p("Ignored transition to high power discovery", new Object[0]);
        }
        return 13;
    }

    public final int d(dfsq dfsq0) {
        int v1;
        synchronized(this) {
            this.s = dfsq0;
            v1 = this.c();
        }
        return v1;
    }

    public final int e() {
        synchronized(this) {
            dfsq dfsq0 = this.s;
            if(this.y != null && dfsq0 != null) {
                return cuuc.c("updateDiscoveryOptions", this.R().x(dfvp.Z(dfsq0)), hvqs.r());
            }
            dcvz.a.e().p("Ignored transition to non interruptive discovery", new Object[0]);
        }
        return 13;
    }

    public final int f(dfsq dfsq0) {
        int v1;
        synchronized(this) {
            this.s = dfsq0;
            v1 = this.e();
        }
        return v1;
    }

    final cuwu g(long v) {
        synchronized(this) {
        }
        return (cuwu)this.u.get(Long.valueOf(v));
    }

    public final String h(String s) {
        String s1;
        synchronized(this) {
            cuvf cuvf0 = (cuvf)this.d.get(s);
            if(cuvf0 == null) {
                return null;
            }
            s1 = cuvf0.a();
        }
        return s1;
    }

    public final Map i() {
        Map map0;
        synchronized(this) {
            map0 = ggeo.k(this.r);
        }
        return map0;
    }

    final void j() {
        synchronized(this) {
            gged_interceptors gged0 = gged_interceptors.i(this.u.keySet());
            int v1 = gged0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                this.w(((Long)gged0.get(v2)).longValue());
            }
            dcvz.a.b().p("NearbyConnectionsManager cleared incoming payload tracking", new Object[0]);
        }
    }

    final void k(String s) {
        this.R().r(s);
        this.o(s);
        this.w.remove(s);
        dcvz.a.b().h("Disconnected from %s", s);
    }

    public final void l(String s, cuuz cuuz0) {
        synchronized(this) {
            dfvo dfvo0 = (dfvo)this.v.get(s);
            if(dfvo0 != null) {
                dfvo0.b(cuuz0.a);
            }
            if(hvqs.be()) {
                dcvz.a.b().h("Bandwidth changed to medium %s", Integer.valueOf(cuuz0.c));
            }
            dfvk dfvk0 = (dfvk)this.w.get(s);
            if(dfvk0 != null) {
                dfvk0.b(cuuz0.d, cuuz0.c, cuuz0.a, cuuz0.b, cuuz0.e, cuuz0.f, cuuz0.g, cuuz0.h);
            }
        }
    }

    public final void m(String s, cuvf cuvf0) {
        synchronized(this) {
            if(cuvf0.d) {
                double f = this.e.a();
                if((f > 0.0)) {
                    dcvz.a.a().h("incoming connection rate limited, waited %f", Double.valueOf(f));
                }
            }
            this.d.put(s, cuvf0);
            this.R().c(s, this.j);
            dfuo dfuo0 = new dfuo(this, s);
            long v1 = hvqs.o();
            cumn cumn0 = cumn.d(dcvz.a, dfuo0, v1, this.a);
            this.f.put(s, cumn0);
        }
    }

    public final void n(String s, cuvl cuvl0) {
        synchronized(this) {
            cumn cumn0 = (cumn)this.f.remove(s);
            if(cumn0 != null) {
                cumn0.b();
            }
            Map map0 = this.d;
            cuvf cuvf0 = (cuvf)map0.get(s);
            if(cuvf0 != null) {
                if(cuvf0.d) {
                    this.T(s, cuvf0, cuvl0);
                }
                else {
                    this.U(s, cuvl0);
                }
                if(!cuvl0.a.e()) {
                    map0.remove(s);
                    this.v.remove(s);
                }
            }
        }
    }

    public final void o(String s) {
        synchronized(this) {
            cumn cumn0 = (cumn)this.f.remove(s);
            if(cumn0 != null) {
                cumn0.b();
            }
            this.d.remove(s);
            dfvo dfvo0 = (dfvo)this.v.remove(s);
            if(dfvo0 != null) {
                dfvo0.a();
            }
            gmcu gmcu0 = (gmcu)this.b.remove(s);
            if(gmcu0 != null) {
                gmcu0.r(new Exception("Endpoint disconnected."));
            }
            dfum dfum0 = (dfum)this.c.remove(s);
            if(dfum0 != null) {
                dfum0.a();
            }
        }
    }

    public final void p(String s, cuwo cuwo0) {
        String s1;
        int v2;
        RangingData rangingData0;
        synchronized(this) {
            dfzz dfzz0 = this.y;
            if(dfzz0 == null) {
                dcvz.a.b().h("Ignoring endpoint distance changed %s because we\'re no longer in discovery mode", s);
                return;
            }
            if(this.r.containsKey(s)) {
                UwbRangingData uwbRangingData0 = cuwo0.b;
                if(uwbRangingData0 == null) {
                    rangingData0 = null;
                }
                else {
                    rangingData0 = new RangingData();
                    dcki.b(uwbRangingData0.a, rangingData0);
                    dcki.a(uwbRangingData0.b, rangingData0);
                    dcki.c(uwbRangingData0.c, rangingData0);
                    rangingData0.d = uwbRangingData0.d;
                }
                int v1 = cuwo0.a;
                switch(v1) {
                    case 2: {
                        v2 = 2;
                        break;
                    }
                    case 3: {
                        v2 = 3;
                        break;
                    }
                    default: {
                        v2 = 5;
                        switch(v1) {
                            case 4: {
                                v2 = 4;
                                break;
                            }
                            case 5: {
                                break;
                            }
                            default: {
                                v2 = 1;
                            }
                        }
                    }
                }
                if(uwbRangingData0 != null) {
                    dcvz.a.b().i("Endpoint %s received {%s}", s, uwbRangingData0);
                }
                dfzz0.aU(new dfxi(dfzz0, s, v2, rangingData0));
                if(v2 != 1) {
                    cunf cunf0 = dcvz.a.b();
                    switch(v2) {
                        case 2: {
                            s1 = "VERY_CLOSE";
                            break;
                        }
                        case 3: {
                            s1 = "CLOSE";
                            break;
                        }
                        case 4: {
                            s1 = "FAR";
                            break;
                        }
                        default: {
                            s1 = "VERY_FAR";
                        }
                    }
                    cunf0.i("Endpoint %s distance changed to %s over Nearby Connections", s, s1);
                    return;
                }
                return;
            }
            dcvz.a.b().h("Ignoring endpoint distance changed %s because we haven\'t reported this endpoint", s);
        }
    }

    public final void q(String s, cuwf cuwf0) {
        synchronized(this) {
            if(this.y == null) {
                dcvz.a.b().h("Ignoring discovered endpoint %s because we\'re no longer in discovery mode", dizs.b(cuwf0.c));
                return;
            }
            LinkedHashMap linkedHashMap0 = this.r;
            if(linkedHashMap0.containsKey(s)) {
                dcvz.a.b().h("Ignoring discovered endpoint %s because we\'ve already reported this endpoint", dizs.b(cuwf0.c));
                return;
            }
            linkedHashMap0.put(s, cuwf0.c);
            dfzz dfzz0 = this.y;
            batl.s(dfzz0);
            dfzz0.aJ(s, cuwf0.c);
            dcvz.a.b().h("Endpoint %s discovered over Nearby Connections", s);
            dcvz.a.d().h("Discovered %s over Nearby Connections", dizs.b(cuwf0.c));
        }
    }

    public final void r(String s) {
        synchronized(this) {
            if(this.r.remove(s) == null) {
                dcvz.a.b().h("Ignoring lost endpoint %s because we haven\'t reported this endpoint", s);
                return;
            }
            dfzz dfzz0 = this.y;
            if(dfzz0 == null) {
                dcvz.a.b().h("Ignoring lost endpoint %s because we\'re no longer in discovery mode", s);
                return;
            }
            dfzz0.aL(s);
            dcvz.a.b().h("Endpoint %s lost over Nearby Connections", s);
        }
    }

    public final void s(cuwu cuwu0) {
        String s;
        synchronized(this) {
            cunf cunf0 = dcvz.a;
            cunf cunf1 = cunf0.b();
            long v1 = cuwu0.i;
            Long long0 = v1;
            int v2 = cuwu0.j;
            switch(v2) {
                case 1: {
                    s = "BYTES";
                    break;
                }
                case 2: {
                    s = "FILE";
                    break;
                }
                default: {
                    s = v2 == 3 ? "STREAM" : a.f(v2, "UNKNOWN[", "]");
                }
            }
            cunf1.i("NearbyConnectionsManager received payload with id %d of type %s.", long0, s);
            this.u.put(long0, cuwu0);
            if(hvrc.a.b().ai() && v2 == 2 && !this.t.containsKey(long0)) {
                cunf0.e().i("Received payload is unknown with id %d of type %d. Cancelling.", long0, Integer.valueOf(2));
                this.R().d(v1).z(new dfup(cuwu0));
            }
        }
    }

    public final void t(String s, PayloadTransferUpdate payloadTransferUpdate0) {
        dfvl dfvl0;
        synchronized(this) {
            long v1 = payloadTransferUpdate0.a;
            cuwu cuwu0 = this.g(v1);
            Long long0 = v1;
            Map map0 = this.t;
            if(map0.containsKey(long0)) {
                dfvm dfvm0 = (dfvm)map0.get(long0);
                if(dfvm0 != null) {
                    int v2 = payloadTransferUpdate0.b;
                    if(v2 != 3) {
                        map0.remove(long0);
                    }
                    long v3 = payloadTransferUpdate0.d;
                    switch(v2) {
                        case 1: {
                            dfvl0 = dfvl.c;
                            break;
                        }
                        case 3: {
                            dfvl0 = dfvl.b;
                            break;
                        }
                        default: {
                            dfvl0 = v2 == 4 ? dfvl.e : dfvl.d;
                        }
                    }
                    dfvm0.a(v1, v3, dfvl0);
                }
            }
            else if(cuwu0 != null) {
                if(cuwu0.j != 1) {
                    dcvz.a.e().i("Received unknown payload with id %d of type %d. Cancelling.", Long.valueOf(cuwu0.i), Integer.valueOf(cuwu0.j));
                    evql evql0 = this.R().d(v1);
                    if(hvrc.a.b().c()) {
                        evql0.z(new dfun(cuwu0));
                    }
                    else if(payloadTransferUpdate0.b == 1) {
                        dfzz.aw(this.g(v1));
                    }
                }
                else if(payloadTransferUpdate0.b == 1) {
                    byte[] arr_b = cuwu0.k;
                    if(arr_b != null) {
                        cunf cunf0 = dcvz.a;
                        cunf0.b().p("Writing incoming byte message to NearbyConnection.", new Object[0]);
                        dfum dfum0 = (dfum)this.c.get(s);
                        if(dfum0 != null) {
                            dfvp dfvp0 = dfum0.b;
                            synchronized(dfvp0) {
                                if(dfum0.e) {
                                    cunf0.b().h("Dropping NearbyConnection message for %s because we\'re closed", dfum0.c);
                                }
                                else {
                                    cunf0.b().h("Wrote NearbyConnection message to queue for %s", dfum0.c);
                                    dfum0.d.add(arr_b);
                                    dfvp0.notifyAll();
                                }
                            }
                        }
                    }
                }
                if(hvqz.v() && payloadTransferUpdate0.b != 3) {
                    this.w(v1);
                }
            }
        }
    }

    final void u(String s, dfvk dfvk0) {
        synchronized(this) {
            this.w.put(s, dfvk0);
        }
    }

    final void v(long v, dfvm dfvm0) {
        synchronized(this) {
            this.t.put(Long.valueOf(v), dfvm0);
        }
    }

    final void w(long v) {
        synchronized(this) {
            cuwu cuwu0 = (cuwu)this.u.remove(Long.valueOf(v));
            if(cuwu0 != null) {
                cuwu0.i();
            }
        }
    }

    public final void x() {
        synchronized(this) {
            this.S();
            dcvz.a.b().p("NearbyConnectionsManager has been reset", new Object[0]);
        }
    }

    final void y(Runnable runnable0) {
        this.q.execute(runnable0);
    }

    public final void z(String s, cuwu cuwu0, dfvm dfvm0) {
        synchronized(this) {
            dfvo dfvo0 = (dfvo)this.v.get(s);
            if(dfvo0 != null) {
                dfvk dfvk0 = (dfvk)this.w.get(s);
                dfvo0.d(this.a, dfvk0);
                dfvo0.c(() -> synchronized(this) {
                    this.v(cuwu0.i, dfvm0);
                    this.R().k(s, cuwu0).A(new dfuq());
                });
                return;
            }
            this.A(s, cuwu0, dfvm0);
        }
    }
}

