import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseData.Builder;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertisingSetCallback;
import android.bluetooth.le.ScanFilter.Builder;
import android.bluetooth.le.ScanSettings.Builder;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.ParcelUuid;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.nearby.common.ble.BleSighting;
import com.google.android.gms.nearby.connection.v3.dct.SupportedServices;
import com.google.android.gms.nearby.internal.connection.AdvertisingOptions;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothLowEnergy.2;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothLowEnergy.3;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;

public final class czri {
    private final bsaq A;
    private final czvk B;
    private final cztq C;
    private final ScheduledExecutorService D;
    private final czrb E;
    private final ScheduledExecutorService F;
    private final int G;
    private final Map H;
    private final Map I;
    private final Map J;
    private byte[] K;
    private volatile czqg L;
    private volatile czqq M;
    private czqx N;
    private final Set O;
    private final Set P;
    private final Set Q;
    private final gmcg R;
    private final SecureRandom S;
    private czqs T;
    public static final ParcelUuid a;
    public static final ParcelUuid b;
    public static Boolean c;
    public final Context d;
    public final Map e;
    public final Map f;
    czvg g;
    public final Map h;
    final Map i;
    public final Map j;
    public final Map k;
    final Map l;
    public final Map m;
    public czqe n;
    public czrh o;
    public czqz p;
    public czqz q;
    public czqu r;
    public czqu s;
    public czqz t;
    public final czty u;
    final List v;
    public final Set w;
    public boolean x;
    private static long y;
    private final BluetoothManager z;

    static {
        czri.a = new ParcelUuid(czup.b);
        czri.b = new ParcelUuid(czup.c);
        czri.c = null;
        czri.y = 0L;
    }

    public czri(Context context0, czvk czvk0) {
        this.D = cuui.f();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.E = new czrb();
        ScheduledExecutorService scheduledExecutorService0 = cuui.f();
        this.F = scheduledExecutorService0;
        this.G = (int)hvog.n();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new bxd();
        this.H = new bxd();
        this.I = new bxd();
        this.J = new bxd();
        this.k = new bxd();
        this.l = new bxd();
        this.m = new bxd();
        this.v = new ArrayList();
        this.O = new bxf();
        this.P = new bxf();
        this.Q = new bxf();
        this.w = Collections.newSetFromMap(new ConcurrentHashMap());
        this.R = cuui.d();
        this.S = new SecureRandom();
        this.x = false;
        this.T = null;
        Context context1 = context0.getApplicationContext();
        this.d = context1;
        this.C = new cztq(context1);
        this.B = czvk0;
        this.z = (BluetoothManager)context1.getSystemService("bluetooth");
        this.A = cumz.e(context0, "BluetoothLowEnergy");
        this.u = new czty(context1, scheduledExecutorService0);
    }

    public final void A(String s) {
        synchronized(this) {
            if(!this.M(s)) {
                czkq.a.b().h("[BluetoothLowEnergy] Can\'t stop accepting BLE L2CAP over IPv6 connections because it was never started, %s", gxyf.b(gxye.k, s));
                return;
            }
            this.J.remove(s);
            if(this.J.isEmpty() && this.Q.isEmpty()) {
                czkq.a.b().p("[BluetoothLowEnergy] closeBleL2capOverIpv6ServerSocket", new Object[0]);
                this.an(s);
            }
            czkq.a.b().h("[BluetoothLowEnergy] Stop accepting BLE L2CAP over IPv6 connections, %s", gxyf.b(gxye.k, s));
        }
    }

    public final void B(String s) {
        synchronized(this) {
            if(!this.O(s)) {
                czkq.a.b().h("Cannot stop BLE advertising for service ID %s because it never started.", s);
                return;
            }
            this.as();
            byte[] arr_b = null;
            if(this.L != null && this.L.b().equals(s)) {
                byte[] arr_b1 = this.L.a.f;
                this.L = null;
                arr_b = arr_b1;
            }
            Map map0 = this.j;
            Set set0 = (Set)map0.remove(s);
            if(set0 != null) {
                for(Object object0: set0) {
                    this.h.remove(((Integer)object0));
                }
            }
            this.i.remove(s);
            this.al();
            if(this.L != null || !map0.isEmpty()) {
                if(Objects.equals(this.ak(s, arr_b).a.d(), Boolean.valueOf(false))) {
                    czkq.a.e().h("Failed to restart BLE advertisement after stopping BLE advertisement for service ID %s.", s);
                }
            }
            else if(this.O.isEmpty()) {
                czkq.a.d().p("Aggressively stopping any pre-existing advertisement GATT servers because no incoming BLE sockets are connected.", new Object[0]);
                this.aq();
            }
            this.u.b(s);
            czkq.a.b().h("Successfully stopped BLE advertising for service %s", s);
        }
    }

    public static void C(cupu cupu0, AdvertisingSetCallback advertisingSetCallback0) {
        czkq.a.b().p("Tear down previous extended advertising request due to errors.", new Object[0]);
        cupu0.d(advertisingSetCallback0);
    }

    public final void D(String s) {
        synchronized(this) {
            if(!this.S(s)) {
                czkq.a.b().h("Cannot stop DCT advertising for service ID %s because it never started.", s);
                return;
            }
            Map map0 = this.m;
            map0.remove(s);
            if(map0.isEmpty()) {
                this.ar();
                this.M = null;
            }
            else {
                czqq czqq0 = czri.az(map0);
                if(!czqq0.equals(this.M)) {
                    this.M = czqq0;
                    this.ar();
                    Object object0 = map0.keySet().iterator().next();
                    gftb.check(this.M);
                    if(Objects.equals(this.aj(this.M, ((String)object0)).a.d(), Boolean.valueOf(false))) {
                        czkq.a.e().h("Failed to restart DCT advertisement after stopping advertisement for service ID %s.", s);
                        map0.clear();
                        this.M = null;
                        return;
                    }
                }
            }
            czkq.a.b().h("Successfully stopped DCT advertising for service %s", s);
        }
    }

    public final void E(String s) {
        this.E.c("DCT_" + s);
        synchronized(this) {
            if(!this.T(s)) {
                czkq.a.b().h("Cannot stop BLE DCT scanning for %s because it never started", gxyf.b(gxye.k, s));
                return;
            }
            int v1 = this.ag();
            this.f.remove(s);
            cztq cztq0 = this.C;
            cztq0.f(s);
            int v2 = this.ag();
            if(this.f.isEmpty() && this.e.isEmpty()) {
                cztq0.g("NearbyConnections.EnvironmentMonitor");
                this.x = false;
                this.at();
            }
            else if(v1 != v2) {
                this.at();
                if(!this.ay(s)) {
                    czkq.a.e().h("Failed to restart BLE DCT scan after stopping BLE DCT scan, %s", gxyf.b(gxye.k, s));
                }
            }
            czkq.a.b().h("Stopped BLE DCT scanning, %s", gxyf.b(gxye.k, s));
        }
    }

    public final void F(String s) {
        this.G(s, true);
    }

    public final void G(String s, boolean z) {
        this.E.c(s);
        synchronized(this) {
            if(!this.W(s)) {
                czkq.a.b().h("Cannot stop BLE scanning for %s because it never started", gxyf.b(gxye.k, s));
                return;
            }
            int v1 = this.ag();
            boolean z1 = this.au();
            Map map0 = this.e;
            map0.remove(s);
            if(z) {
                this.C.g(s);
            }
            int v2 = this.ag();
            boolean z2 = this.au();
            if(map0.isEmpty() && this.f.isEmpty()) {
                this.C.g("NearbyConnections.EnvironmentMonitor");
                this.x = false;
                this.at();
            }
            else if(z1 != z2 || v1 != v2) {
                this.at();
                if(!this.ay(s)) {
                    czkq.a.e().h("Failed to restart BLE scan after stopping BLE scan, %s", gxyf.b(gxye.k, s));
                }
            }
            czkq.a.b().h("Stopped BLE scanning, %s", gxyf.b(gxye.k, s));
        }
    }

    public final void H(boolean z) {
        synchronized(this) {
            if(z != this.x) {
                Map map0 = this.e;
                if(!map0.isEmpty()) {
                    this.x = z;
                    Object object0 = map0.keySet().iterator().next();
                    if(((String)object0) != null) {
                        czkq.a.b().h("Restart BLE scanning due to environment changed. congested environment : %s ", Boolean.valueOf(z));
                        this.at();
                        this.ay(((String)object0));
                    }
                }
            }
        }
    }

    public final boolean I() {
        boolean z = true;
        synchronized(this) {
            if(this.H.isEmpty() && this.I.isEmpty()) {
                if(!hvol.T()) {
                    z = false;
                }
                else if(this.J.isEmpty()) {
                    return false;
                }
            }
        }
        return z;
    }

    public final boolean J(String s) {
        boolean z = true;
        synchronized(this) {
            if(!this.K(s) && !this.L(s)) {
                if(!hvol.T()) {
                    z = false;
                }
                else if(!this.M(s)) {
                    return false;
                }
            }
        }
        return z;
    }

    public final boolean K(String s) {
        boolean z;
        synchronized(this) {
            if(this.o == null) {
                return false;
            }
            z = this.H.containsKey(s);
        }
        return z;
    }

    public final boolean L(String s) {
        boolean z;
        synchronized(this) {
            if(this.N == null) {
                return false;
            }
            z = this.I.containsKey(s);
        }
        return z;
    }

    public final boolean M(String s) {
        synchronized(this) {
            if(this.k.containsKey(s) && this.J.containsKey(s)) {
                return true;
            }
        }
        return false;
    }

    public final boolean N() {
        return this.p != null || this.q != null || this.r != null || this.s != null;
    }

    public final boolean O(String s) {
        synchronized(this) {
            if(this.L != null && this.L.b().equals(s)) {
                return true;
            }
            if(!this.j.containsKey(s) && !this.i.containsKey(s)) {
                return false;
            }
        }
        return true;
    }

    public final boolean P() {
        return hvol.aQ() && (this.d.getPackageManager().hasSystemFeature("android.hardware.bluetooth") && this.d.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") && this.z != null && this.A != null);
    }

    final boolean Q() {
        return this.N != null;
    }

    final boolean R() {
        return this.o != null;
    }

    public final boolean S(String s) {
        boolean z;
        synchronized(this) {
            z = this.m.containsKey(s);
        }
        return z;
    }

    public final boolean T(String s) {
        boolean z;
        synchronized(this) {
            z = this.f.containsKey(s);
        }
        return z;
    }

    public static boolean U(Context context0) {
        Boolean boolean0 = czri.c;
        if(boolean0 == null) {
            bsaq bsaq0 = cumz.e(context0, "BluetoothLowEnergy");
            Boolean boolean1 = Boolean.valueOf(hvol.a.r().ca() && bsaq0 != null && bsaq0.x());
            czri.c = boolean1;
            return boolean1.booleanValue();
        }
        return boolean0.booleanValue();
    }

    public static boolean V() {
        return hvol.a.r().aw();
    }

    public final boolean W(String s) {
        boolean z;
        synchronized(this) {
            z = this.e.containsKey(s);
        }
        return z;
    }

    public final byte[] X() {
        if(this.K == null) {
            this.K = czmk.Y((cuue.a() + new SecureRandom().nextLong()).getBytes(), 2);
        }
        return this.K;
    }

    final czle Y(czql czql0, cump cump0) {
        czle czle1;
        synchronized(this) {
            if(cump0.d()) {
                czke.g(new cvae(czql0.a, 8, czql0.d), gylz.f, gymd.cn);
                czkq.a.e().p("[BluetoothLowEnergy] cancellationFlag is cancelled in connectBleL2capOverIpv6", new Object[0]);
                return new czle(gyxo.gm);
            }
            czpn czpn0 = new czpn(this, czql0, cump0);
            czle1 = this.C.j(czql0, czpn0);
        }
        return czle1;
    }

    public final czle Z(czql czql0, String s, cump cump0) {
        czle czle5;
        synchronized(this) {
            if(czql0.c) {
                if(czql0.b.d <= 0) {
                    czke.g(new cvae(czql0.a, 8, czql0.d), gylz.b, gymd.by);
                    czkq.a.e().p("[BluetoothLowEnergy] psm is null or empty.", new Object[0]);
                    return new czle(gyxo.gm);
                }
                if(!czri.V()) {
                    czke.g(new cvae(czql0.a, 8, czql0.d), gylz.b, gymd.cg);
                    czkq.a.e().p("[BluetoothLowEnergy] isL2capSocketAvailable is false.", new Object[0]);
                    return new czle(gyxo.gm);
                }
            }
            Map map0 = this.l;
            if(!map0.isEmpty()) {
                czke.g(new cvae(czql0.a, 8, czql0.d), gylz.b, gymd.cg);
                czkq.a.e().p("[BluetoothLowEnergy] l2capClientOverIpv6OpenedOperations is not empty.", new Object[0]);
                return new czle(gyxo.gm);
            }
            String s1 = czql0.a;
            byte[] arr_b = czup.g(s1);
            czsl czsl0 = new czsl(this.d, s1, arr_b, s, czql0, cump0);
            if(czvk.f(this.B.a(czsl0))) {
                czsp czsp0 = czsl0.e;
                if(czsp0 == null) {
                    czkq.a.c().j("[BluetoothLowEnergy] Failed to retrieve a ble l2cap over ipv6 socket when creating a ble l2cap over ipv6 socket, %s, %s, operation-detail=%s", gxyf.b(gxye.a, s), gxyf.b(gxye.k, s1), czsl0.d.name());
                    return new czle(czsl0.d);
                }
                map0.put(s1, czsl0);
                czkq.a.b().p("[BluetoothLowEnergy] processBleL2capOverIpv6ConnectRequest success.", new Object[0]);
                return new czle(czsp0, gyxo.b);
            }
            czkq.a.c().h("[BluetoothLowEnergy] Failed to create an outgoing ble l2cap over ipv6 because the MediumOperation registration failed, %s", gxyf.b(gxye.a, s));
            czle5 = new czle(czsl0.d);
        }
        return czle5;
    }

    public final int a() {
        if(czri.V()) {
            return this.N == null ? 0 : this.N.a.a;
        }
        return 0;
    }

    private static final String aA(String s) {
        return "DCT_" + s;
    }

    public final czle aa(String s, cvgb cvgb0) {
        czle czle0;
        synchronized(this) {
            czle0 = this.ab(s, cvgb0);
            if(((Boolean)czle0.a.d()).equals(Boolean.valueOf(true))) {
                this.ac(s, cvgb0);
            }
        }
        return czle0;
    }

    public final czle ab(String s, cvgb cvgb0) {
        gyxo gyxo0;
        czle czle0;
        synchronized(this) {
            if(this.K(s)) {
                czke.g(new cvae(s, 4, null), gymt.a, gymd.cn);
                return new czle(Boolean.valueOf(false), gyxo.aF);
            }
            if(!this.P()) {
                cvae cvae0 = new cvae(s, 4, null);
                gymd gymd0 = this.l();
                czke.g(cvae0, gylz.c, gymd0);
                return new czle(Boolean.valueOf(false), gyxo.M);
            }
            if(this.O.isEmpty() && this.H.isEmpty()) {
                czkq.a.d().p("Aggressively closing any pre-existing BLE server sockets because no incoming BLE sockets are connected and no clients are listening.", new Object[0]);
                this.am();
            }
            gyxo0 = gyxo.b;
            if(this.R()) {
                czkq.a.b().p("Already accepting BLE Gatt connections.", new Object[0]);
            }
            else {
                if(this.A == null) {
                    czkq.a.b().p("Failed to open a BLE server socket because bluetoothAdapter is not available.", new Object[0]);
                    czle0 = new czle(Boolean.valueOf(false), gyxo.bt);
                }
                else {
                    czpq czpq0 = (czth czth0) -> synchronized(this) {
                        this.ap(this.O, this.H, czth0);
                    };
                    czrh czrh0 = new czrh(s, this.d, czpq0);
                    if(czvk.f(this.B.a(czrh0))) {
                        this.o = czrh0;
                        czle0 = new czle(Boolean.valueOf(true), czrh0.c);
                    }
                    else {
                        czkq.a.e().p("Failed to open a BLE server socket because BluetoothLowEnergy was unable to register the MediumOperation.", new Object[0]);
                        czle0 = new czle(Boolean.valueOf(false), czrh0.c);
                    }
                }
                if(Objects.equals(czle0.a.d(), Boolean.valueOf(false))) {
                    czkq.a.e().h("Failed to start accepting BLE connections because a BLE server socket could not be spun up, %s", gxyf.b(gxye.k, s));
                    return czle0;
                }
                czkq.a.b().h("Started accepting BLE Gatt connections, %s", gxyf.b(gxye.k, s));
                gyxo0 = czle0.b;
            }
            this.H.put(s, cvgb0);
        }
        return new czle(Boolean.valueOf(true), gyxo0);
    }

    public final czle ac(String s, cvgb cvgb0) {
        czle czle0;
        synchronized(this) {
            if(this.L(s)) {
                czke.g(new cvae(s, 4, null), gymt.a, gymd.cn);
                return new czle(Boolean.valueOf(false), gyxo.aG);
            }
            if(!this.P()) {
                cvae cvae0 = new cvae(s, 4, null);
                gymd gymd0 = this.l();
                czke.g(cvae0, gylz.c, gymd0);
                return new czle(Boolean.valueOf(false), gyxo.M);
            }
            if(!czri.V()) {
                return new czle(Boolean.valueOf(false), gyxo.N);
            }
            if(this.Q()) {
                czkq.a.b().p("Already accepting BLE L2CAP connections.", new Object[0]);
            }
            else {
                bsaq bsaq0 = this.A;
                if(bsaq0 == null) {
                    czkq.a.c().p("Failed to open a BLE L2CAP server socket because bluetoothAdapter is not available.", new Object[0]);
                    czle0 = new czle(Boolean.valueOf(false), gyxo.bu);
                }
                else {
                    czpj czpj0 = (czth czth0) -> synchronized(this) {
                        this.ap(this.P, this.I, czth0);
                    };
                    czqx czqx0 = new czqx(s, bsaq0, this.h, czpj0);
                    if(czvk.f(this.B.a(czqx0))) {
                        this.N = czqx0;
                        czle0 = new czle(Boolean.valueOf(true), gyxo.b);
                    }
                    else {
                        czkq.a.e().p("Failed to open a BLE L2CAP server socket because BluetoothLowEnergy was unable to register the MediumOperation.", new Object[0]);
                        czle0 = new czle(Boolean.valueOf(false), czqx0.b);
                    }
                }
                if(Objects.equals(czle0.a.d(), Boolean.valueOf(false))) {
                    czkq.a.e().h("Failed to start accepting BLE L2CAP connections because a BLE L2CAP server socket could not be spun up, %s", gxyf.b(gxye.k, s));
                    return czle0;
                }
                czkq.a.b().h("Started accepting BLE L2CAP connections, %s", gxyf.b(gxye.k, s));
            }
            Map map0 = this.I;
            map0.put(s, cvgb0);
            Map map1 = this.H;
            if(!map0.keySet().equals(map1.keySet())) {
                for(Object object0: map1.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    if(!map0.containsKey(map$Entry0.getKey())) {
                        czkq.a.b().h("Merge known GATT connection callbacks to L2CAP. id : %s", map$Entry0.getKey());
                        map0.put(((String)map$Entry0.getKey()), ((cvgb)map$Entry0.getValue()));
                    }
                }
            }
        }
        return new czle(Boolean.valueOf(true), gyxo.b);
    }

    public final czle ad(String s, cvgb cvgb0) {
        czle czle0;
        synchronized(this) {
            if(this.M(s)) {
                czke.g(new cvae(s, 4, null), gymt.a, gymd.cn);
                czkq.a.e().h("[BluetoothLowEnergy] Failed to start accepting BLE L2CAP over IPv6 connections because isAcceptingL2capOverIpv6Connections is true, %s", s);
                return new czle(Boolean.valueOf(false), gyxo.gl);
            }
            if(!this.P()) {
                cvae cvae0 = new cvae(s, 4, null);
                gymd gymd0 = this.l();
                czke.g(cvae0, gylz.c, gymd0);
                czkq.a.e().h("[BluetoothLowEnergy] Failed to start accepting BLE L2CAP over IPv6 connections because BLE is not available, %s", s);
                return new czle(Boolean.valueOf(false), gyxo.gl);
            }
            if(czri.V()) {
                Map map0 = this.k;
                if(!map0.isEmpty()) {
                    czkq.a.c().p("[BluetoothLowEnergy] Failed to open a BLE L2CAP server socket because it is already in use.", new Object[0]);
                    czle0 = new czle(Boolean.valueOf(false), gyxo.gl);
                }
                else if(this.A == null) {
                    czkq.a.c().p("[BluetoothLowEnergy] Failed to open a BLE L2CAP server socket because bluetoothAdapter is not available.", new Object[0]);
                    czle0 = new czle(Boolean.valueOf(false), gyxo.gl);
                }
                else {
                    byte[] arr_b = czup.g(s);
                    czpo czpo0 = (czth czth0) -> synchronized(this) {
                        this.ap(this.Q, this.J, czth0);
                    };
                    czso czso0 = new czso(s, arr_b, this.d, czpo0);
                    if(czvk.f(this.B.a(czso0))) {
                        map0.put(s, czso0);
                        czkq.a.b().p("[BluetoothLowEnergy] openBleL2capOverIpv6ServerSocket succeeded.", new Object[0]);
                        czle0 = new czle(Boolean.valueOf(true), gyxo.b);
                    }
                    else {
                        czkq.a.e().p("[BluetoothLowEnergy] Failed to open a BLE L2CAP server socket because BluetoothLowEnergy was unable to register the MediumOperation.", new Object[0]);
                        czle0 = new czle(Boolean.valueOf(false), czso0.e);
                    }
                }
                if(Objects.equals(czle0.a.d(), Boolean.valueOf(false))) {
                    czkq.a.e().h("[BluetoothLowEnergy] Failed to start accepting BLE L2CAP over IPv6 connections because unable to register BLE L2CAP server and reserved psm, %s", s);
                    return czle0;
                }
                czkq.a.b().h("[BluetoothLowEnergy] Started accepting BLE L2CAP over IPv6 connections, %s", gxyf.b(gxye.k, s));
                this.J.put(s, cvgb0);
                czkq.a.b().h("[BluetoothLowEnergy] startAcceptingL2capOverIpv6Connections succeeded, %s", s);
                return new czle(Boolean.valueOf(true), gyxo.b);
            }
            cvae cvae1 = new cvae(s, 4, null);
            gymd gymd1 = this.l();
            czke.g(cvae1, gylz.c, gymd1);
            czkq.a.e().h("[BluetoothLowEnergy] Failed to start accepting BLE L2CAP over IPv6 connections because L2CAP socket is not available, %s", s);
        }
        return new czle(Boolean.valueOf(false), gyxo.gl);
    }

    private final int ae() {
        int v;
        if(this.L == null) {
            v = -1;
        }
        else {
            if(this.L.a() == 3) {
                return 3;
            }
            v = this.L.a();
        }
        int v1 = czri.af(ggch.f(gggq.j(this.h.values(), new czpr()), gggq.j(this.i.values(), new czps())));
        return v == 0 ? v1 : Math.max(v, v1);
    }

    private static int af(Iterable iterable0) {
        int v = -1;
        for(Object object0: iterable0) {
            int v1 = (int)(((Integer)object0));
            if(v1 == 3) {
                return 3;
            }
            if(v1 != 0 && v1 > v) {
                v = v1;
            }
        }
        return v;
    }

    private final int ag() {
        return hvol.T() ? Math.max(czri.ah(ggeo.k(this.e).g()), czri.af(gggq.j(ggeo.k(this.f).g(), new czpk()))) : czri.ah(ggeo.k(this.e).g());
    }

    private static int ah(ggds ggds0) {
        return czri.af(gggq.j(ggds0, new czpu()));
    }

    private final WorkSource ai() {
        czqn czqn0;
        int v2;
        WorkSource workSource0 = null;
        if(hvol.T()) {
            int v = this.ag();
            gged_interceptors gged0 = gged_interceptors.i(this.e.values());
            int v1 = gged0.size();
            v2 = 0;
            int v3 = 0;
            while(true) {
                if(v3 >= v1) {
                    goto label_21;
                }
                czqn czqn1 = (czqn)gged0.get(v3);
                ++v3;
                if(czqn1.b == v) {
                    czqn0 = czqn1;
                    break;
                }
            }
        }
        else {
            for(Object object0: this.e.values()) {
                czqn0 = (czqn)object0;
                if(czqn0.b == 3) {
                    return czqn0.c;
                }
                workSource0 = czqn0.c;
            }
            return workSource0;
        }
        return czqn0.c;
    label_21:
        gged_interceptors gged1 = gged_interceptors.i(this.f.values());
        int v4 = gged1.size();
        while(v2 < v4) {
            czqr czqr0 = (czqr)gged1.get(v2);
            ++v2;
            if(czqr0.b == v) {
                return czqr0.c;
            }
        }
        return null;
    }

    private final czle aj(czqq czqq0, String s) {
        byte[] arr_b = czqq0.b.a();
        Boolean boolean0 = Boolean.valueOf(false);
        if(arr_b == null) {
            czkq.a.e().p("In startDctPhysicalBleAdvertisement, failed to create DCT advertisement bytes.", new Object[0]);
            return new czle(boolean0, gyxo.gj);
        }
        czqd czqd0 = czqd.b(arr_b, true, true);
        AdvertiseData advertiseData0 = czqd0.a;
        AdvertiseData advertiseData1 = czqd0.b;
        if(advertiseData1 != null) {
            czkq.a.b().h("scanResponse is used for DCT adv which should not happen in DCT 1.0, total advData length : %d", Integer.valueOf(arr_b.length));
        }
        czqi czqi0 = czqj.e();
        czqi0.d(czqq0.a);
        if(bbqa.d() && hvol.a.r().ad()) {
            czqi0.c(true);
        }
        if(advertiseData0 == null) {
            czke.i(s, 2, gylz.b, gymd.l);
            return new czle(boolean0, gyxo.gj);
        }
        czqi0.b(true);
        czqj czqj0 = czqi0.a();
        czqz czqz0 = new czqz(this.d, czqj0, advertiseData0, advertiseData1, s);
        czvk czvk0 = this.B;
        if(!czvk.f(czvk0.a(czqz0))) {
            czkq.a.e().p("Failed to advertise DCT over BLE because the MediumOperation failed to register.", new Object[0]);
            czvk0.e(this.t);
            return new czle(boolean0, gyxo.gj);
        }
        this.t = czqz0;
        cunf cunf0 = czkq.a.b();
        czqj czqj1 = czqi0.a();
        cunf0.i("Started DCT advertising data length : %d, AdvertisingSettings : %s", Integer.valueOf(arr_b.length), czqj1);
        return new czle(Boolean.valueOf(true), gyxo.b);
    }

    private final czle ak(String s, byte[] arr_b) {
        boolean z6;
        boolean z5;
        AdvertiseData advertiseData5;
        byte[] arr_b8;
        AdvertiseData advertiseData4;
        AdvertiseData advertiseData3;
        boolean z4;
        boolean z3;
        boolean z2;
        boolean z1;
        AdvertiseData advertiseData2;
        AdvertiseData advertiseData1;
        Context context0 = this.d;
        AdvertiseData advertiseData0 = null;
        Boolean boolean0 = Boolean.valueOf(false);
        if(czri.U(context0)) {
            Map map0 = this.i;
            if(!map0.isEmpty()) {
                AdvertiseData.Builder advertiseData$Builder0 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
                if(!bbqa.d()) {
                    advertiseData$Builder0.addServiceUuid(czri.a);
                }
                Object object0 = map0.values().iterator().next();
                advertiseData$Builder0.addServiceData(czri.a, ((czqf)object0).b);
                advertiseData1 = advertiseData$Builder0.build();
            }
            else if(this.aw()) {
                Map map1 = this.h;
                if(map1.isEmpty()) {
                    advertiseData1 = null;
                }
                else {
                    AdvertiseData.Builder advertiseData$Builder1 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
                    if(!bbqa.d()) {
                        advertiseData$Builder1.addServiceUuid(czri.a);
                    }
                    Object object1 = map1.values().iterator().next();
                    advertiseData$Builder1.addServiceData(czri.a, ((czqf)object1).b);
                    advertiseData1 = advertiseData$Builder1.build();
                }
            }
            else {
                advertiseData1 = null;
            }
            if(hvol.aJ() && arr_b != null) {
                czqg czqg0 = this.L;
                if(czqg0 == null) {
                    advertiseData2 = null;
                }
                else {
                    byte[] arr_b1 = czqg0.b;
                    if(arr_b1 == null) {
                        advertiseData2 = null;
                    }
                    else {
                        AdvertiseData.Builder advertiseData$Builder2 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
                        ParcelUuid parcelUuid0 = czri.a;
                        czsa czsa0 = new czsa();
                        czsa0.b(arr_b);
                        byte[] arr_b2 = czsa0.a().b();
                        if(arr_b2 != null) {
                            ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b1.length + arr_b2.length);
                            byteBuffer0.put(arr_b1);
                            byteBuffer0.put(arr_b2);
                            arr_b1 = byteBuffer0.array();
                        }
                        advertiseData$Builder2.addServiceData(parcelUuid0, arr_b1);
                        advertiseData2 = advertiseData$Builder2.build();
                    }
                }
            }
            else {
                advertiseData2 = null;
            }
            boolean z = this.J(s);
            int v = this.ae();
            czqi czqi0 = czqj.e();
            czqi0.d(v);
            czqi0.b(z);
            if(bbqa.d() && !hvol.N()) {
                czqi0.c(true);
            }
            czqj czqj0 = czqi0.a();
            if(advertiseData2 == null) {
                z1 = false;
            }
            else {
                czqu czqu0 = new czqu(context0, czqj0, advertiseData2, s);
                if(czvk.f(this.B.a(czqu0))) {
                    this.s = czqu0;
                    z1 = true;
                }
                else {
                    czkq.a.e().p("Failed to advertise a fast extended advertisement over BLE because the MediumOperation failed to register.", new Object[0]);
                    z1 = false;
                }
            }
            if(advertiseData1 == null) {
                z2 = false;
            label_77:
                if(!z2 && !z1) {
                    czkq.a.b().p("BLE extended advertising not started.", new Object[0]);
                }
                else {
                    czkq.a.b().j("Started BLE extended advertising. Regular Advertised : %s, Fast Advertised : %s, AdvertisingSetting : %s.", Boolean.valueOf(z2), Boolean.valueOf(z1), czqj0.toString());
                }
                z3 = true;
            }
            else {
                czqu czqu1 = new czqu(context0, czqj0, advertiseData1, s);
                if(czvk.f(this.B.a(czqu1))) {
                    this.r = czqu1;
                    z2 = true;
                    goto label_77;
                }
                else {
                    czkq.a.e().p("Failed to advertise regular extended advertisement over BLE because the MediumOperation failed to register.", new Object[0]);
                    z3 = false;
                }
            }
        }
        else {
            z3 = false;
        }
        bzs bzs0 = (bzs)this.j;
        if(bzs0.d_num <= 1 && this.i.isEmpty()) {
            z4 = z3;
        }
        else {
            czkq.a.b().i("Force remote device to fetch advertisement from gatt server. Client size : %d, queuedGattAdvertisements : %d", Integer.valueOf(bzs0.d_num), Integer.valueOf(this.i.size()));
            z4 = false;
        }
        if(this.aw()) {
            int v1 = this.a();
            byte[] arr_b3 = new byte[0x80];
            this.S.nextBytes(arr_b3);
            cztz cztz0 = new cztz();
            gxub gxub0 = new gxub(new byte[10], cztz0);
            gxub0.a(new String(arr_b3));
            byte[] arr_b4 = czup.f(arr_b3);
            for(Object object2: this.h.values()) {
                czqf czqf0 = (czqf)object2;
                if(czqf0 != null) {
                    gxub0.a(czqf0.a);
                    ByteBuffer byteBuffer1 = ByteBuffer.allocate(arr_b4.length + czqf0.b.length);
                    byteBuffer1.put(arr_b4);
                    byteBuffer1.put(czqf0.b);
                    arr_b4 = czup.f(byteBuffer1.array());
                }
            }
            byte[] arr_b5 = gxub0.c();
            int v2 = cumz.j(context0) ^ 1;
            byte[] arr_b6 = czrz.b(this.G, arr_b5, arr_b4, v1, z4, ((boolean)v2));
            if(arr_b6 == null) {
                czke.i(s, 2, gylz.b, gymd.l);
                return new czle(boolean0, gyxo.fs);
            }
            czqd czqd0 = czqd.a(arr_b6, true);
            advertiseData3 = czqd0.b;
            advertiseData4 = czqd0.a;
        }
        else {
            advertiseData3 = null;
            advertiseData4 = null;
        }
        if(this.L == null) {
            advertiseData5 = null;
            arr_b8 = null;
        }
        else {
            byte[] arr_b7 = this.L.b;
            if(arr_b7 == null) {
                arr_b8 = null;
                advertiseData5 = null;
            }
            else {
                czqd czqd1 = czqd.a(arr_b7, this.J(s));
                advertiseData0 = czqd1.a;
                arr_b8 = arr_b7;
                advertiseData5 = czqd1.b;
            }
        }
        int v3 = this.ae();
        czqi czqi1 = czqj.e();
        czqi1.d(v3);
        if(bbqa.d() && !hvol.N()) {
            czqi1.c(true);
        }
        if(advertiseData0 == null) {
            z5 = false;
        }
        else {
            czqi1.b(this.J(s));
            czqz czqz0 = new czqz(context0, czqi1.a(), advertiseData0, advertiseData5, s);
            if(!czvk.f(this.B.a(czqz0))) {
                czkq.a.c().p("Failed to advertise a fast legacy advertisement over BLE because the MediumOperation failed to register.", new Object[0]);
                return new czle(boolean0, czqz0.e);
            }
            if(arr_b8 != null) {
                this.u.a(s, arr_b8);
            }
            this.q = czqz0;
            z5 = true;
        }
        if(advertiseData4 == null) {
            z6 = false;
        }
        else {
            czqi1.b(true);
            czqz czqz1 = new czqz(context0, czqi1.a(), advertiseData4, advertiseData3, s);
            czvk czvk0 = this.B;
            if(!czvk.f(czvk0.a(czqz1))) {
                czkq.a.e().p("Failed to advertise legacy GATT header over BLE because the MediumOperation failed to register.", new Object[0]);
                czvk0.e(this.q);
                return new czle(boolean0, czqz1.e);
            }
            gged_interceptors gged0 = gged_interceptors.i(this.h.values());
            int v4 = gged0.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                czqf czqf1 = (czqf)gged0.get(v5);
                this.u.a(czqf1.a, czqf1.b);
            }
            gged_interceptors gged1 = gged_interceptors.i(this.i.values());
            int v6 = gged1.size();
            for(int v7 = 0; v7 < v6; ++v7) {
                czqf czqf2 = (czqf)gged1.get(v7);
                this.u.a(czqf2.a, czqf2.b);
            }
            this.p = czqz1;
            z6 = true;
        }
        if(!z6 && !z5) {
            czkq.a.b().p("BLE Legacy advertising not started.", new Object[0]);
            return new czle(Boolean.valueOf(true), gyxo.b);
        }
        czkq.a.b().k("Started BLE Legacy advertising. Regular Header Advertised : %s, Fast Advertised : %s, AdvertisingSettings : %s, isAcceptingConnection : %s", Boolean.valueOf(z6), Boolean.valueOf(z5), czqi1.a(), Boolean.valueOf(this.J(s)));
        return new czle(Boolean.valueOf(true), gyxo.b);
    }

    private final void al() {
        if(!this.N() && !this.I()) {
            czkq.a.b().h("Device token rotated, old deviceToken : %s.", czmk.g(this.K));
            this.K = null;
        }
    }

    private final void am() {
        if(!this.R()) {
            czkq.a.d().p("Can\'t stop the BLE server socket because it was never started.", new Object[0]);
            return;
        }
        this.B.e(this.o);
        this.o = null;
    }

    private final void an(String s) {
        czso czso0 = (czso)this.k.remove(s);
        if(czso0 != null) {
            this.B.e(czso0);
        }
    }

    private final void ao() {
        if(!this.Q()) {
            czkq.a.d().p("Can\'t stop the BLE server socket because it was never started.", new Object[0]);
            return;
        }
        this.B.e(this.N);
        this.N = null;
    }

    private final void ap(Set set0, Map map0, czth czth0) {
        cvgb cvgb0 = null;
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            byte[] arr_b = czup.h(s, czth0.l());
            if(Arrays.equals(czth0.o(), arr_b) || Arrays.equals(czth0.o(), czup.g(s))) {
                czkq.a.d().k("Received an incoming BLE socket with service ID %s socket service ID hash salt %s, socket service ID hash %s, salted service ID hash %s", s, czth0.l(), czth0.o(), arr_b);
                czth0.m(s);
                czth0.n(arr_b);
                cvgb0 = (cvgb)map0.get(s);
                break;
            }
        }
        String s1 = czmk.g(czth0.o());
        if(cvgb0 == null) {
            czkq.a.b().h("Received an incoming BLE socket with service ID hash %s, but no clients map to that socket.", s1);
            czmk.A(czth0, "BLE", s1);
            return;
        }
        czvg czvg0 = new czvg(38);
        Set set1 = this.w;
        set1.add(czvg0);
        if(!czvk.f(this.B.a(czvg0))) {
            set1.remove(czvg0);
            czkq.a.c().p("Failed to accept an incoming BLE socket because BluetoothLowEnergy was unable to register the MediumOperation.", new Object[0]);
            czmk.A(czth0, "BLE", s1);
            return;
        }
        set0.add(czth0);
        czth0.g(new czpm(this, czvg0, czth0));
        cvgb0.a.e(czth0);
    }

    private final void aq() {
        if(!this.aw()) {
            czkq.a.d().p("Unable to stop the advertisement GATT server because it\'s not running.", new Object[0]);
            return;
        }
        this.B.e(this.n);
        this.n = null;
    }

    private final void ar() {
        czqz czqz0 = this.t;
        if(czqz0 != null) {
            this.B.e(czqz0);
        }
        this.t = null;
    }

    private final void as() {
        czqz czqz0 = this.p;
        if(czqz0 != null) {
            this.B.e(czqz0);
        }
        czqz czqz1 = this.q;
        if(czqz1 != null) {
            this.B.e(czqz1);
        }
        czqu czqu0 = this.r;
        if(czqu0 != null) {
            this.B.e(czqu0);
        }
        czqu czqu1 = this.s;
        if(czqu1 != null) {
            this.B.e(czqu1);
        }
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
    }

    private final void at() {
        if(!this.ax()) {
            czkq.a.b().p("Can\'t stop BLE scanning because there is no scan in progress.", new Object[0]);
            return;
        }
        this.B.e(this.g);
        this.g = null;
    }

    private final boolean au() {
        ggqj ggqj0 = ggeo.k(this.e).g().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            if(((czqn)object0).d) {
                return true;
            }
        }
        return false;
    }

    private final boolean av() {
        return !this.O.isEmpty();
    }

    private final boolean aw() {
        return this.n != null;
    }

    private final boolean ax() {
        return this.g != null;
    }

    private final boolean ay(String s) {
        Context context0 = this.d;
        if(czri.U(context0)) {
            ggdy ggdy0 = new ggdy();
            ScanFilter.Builder scanFilter$Builder0 = new ScanFilter.Builder();
            ParcelUuid parcelUuid0 = czri.a;
            ggdy0.i(scanFilter$Builder0.setServiceUuid(parcelUuid0).build());
            if(hvol.T()) {
                ggdy0.i(new ScanFilter.Builder().setServiceData(czri.b, new byte[]{0}, new byte[]{0}).build());
            }
            ggdy0.i(new ScanFilter.Builder().setServiceData(parcelUuid0, new byte[]{0}, new byte[]{0}).build());
            gged_interceptors gged0 = ggdy0.h();
            ScanSettings scanSettings0 = new ScanSettings.Builder().setScanMode((this.x ? ((int)hvog.w()) : czri.b(this.ag()))).setCallbackType(1).setLegacy(false).setPhy(((int)hvog.a.bk().v())).setReportDelay(0L).build();
            BluetoothLowEnergy.3 bluetoothLowEnergy$30 = new BluetoothLowEnergy.3(this, s);
            WorkSource workSource0 = this.ai();
            czpt czpt0 = () -> synchronized(this) {
                cztq cztq0 = this.C;
                cztq0.b();
                if(hvol.T()) {
                    cztq0.a();
                }
            };
            cump cump0 = this.E.a();
            czrf czrf0 = new czrf(context0, s, gged0, scanSettings0, bluetoothLowEnergy$30, workSource0, czpt0, this.D, cump0);
            if(!czvk.f(this.B.a(czrf0))) {
                czkq.a.e().p("Failed to start BLE extended included scanning because the MediumOperation failed to register.", new Object[0]);
                return false;
            }
            this.g = czrf0;
            return true;
        }
        ggdy ggdy1 = new ggdy();
        ggdy1.i(new ScanFilter.Builder().setServiceUuid(czri.a).build());
        ggdy1.i(new ScanFilter.Builder().setServiceData(czri.a, new byte[]{0}, new byte[]{0}).build());
        gged_interceptors gged1 = ggdy1.h();
        ScanSettings.Builder scanSettings$Builder0 = new ScanSettings.Builder();
        scanSettings$Builder0.setScanMode((this.x ? ((int)hvog.w()) : czri.b(this.ag()))).setCallbackType(1).setReportDelay(0L);
        ScanSettings scanSettings1 = scanSettings$Builder0.build();
        BluetoothLowEnergy.2 bluetoothLowEnergy$20 = new BluetoothLowEnergy.2(this, s);
        WorkSource workSource1 = this.ai();
        czpt czpt1 = () -> synchronized(this) {
            cztq cztq0 = this.C;
            cztq0.b();
            if(hvol.T()) {
                cztq0.a();
            }
        };
        cump cump1 = this.E.a();
        czrf czrf1 = new czrf(context0, s, gged1, scanSettings1, bluetoothLowEnergy$20, workSource1, czpt1, this.D, cump1);
        if(!czvk.f(this.B.a(czrf1))) {
            czkq.a.c().p("Failed to start BLE Legacy only scanning because the MediumOperation failed to register.", new Object[0]);
            return false;
        }
        this.g = czrf1;
        return true;
    }

    private static final czqq az(Map map0) {
        Collection collection0 = map0.values();
        int v = 0;
        for(Object object0: collection0) {
            SupportedServices supportedServices0 = ((czqq)object0).b.h;
            if(supportedServices0 != null) {
                v = (byte)(v | supportedServices0.d[0]);
            }
        }
        Object object1 = collection0.iterator().next();
        ((czqq)object1).b.h = new SupportedServices(((byte)v));
        int v1 = czri.af(gggq.j(map0.values(), new czpv()));
        AdvertisingOptions advertisingOptions0 = new AdvertisingOptions();
        advertisingOptions0.A = v1;
        cyyh.a(advertisingOptions0);
        return czqq.a(advertisingOptions0, ((czqq)object1).b);
    }

    static int b(int v) {
        switch(v) {
            case -1: {
                return (int)hvog.a.bk().ad();
            }
            case 1: {
                return (int)hvog.a.bk().V();
            }
            case 2: {
                return (int)hvog.a.bk().Q();
            }
            case 3: {
                return (int)hvog.a.bk().T();
            }
            default: {
                throw new IllegalArgumentException("Unknown power level " + v);
            }
        }
    }

    public final czle c(czql czql0, cump cump0) {
        czle czle1;
        synchronized(this) {
            if(cump0.d()) {
                czke.g(new cvae(czql0.a, 8, czql0.d), gylz.f, gymd.cn);
                return new czle((czql0.c ? gyxo.i : gyxo.g));
            }
            czpl czpl0 = new czpl(this, czql0, cump0);
            czle1 = this.C.k(czql0, czpl0);
        }
        return czle1;
    }

    public final czle d(czql czql0, cump cump0) {
        czle czle0;
        synchronized(this) {
            czle0 = this.Y(czql0, cump0);
        }
        return czle0;
    }

    public final czle e(czql czql0, int v, String s, byte[] arr_b, cump cump0) {
        czle czle6;
        gyxo gyxo1;
        czle czle3;
        String s1 = null;
        synchronized(this) {
            boolean z = czql0.c;
            if(z && czql0.b.d <= 0) {
                czke.g(new cvae(czql0.a, 8, czql0.d), gylz.b, gymd.by);
                return new czle(gyxo.fn);
            }
            if(z && !czri.V()) {
                czke.g(new cvae(czql0.a, 8, czql0.d), gylz.b, gymd.cg);
                return new czle(gyxo.N);
            }
            czra czra0 = this.j((arr_b == null ? null : bbmu.c(arr_b)), s);
            czuc czuc0 = czra0 == null ? null : czra0.d;
            gyxo gyxo0 = gyxo.b;
            if(czuc0 == null) {
                if(arr_b != null) {
                    s1 = bbmu.c(arr_b);
                }
                czpp czpp0 = () -> synchronized(this) {
                    czra czra0 = this.j(s1, s);
                    if(czra0 != null) {
                        this.v.remove(czra0);
                        this.B.e(czra0.a);
                        this.w.remove(czra0.a);
                    }
                };
                czqp czqp0 = new czqp(this.d, czql0, s, czpp0, this.S, cump0);
                Set set0 = this.w;
                set0.add(czqp0);
                if(czvk.f(this.B.a(czqp0))) {
                    czuc czuc1 = czqp0.g;
                    if(czuc1 != null) {
                        czra czra1 = new czra(czuc1, czqp0, s1, s);
                        this.v.add(czra1);
                    }
                    czle3 = new czle(czuc1, gyxo0);
                }
                else {
                    set0.remove(czqp0);
                    czkq.a.c().h("Failed to create an outgoing MultiplexBleSocket because the MediumOperation registration failed, %s", gxyf.b(gxye.a, s));
                    czle3 = new czle(czqp0.f);
                }
                czuc0 = (czuc)czle3.a.g();
                gyxo1 = czle3.b;
            }
            else {
                if(z && czuc0.m == null && czuc0.n == null) {
                    czke.g(new cvae(czql0.a, 8, czql0.d), gylz.g, gymd.ch);
                    return new czle(gyxo.ar);
                }
                gyxo1 = gyxo0;
            }
            if(czuc0 == null) {
                czkq.a.c().j("Failed to retrieve a physical BLE socket when creating a BLE socket, %s, %s, operation-detail=%s", gxyf.b(gxye.a, s), gxyf.b(gxye.k, czql0.a), gyxo1.name());
                return new czle(gyxo1);
            }
            czti czti0 = czuc0.b(czql0, v);
            if(czti0 == null) {
                cunf cunf0 = czkq.a;
                cunf0.c().i("Failed to create a per-client BLE socket, %s, %s", gxyf.b(gxye.a, s), gxyf.b(gxye.k, czql0.a));
                if(arr_b == null) {
                    cunf0.b().p("Close the multiplex socket since deviceToken is null and bleSocket is null.", new Object[0]);
                    czuc0.e();
                }
                return new czle((z ? gyxo.bZ : gyxo.bY));
            }
            czle6 = new czle(czti0, gyxo0);
        }
        return czle6;
    }

    public final czle f(czqh czqh0) {
        byte[] arr_b1;
        synchronized(this) {
            ParcelUuid parcelUuid0 = czqh0.d;
            if(parcelUuid0 != null && this.L != null) {
                czke.h(czqh0.a, 2, gymp.b);
                return new czle(Boolean.valueOf(false), gyxo.aw);
            }
            String s = czqh0.a;
            if(this.O(s)) {
                czke.h(s, 2, gymp.c);
                return new czle(Boolean.valueOf(false), gyxo.aV);
            }
            if(this.P()) {
                if(parcelUuid0 == null) {
                    arr_b1 = this.L == null ? null : this.L.b;
                }
                else {
                    byte[] arr_b = czqh0.c;
                    arr_b1 = czry.c(2, 2, null, arr_b, this.X(), true, ((boolean)(cumz.j(this.d) ^ 1)), this.a(), null);
                    if(arr_b1 == null) {
                        String s1 = String.format("deviceToken : %s, advertisementBytes: %s", czmk.g(this.X()), czmk.g(arr_b));
                        czke.j(s, 2, gylz.b, gymd.k, s1);
                        return new czle(Boolean.valueOf(false), gyxo.ft);
                    }
                }
                boolean z = czqh0.e;
                if(parcelUuid0 == null && (z && !this.av())) {
                    if(this.O.isEmpty()) {
                        czkq.a.d().p("Aggressively stopping any pre-existing advertisement GATT servers because no incoming BLE sockets are connected.", new Object[0]);
                        this.aq();
                    }
                    if(!this.aw()) {
                        BluetoothManager bluetoothManager0 = this.z;
                        if(bluetoothManager0 == null) {
                            czkq.a.c().p("Fail to start an advertisement GATT server because bluetoothAdapter is not available.", new Object[0]);
                            czkq.a.c().h("Failed to start BLE advertising for service ID %s because the advertisement GATT server failed to start.", s);
                            return new czle(Boolean.valueOf(false), gyxo.dC);
                        }
                        fgum fgum0 = new fgum();
                        fgul fgul0 = new fgul();
                        for(int v1 = 0; v1 < this.G; ++v1) {
                            czqc czqc0 = new czqc(this, v1);
                            BluetoothGattCharacteristic bluetoothGattCharacteristic0 = new BluetoothGattCharacteristic(czup.d(czqc0.a), 2, 1);
                            fgul0.a.put(bluetoothGattCharacteristic0, czqc0);
                        }
                        UUID uUID0 = czup.e(((boolean)(cumz.j(this.d) ^ 1)));
                        fgum0.a.put(uUID0, fgul0);
                        czqe czqe0 = new czqe(this.d, bluetoothManager0, fgum0, s);
                        if(!czvk.f(this.B.a(czqe0))) {
                            czkq.a.c().p("Fail to start an advertisement GATT server because BluetoothLowEnergy was unable to register the MediumOperation.", new Object[0]);
                            czkq.a.c().h("Failed to start BLE advertising for service ID %s because the advertisement GATT server failed to start.", s);
                            return new czle(Boolean.valueOf(false), gyxo.dC);
                        }
                        this.n = czqe0;
                    }
                    Map map0 = this.j;
                    if(map0.containsKey(s)) {
                        czkq.a.e().h("Cannot add a GATT advertisement because it already exists in the advertisement GATT server, %s", gxyf.b(gxye.k, s));
                        czkq.a.c().h("Failed to start BLE advertising for service ID %s because the GATT advertisements were unable to be added to the advertisement GATT server.", s);
                        return new czle(Boolean.valueOf(false), gyxo.dD);
                    }
                    int v2 = 0;
                label_55:
                    while(v2 < this.G) {
                        int v3 = v2;
                        while(true) {
                            if(v3 >= v2 + 1) {
                                goto label_64;
                            }
                            if(this.h.get(Integer.valueOf(v3)) == null) {
                                ++v3;
                                continue;
                            }
                            ++v2;
                            continue label_55;
                        }
                    }
                    v2 = -1;
                label_64:
                    if(v2 < 0) {
                        czke.h(s, 2, gymp.e);
                        czkq.a.c().h("Failed to start BLE advertising for service ID %s because the GATT advertisements were unable to be added to the advertisement GATT server.", s);
                        return new czle(Boolean.valueOf(false), gyxo.dD);
                    }
                    byte[] arr_b2 = czup.g(s);
                    byte[] arr_b3 = this.X();
                    int v4 = cumz.j(this.d) ^ 1;
                    int v5 = this.a();
                    byte[] arr_b4 = czry.c(2, 2, arr_b2, czqh0.c, arr_b3, false, ((boolean)v4), v5, czqh0.f);
                    if(arr_b4 == null) {
                        czke.i(s, 2, gylz.b, gymd.m);
                        czkq.a.c().h("Failed to start BLE advertising for service ID %s because the GATT advertisements were unable to be added to the advertisement GATT server.", s);
                        return new czle(Boolean.valueOf(false), gyxo.dD);
                    }
                    Integer integer0 = v2;
                    czqf czqf0 = new czqf(s, arr_b4, czqh0.b);
                    this.h.put(integer0, czqf0);
                    bxf bxf0 = new bxf();
                    bxf0.add(integer0);
                    map0.put(s, bxf0);
                }
                else if(parcelUuid0 == null) {
                    byte[] arr_b5 = czup.g(s);
                    byte[] arr_b6 = this.X();
                    int v6 = this.a();
                    byte[] arr_b7 = czry.c(2, 2, arr_b5, czqh0.c, arr_b6, false, false, v6, czqh0.f);
                    if(arr_b7 != null) {
                        czqf czqf1 = new czqf(s, arr_b7, czqh0.b);
                        this.i.put(s, czqf1);
                        czkq.a.b().i("Adds advertisements into queue for later legacy advertising usage. Allow Gatt : %s, hasConnectedGattClient : %s", Boolean.valueOf(z), Boolean.valueOf(this.av()));
                    }
                }
                if(parcelUuid0 != null) {
                    this.L = new czqg(czqh0, arr_b1);
                }
                this.as();
                czle czle0 = this.ak(s, czqh0.f);
                if(Objects.equals(czle0.a.d(), Boolean.valueOf(false))) {
                    czkq.a.c().h("Failed to start BLE advertising for service ID %s because the BLE advertisement failed to start.", s);
                    this.B(s);
                    return czle0;
                }
                cunf cunf0 = czkq.a.b();
                String s2 = czmk.g(this.X());
                cunf0.j("Successfully started BLE advertising of size %s for service %s, deviceToken : %s.", Integer.valueOf(czqh0.c.length), s, s2);
                return new czle(Boolean.valueOf(true), gyxo.b);
            }
            gymd gymd0 = this.l();
            czke.i(s, 2, gylz.c, gymd0);
        }
        return new czle(Boolean.valueOf(false), gyxo.M);
    }

    public final czle g(czqq czqq0, String s) {
        synchronized(this) {
            if(this.S(s)) {
                czke.h(s, 2, gymp.c);
                return new czle(Boolean.valueOf(false), gyxo.gj);
            }
            if(!this.P()) {
                gymd gymd0 = this.l();
                czke.i(s, 2, gylz.c, gymd0);
                return new czle(Boolean.valueOf(false), gyxo.gj);
            }
            Map map0 = this.m;
            map0.put(s, czqq0);
            if(this.M == null) {
                this.M = czqq0;
            }
            else {
                czqq czqq1 = czri.az(map0);
                if(czqq1.equals(this.M)) {
                    czkq.a.b().h("Successfully reuse existing DCT advertising for service %s.", s);
                    return new czle(Boolean.valueOf(true), gyxo.b);
                }
                this.M = czqq1;
            }
            this.ar();
            czle czle0 = this.aj(czqq0, s);
            if(Objects.equals(czle0.a.d(), Boolean.valueOf(false))) {
                czkq.a.e().h("Failed to start DCT advertising for service ID %s because the BLE advertisement failed to start.", s);
                this.D(s);
                return czle0;
            }
            czkq.a.b().h("Successfully started DCT advertising for service %s", s);
        }
        return new czle(Boolean.valueOf(true), gyxo.b);
    }

    public final czle h(czqr czqr0, czqs czqs0) {
        synchronized(this) {
            String s = czqr0.a;
            if(this.T(s)) {
                czke.h(s, 6, gymr.a);
                return new czle(Boolean.valueOf(false), gyxo.gk);
            }
            if(!this.P()) {
                gymd gymd0 = this.l();
                czke.i(s, 6, gylz.c, gymd0);
                return new czle(Boolean.valueOf(false), gyxo.gk);
            }
            int v1 = this.ag();
            cztq cztq0 = this.C;
            cztq0.d(s, czqs0);
            this.E.b("DCT_" + s);
            this.f.put(s, czqr0);
            int v2 = this.ag();
            if(this.T == null) {
                this.T = new czpy(this);
            }
            cztq0.e("NearbyConnections.EnvironmentMonitor", this.T, null);
            if(this.ax() && v1 != v2) {
                this.at();
            }
            if(!this.ax() && !this.ay(s)) {
                czkq.a.e().h("Failed to start DCT BLE scanning, %s", gxyf.b(gxye.k, s));
                this.E(s);
                return new czle(Boolean.valueOf(false), gyxo.gk);
            }
            cunf cunf0 = czkq.a.b();
            int v3 = czri.b(this.ag());
            cunf0.i("[BluetoothLowEnergy] Started BLE DCT scanning, client info : {%s}, %s", czqr0, gxyf.a(gxye.d, v3));
        }
        return new czle(Boolean.valueOf(true), gyxo.b);
    }

    public final czle i(czqn czqn0, czqs czqs0) {
        synchronized(this) {
            String s = czqn0.a;
            if(this.W(s)) {
                czke.h(s, 6, gymr.a);
                return new czle(Boolean.valueOf(false), gyxo.ba);
            }
            if(!this.P()) {
                gymd gymd0 = this.l();
                czke.i(s, 6, gylz.c, gymd0);
                return new czle(Boolean.valueOf(false), gyxo.M);
            }
            int v1 = this.ag();
            boolean z = this.au();
            cztq cztq0 = this.C;
            cztq0.e(s, czqs0, czqn0.e);
            this.e.put(s, czqn0);
            this.E.b(s);
            int v2 = this.ag();
            boolean z1 = this.au();
            if(this.T == null) {
                this.T = new czpy(this);
            }
            cztq0.e("NearbyConnections.EnvironmentMonitor", this.T, null);
            if(this.ax() && (v1 != v2 || z != z1)) {
                this.at();
            }
            if(!this.ax() && !this.ay(s)) {
                czkq.a.e().h("Failed to start BLE scanning, %s", gxyf.b(gxye.k, s));
                this.F(s);
                return new czle(Boolean.valueOf(false), gyxo.dJ);
            }
            cunf cunf0 = czkq.a.b();
            String s1 = gxyf.b(gxye.k, s);
            boolean z2 = czri.U(this.d);
            String s2 = gxyf.c(gxye.i, z2);
            int v3 = this.ag();
            String s3 = gxyf.a(gxye.j, v3);
            int v4 = czri.b(this.ag());
            cunf0.k("Started BLE scanning, %s, %s, %s, %s", s1, s2, s3, gxyf.a(gxye.d, v4));
        }
        return new czle(Boolean.valueOf(true), gyxo.b);
    }

    final czra j(String s, String s1) {
        if(s != null) {
            for(Object object0: this.v) {
                czra czra0 = (czra)object0;
                if(s.equals(czra0.b)) {
                    List list0 = czra0.c;
                    if(!list0.contains(s1)) {
                        czkq.a.d().h("Adds untracked BLE MAC address into info. %s", s1);
                        list0.add(s1);
                    }
                    return czra0;
                }
            }
        }
        for(Object object1: this.v) {
            czra czra1 = (czra)object1;
            if((s == null || czra1.b == null) && czra1.c.contains(s1)) {
                if(czra1.b == null && s != null) {
                    czkq.a.b().h("Updates DeviceTokenKey back to info : %s.", s);
                    czra1.b = s;
                }
                return czra1;
            }
        }
        return null;
    }

    public final czrx k(fgva fgva0, int v, czrx czrx0, int v1, Set set0, boolean z) {
        czrx czrx1;
        synchronized(this) {
            czrx1 = czrx0 == null ? new czrx() : czrx0;
            bsaq bsaq0 = this.A;
            if(bsaq0 == null) {
                czkq.a.b().p("Failed to fetch advertisement due to bluetooth adapter missing.", new Object[0]);
                return czrx1;
            }
            if(!this.au()) {
                czkq.a.b().p("Not allow Gatt actions during scanning.", new Object[0]);
                return czrx1;
            }
            if(!this.P()) {
                String s = new gfss(", ").b(set0);
                gymd gymd0 = this.l();
                czke.i(s, 6, gymr.i, gymd0);
                return czrx1;
            }
            fguf fguf0 = fgug.a();
            fguf0.b();
            fguf0.c(hvog.m());
            fgug fgug0 = fguf0.a();
            cump cump0 = this.E.a();
            czqw czqw0 = new czqw(this.d, bsaq0.b, fgva0, fgug0, v, czrx1, cump0, v1, set0, z);
            czvk czvk0 = this.B;
            if(!czvk.f(czvk0.a(czqw0))) {
                czkq.a.c().p("Failed to read from an advertisement GATT server because the MediumOperation was unable to be registered.", new Object[0]);
            }
            czvk0.e(czqw0);
        }
        return czrx1;
    }

    public final gymd l() {
        Context context0 = this.d;
        if(!context0.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return gymd.g;
        }
        if(!context0.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
            return gymd.f;
        }
        if(this.z == null) {
            return gymd.h;
        }
        if(this.A == null) {
            return gymd.i;
        }
        return hvol.aQ() ? gymd.a : gymd.d;
    }

    public final void m(String s) {
        synchronized(this) {
            czsl czsl0 = (czsl)this.l.remove(s);
            if(czsl0 == null) {
                czkq.a.b().h("Can\'t disconnect Ble L2CAP over IPv6 connections because it was never started, %s", gxyf.b(gxye.k, s));
                return;
            }
            this.B.e(czsl0);
            czkq.a.b().h("Disconnect BleL2capClientOverIpv6, %s", gxyf.b(gxye.k, s));
        }
    }

    public static void n() {
        try {
            long v = hvog.a.bk().S() - (SystemClock.elapsedRealtime() - czri.y);
            if(v > 0L) {
                Thread.sleep(v);
            }
            czri.y = SystemClock.elapsedRealtime();
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
        }
    }

    public final void o(Runnable runnable0) {
        this.R.execute(runnable0);
    }

    final void p(BleSighting bleSighting0) {
        synchronized(this) {
            czpi czpi0 = new czpi(this);
            this.C.l(bleSighting0, czpi0);
        }
    }

    // Detected as a lambda impl.
    public final void q(String s, String s1) {
        synchronized(this) {
            czra czra0 = this.j(s, s1);
            if(czra0 != null) {
                this.v.remove(czra0);
                this.B.e(czra0.a);
                this.w.remove(czra0.a);
            }
        }
    }

    // Detected as a lambda impl.
    public final void r(czth czth0) {
        synchronized(this) {
            this.ap(this.O, this.H, czth0);
        }
    }

    // Detected as a lambda impl.
    public final void s(czth czth0) {
        synchronized(this) {
            this.ap(this.Q, this.J, czth0);
        }
    }

    // Detected as a lambda impl.
    public final void t(czth czth0) {
        synchronized(this) {
            this.ap(this.P, this.I, czth0);
        }
    }

    // Detected as a lambda impl.
    public final void u() {
        synchronized(this) {
            cztq cztq0 = this.C;
            cztq0.b();
            if(hvol.T()) {
                cztq0.a();
            }
        }
    }

    public final void v(czvg czvg0, czth czth0) {
        synchronized(this) {
            this.B.e(czvg0);
            if(!czth0.q()) {
                this.O.remove(czth0);
            }
            else if(hvol.T() && (czth0 instanceof czsp)) {
                this.Q.remove(czth0);
            }
            else {
                this.P.remove(czth0);
            }
            this.w.remove(czvg0);
            if(this.O.isEmpty()) {
                if(this.j.isEmpty()) {
                    this.aq();
                }
                if(this.H.isEmpty()) {
                    this.am();
                }
            }
            if(this.P.isEmpty() && this.I.isEmpty()) {
                this.ao();
            }
            if(hvol.T() && this.Q.isEmpty() && this.J.isEmpty()) {
                this.an(czth0.k());
            }
        }
    }

    public final void w() {
        synchronized(this) {
            cuui.h(this.D, "BluetoothLowEnergy.onLostExecutor");
            cuui.h(this.R, "BluetoothLowEnergy.singleThreadOffloader");
            bxe bxe0 = new bxe(new bxf(this.j.keySet()));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                this.B(((String)object0));
            }
            this.i.clear();
            this.aq();
            this.m.clear();
            this.ar();
            this.M = null;
            bxe bxe1 = new bxe(new bxf(this.H.keySet()));
            while(bxe1.hasNext()) {
                Object object1 = bxe1.next();
                this.y(((String)object1));
            }
            bxe bxe2 = new bxe(new bxf(this.I.keySet()));
            while(bxe2.hasNext()) {
                Object object2 = bxe2.next();
                this.z(((String)object2));
            }
            if(hvol.T()) {
                Map map0 = this.J;
                bxe bxe3 = new bxe(new bxf(map0.keySet()));
                while(bxe3.hasNext()) {
                    Object object3 = bxe3.next();
                    this.A(((String)object3));
                }
                map0.clear();
            }
            if(this.R()) {
                czvk czvk0 = this.B;
                czvk0.e(this.o);
                this.o = null;
                czqx czqx0 = this.N;
                if(czqx0 != null) {
                    czvk0.e(czqx0);
                    this.N = null;
                }
                if(hvol.T()) {
                    Map map1 = this.k;
                    for(Object object4: map1.keySet()) {
                        this.an(((String)object4));
                    }
                    map1.clear();
                }
            }
            else {
                czkq.a.d().p("Can\'t stop the BLE server socket because it was never started.", new Object[0]);
            }
            bxe bxe4 = new bxe(new bxf(this.e.keySet()));
            while(bxe4.hasNext()) {
                Object object5 = bxe4.next();
                this.F(((String)object5));
            }
            bxe bxe5 = new bxe(new bxf(this.f.keySet()));
            while(bxe5.hasNext()) {
                Object object6 = bxe5.next();
                this.E(((String)object6));
            }
            this.C.c();
            this.u.d();
            cuui.h(this.F, "BluetoothLowEnergy.instantOnLostExecutor");
        }
    }

    public final void x(String s) {
        synchronized(this) {
            if(this.L(s)) {
                this.I.remove(s);
                if(this.I.isEmpty() && this.P.isEmpty()) {
                    this.ao();
                }
            }
            if(this.K(s)) {
                this.H.remove(s);
                if(this.H.isEmpty() && this.O.isEmpty()) {
                    this.am();
                }
            }
            this.al();
        }
    }

    public final void y(String s) {
        synchronized(this) {
            if(!this.K(s)) {
                czkq.a.b().h("Can\'t stop accepting BLE GATT connections because it was never started, %s", gxyf.b(gxye.k, s));
                return;
            }
            this.H.remove(s);
            if(this.H.isEmpty() && this.O.isEmpty()) {
                this.am();
            }
            this.al();
            czkq.a.b().h("Stop accepting BLE GATT Connections, %s", gxyf.b(gxye.k, s));
        }
    }

    public final void z(String s) {
        synchronized(this) {
            if(!this.L(s)) {
                czkq.a.b().h("Can\'t stop accepting BLE L2CAP connections because it was never started, %s", gxyf.b(gxye.k, s));
                return;
            }
            this.I.remove(s);
            if(this.I.isEmpty() && this.P.isEmpty()) {
                this.ao();
            }
            this.al();
            czkq.a.b().h("Stop accepting BLE L2CAP connections, %s", gxyf.b(gxye.k, s));
        }
    }
}

