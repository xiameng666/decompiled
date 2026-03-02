import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.ParcelUuid;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.nearby.common.ble.BleSighting;
import com.google.android.gms.nearby.connection.v3.dct.BleL2CapPsm;
import com.google.android.gms.nearby.connection.v3.dct.DeviceInfo;
import com.google.android.gms.nearby.connection.v3.dct.DevicePlatform;
import com.google.android.gms.nearby.connection.v3.dct.ServiceIdHash;
import com.google.android.gms.nearby.connection.v3.dct.SessionId;
import com.google.android.gms.nearby.connection.v3.dct.SupportedServices;
import com.google.android.gms.nearby.connection.v3.dct.TransmitPower;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class cztq {
    static final byte[] a;
    final gfvb b;
    boolean c;
    private final Map d;
    private final Map e;
    private final gghp f;
    private final Map g;
    private final Map h;
    private final Map i;
    private final Map j;
    private final Map k;
    private final gfza l;
    private final ggpj m;
    private final Map n;
    private final Map o;
    private final Map p;
    private int q;
    private final Context r;

    static {
        cztq.a = new byte[]{81, 67, 65, 65, 65, 66, 65, 67, 65, 65, 65, 68, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65};
    }

    public cztq(Context context0) {
        this.d = new bxd();
        this.e = new bxd();
        this.f = new gfza();
        this.g = new bxd();
        this.h = new bxd();
        this.i = new bxd();
        this.j = new bxd();
        this.k = new bxd();
        this.l = new gfza();
        this.m = ggcx.l();
        this.n = new bxd();
        this.o = new bxd();
        this.p = new bxd();
        this.q = 0;
        this.c = false;
        this.r = context0;
        gfvh gfvh0 = new gfvh();
        gfvh0.h(hvog.v());
        this.b = gfvh0.b();
    }

    public final void a() {
        synchronized(this) {
            bxe bxe0 = new bxe(((bxf)this.p()));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                String s = (String)object0;
                czrm czrm0 = (czrm)this.h.get(s);
                if(czrm0 == null) {
                    czkq.a.e().h("Failed to find DCT entity tracker for service id : %s", s);
                }
                else {
                    bxe bxe1 = new bxe(((bxf)czrm0.a()));
                    while(bxe1.hasNext()) {
                        Object object1 = bxe1.next();
                        cztn cztn0 = (cztn)object1;
                        if(this.f.E(s, cztn0)) {
                            czqs czqs0 = (czqs)this.e.get(s);
                            if(czqs0 == null) {
                                czkq.a.e().h("Failed to find callback to report lostDctAdvertisements for service id : %s.", s);
                            }
                            else {
                                czqs0.b(cztn0);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        synchronized(this) {
            int v1 = this.m() + this.n();
            if(hvol.t() && this.q > 0) {
                czkq.a.b().h("Found Tx Advertisements : %d times", Integer.valueOf(this.q));
                this.q = 0;
            }
            if(v1 == 0) {
                czkq.a.b().p("No BLE Fast/GATT advertisements found in the latest cycle.", new Object[0]);
                v1 = 0;
            }
            if(hvol.t()) {
                czkq.a.b().h("Current Tracked Scanning Clients are : %s", this.q());
            }
            gfvb gfvb0 = this.b;
            gfvb0.h(Long.valueOf(SystemClock.elapsedRealtime()), Integer.valueOf(v1));
            Map map0 = this.d;
            czqs czqs0 = (czqs)map0.get("NearbyConnections.EnvironmentMonitor");
            if(czqs0 != null) {
                if(this.c) {
                label_35:
                    if(this.c && !cztq.w(this.r) && gfvb0.b() >= hvog.v()) {
                        gged_interceptors gged1 = gged_interceptors.i(((gfwl)gfvb0).a.values());
                        int v5 = gged1.size();
                        int v6 = 0;
                        while(v6 < v5) {
                            long v7 = (long)(((int)(((Integer)gged1.get(v6)))));
                            ++v6;
                            if(v7 < hvog.u()) {
                                continue;
                            }
                            goto label_47;
                        }
                        czkq.a.b().p("Device enters clean environment.", new Object[0]);
                        this.c = false;
                        czqs0.c(false);
                    }
                }
                else if(cztq.w(this.r)) {
                    czkq.a.b().p("enterCongestedEnvironment : Device is under power save mode.", new Object[0]);
                    this.c = true;
                    czqs0.c(true);
                }
                else {
                    if(gfvb0.b() >= hvog.v()) {
                        gged_interceptors gged0 = gged_interceptors.i(((gfwl)gfvb0).a.values());
                        int v2 = gged0.size();
                        int v3 = 0;
                        while(v3 < v2) {
                            long v4 = (long)(((int)(((Integer)gged0.get(v3)))));
                            ++v3;
                            if(v4 >= hvog.u()) {
                                continue;
                            }
                            goto label_35;
                        }
                        czkq.a.b().p("Device enters congested environment.", new Object[0]);
                        this.c = true;
                        czqs0.c(true);
                        goto label_47;
                    }
                    goto label_35;
                }
            }
        label_47:
            bxe bxe0 = new bxe(((bxf)this.q()));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                String s = (String)object0;
                czrm czrm0 = (czrm)this.g.get(s);
                if(czrm0 == null) {
                    czkq.a.e().h("Failed to find entity tracker for service id : %s", s);
                }
                else {
                    bxe bxe1 = new bxe(((bxf)czrm0.a()));
                    while(bxe1.hasNext()) {
                        Object object1 = bxe1.next();
                        czry czry0 = (czry)object1;
                        this.r(s, czry0);
                        czqs czqs1 = (czqs)map0.get(s);
                        if(czqs1 == null) {
                            czkq.a.e().h("Failed to find callback to report lostGattAdvertisements for service id : %s.", s);
                        }
                        else {
                            czqs1.g(czsy.a(czry0));
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        synchronized(this) {
            this.n.clear();
            this.o.clear();
            this.m.i();
            this.l.s();
            this.k.clear();
            this.j.clear();
            this.i.clear();
            this.g.clear();
            this.d.clear();
            this.p.clear();
            this.e.clear();
            this.f.s();
            this.h.clear();
        }
    }

    public final void d(String s, czqs czqs0) {
        synchronized(this) {
            Map map0 = this.e;
            if(map0.containsKey(s)) {
                czkq.a.d().h("startDctTracking : %s is still tracking, do not reset tracker.", s);
                return;
            }
            map0.put(s, czqs0);
            czrm czrm0 = new czrm();
            this.h.put(s, czrm0);
        }
    }

    public final void e(String s, czqs czqs0, ParcelUuid parcelUuid0) {
        synchronized(this) {
            Map map0 = this.d;
            if(map0.containsKey(s)) {
                czkq.a.d().h("startTracking : %s is still tracking, do not reset tracker.", s);
                return;
            }
            map0.put(s, czqs0);
            czrm czrm0 = new czrm();
            this.g.put(s, czrm0);
            if(parcelUuid0 != null) {
                this.i.put(s, parcelUuid0);
            }
            this.j.clear();
            gfza gfza0 = this.l;
            bxe bxe0 = new bxe(new bxf(gfza0.z()));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                czry czry0 = (czry)object0;
                if(gfza0.A(czry0, s)) {
                    this.r(s, czry0);
                }
            }
        }
    }

    public final void f(String s) {
        synchronized(this) {
            this.h.remove(s);
            this.e.remove(s);
            this.f.h(s);
            if(this.d.isEmpty() && this.e.isEmpty()) {
                this.c = false;
                this.b.e();
            }
        }
    }

    public final void g(String s) {
        synchronized(this) {
            this.i.remove(s);
            this.g.remove(s);
            this.d.remove(s);
            if(this.d.isEmpty()) {
                this.p.clear();
                if(!hvol.T() || this.e.isEmpty()) {
                    this.c = false;
                    this.b.e();
                }
            }
        }
    }

    public static boolean h(byte b) {
        return (b & 0xF0) >> 4 == 2 && (b & 15) == 1;
    }

    static byte[] i(byte[] arr_b) {
        return czmk.Y(arr_b, 4);
    }

    public final czle j(czql czql0, czpn czpn0) {
        czle czle3;
        synchronized(this) {
            czsy czsy0 = czql0.b;
            String s = czsy0.c;
            boolean z = TextUtils.isEmpty(s);
            ByteString hfsf0 = czsy0.e;
            if(!z) {
                czkq.a.b().p("[DiscoveredPeripheralTracker] bleMacAddress is not empty.", new Object[0]);
                if(hfsf0 != null) {
                    hfsf0.toByteArray();
                }
                return czpn0.a(s);
            }
            cztn cztn0 = czsy0.b;
            if(cztn0 == null) {
                czkq.a.e().p("[DiscoveredPeripheralTracker] Failed to create dct advertisement for blePeripheral.", new Object[0]);
                return new czle(gyxo.eo);
            }
            String s1 = (String)this.o.get(cztn0);
            if(s1 == null) {
                czke.j(czql0.a, 8, gymb.a, gymd.cn, String.format("Can\'t find MAC Address for %s", czsy0));
                czkq.a.e().p("[DiscoveredPeripheralTracker] macAddress is null.", new Object[0]);
                return new czle(gyxo.dZ);
            }
            try {
                Thread.sleep(hvog.J());
            }
            catch(InterruptedException unused_ex) {
                czke.h(czql0.a, 8, gymb.e);
                Thread.currentThread().interrupt();
            }
            if(hfsf0 != null) {
                hfsf0.toByteArray();
            }
            czle3 = czpn0.a(s1);
        }
        return czle3;
    }

    public final czle k(czql czql0, czpl czpl0) {
        czle czle3;
        synchronized(this) {
            czsy czsy0 = czql0.b;
            String s = czsy0.c;
            if(!TextUtils.isEmpty(s)) {
                ByteString hfsf0 = czql0.b.e;
                return czpl0.a(2, s, (hfsf0 == null ? null : hfsf0.toByteArray()));
            }
            czry czry0 = czsy0.a;
            if(czry0 == null) {
                czkq.a.e().p("Failed to create gatt advertisement for blePeripheral.", new Object[0]);
                return new czle(gyxo.eo);
            }
            if(!this.n.containsKey(czry0)) {
                czke.j(czql0.a, 8, gymb.a, gymd.cn, String.format("Can\'t find MAC Address for %s", czsy0));
                return new czle(gyxo.dZ);
            }
            String s1 = czql0.a;
            long v1 = SystemClock.elapsedRealtime();
            czrz czrz0 = (czrz)this.m.a(s1, czry0);
            Map map0 = this.j;
            if(map0.containsKey(czrz0)) {
                long v2 = map0.containsKey(czrz0) ? ((czrx)map0.get(czrz0)).a() : 0L;
                try {
                    Thread.sleep(Math.max(0L, hvog.J() - v2));
                }
                catch(InterruptedException unused_ex) {
                    czke.h(s1, 8, gymb.e);
                    Thread.currentThread().interrupt();
                }
            }
            if(hvol.aa()) {
                czkq.a.b().h("[PERFORMANCE] Connection : Sleep Gatt connection request took %d ms.", Long.valueOf(SystemClock.elapsedRealtime() - v1));
            }
            String s2 = (String)this.n.get(czry0);
            czle3 = czpl0.a(czry0.b, s2, czry0.f);
        }
        return czle3;
    }

    public final void l(BleSighting bleSighting0, czpi czpi0) {
        cztu cztu0;
        cztt cztt0;
        cztp cztp5;
        byte[] arr_b9;
        boolean z;
        DeviceInfo deviceInfo0;
        SupportedServices supportedServices0;
        ServiceIdHash serviceIdHash0;
        BleL2CapPsm bleL2CapPsm0;
        TransmitPower transmitPower0;
        DevicePlatform devicePlatform0;
        SessionId sessionId0;
        cztn cztn0;
        synchronized(this) {
            int v1 = 5;
            BluetoothDevice bluetoothDevice0 = bleSighting0.a;
            int v2 = 0;
            if(bluetoothDevice0 != null) {
                if(hvol.T() && !this.p().isEmpty() && hvol.T()) {
                    ParcelUuid parcelUuid0 = new ParcelUuid(czup.c);
                    byte[] arr_b = bleSighting0.b.c(parcelUuid0);
                    if(arr_b != null) {
                        int v3 = (arr_b[0] & 0xE0) >> 5;
                        if(v3 == 1) {
                            cztn0 = new cztn();
                            int v4 = 1;
                        alab1:
                            while(true) {
                                if(v4 >= arr_b.length) {
                                    goto label_157;
                                }
                                int v5 = cvya.b(arr_b, v4);
                                int v6 = cvya.d(arr_b, v4);
                                int v7 = v5 + v4 + v6;
                                if(v6 == 0 || v7 > arr_b.length) {
                                    czkq.a.b().p("Cannot deserialize BleAdvertisement: invalid data element length.", new Object[0]);
                                    break;
                                }
                                byte[] arr_b1 = Arrays.copyOfRange(arr_b, v4, v7);
                                int v8 = 6;
                                int v9 = 3;
                                switch(cvya.e(arr_b1)) {
                                    case 1: {
                                        if(cvya.e(arr_b1) == 1) {
                                            int v10 = cvya.c(arr_b1);
                                            int v11 = cvya.a(arr_b1);
                                            if(v10 != 6) {
                                                v8 = v10;
                                            }
                                            else if(arr_b1.length == v11 + 6) {
                                                sessionId0 = new SessionId(Arrays.copyOfRange(arr_b1, v11, v11 + 6));
                                                goto label_38;
                                            }
                                            Log.i("SessionId", String.format("Incorrect size for Session Id: expected %d, actual %d", ((int)(v11 + v8)), ((int)arr_b1.length)));
                                        }
                                        else {
                                            Log.i("SessionId", String.format("Failed to parse Session Id due to incorrect data element type: %X.", cvya.e(arr_b1)));
                                        }
                                        sessionId0 = null;
                                    label_38:
                                        if(sessionId0 == null) {
                                            czkq.a.b().p("Cannot deserialize BleAdvertisement: invalid SessionId.", new Object[0]);
                                            break alab1;
                                        }
                                        cztn0.c = sessionId0;
                                        break;
                                    }
                                    case 2: {
                                        if(cvya.e(arr_b1) == 2) {
                                            int v12 = cvya.c(arr_b1);
                                            int v13 = cvya.a(arr_b1);
                                            if(v12 == 1) {
                                                if(arr_b1.length == v13 + 1) {
                                                    int v14 = arr_b1[v13];
                                                    if(v14 > 0 && v14 <= 4) {
                                                        devicePlatform0 = new DevicePlatform(v14);
                                                        goto label_60;
                                                    }
                                                    else {
                                                        Log.i("NC_DevicePlatform", String.format("Incorrect platform value: min %d, max %d, actual %d", ((int)1), ((int)4), v14));
                                                        goto label_59;
                                                    }
                                                }
                                                else {
                                                    v12 = 1;
                                                }
                                            }
                                            Log.i("NC_DevicePlatform", String.format("Incorrect size for device platform: expected %d, actual %d", ((int)(v13 + v12)), ((int)arr_b1.length)));
                                        }
                                        else {
                                            Log.i("NC_DevicePlatform", String.format("Failed to parse Device Platform due to incorrect data element type: %X.", cvya.e(arr_b1)));
                                        }
                                    label_59:
                                        devicePlatform0 = null;
                                    label_60:
                                        if(devicePlatform0 == null) {
                                            czkq.a.b().p("Cannot deserialize BleAdvertisement: invalid DevicePlatform.", new Object[0]);
                                            break alab1;
                                        }
                                        cztn0.d = devicePlatform0;
                                        break;
                                    }
                                    case 3: {
                                        if(cvya.e(arr_b1) == 3) {
                                            int v15 = cvya.c(arr_b1);
                                            int v16 = cvya.a(arr_b1);
                                            if(v15 == 1) {
                                                if(arr_b1.length == v16 + 1) {
                                                    transmitPower0 = new TransmitPower(arr_b1[v16]);
                                                    goto label_78;
                                                }
                                                else {
                                                    v15 = 1;
                                                }
                                            }
                                            Log.i("NC_TransmitPower", String.format("Incorrect size for Transmit Power: expected %d, actual %d", ((int)(v16 + v15)), ((int)arr_b1.length)));
                                        }
                                        else {
                                            Log.i("NC_TransmitPower", String.format("Failed to parse Transmit Power due to incorrect data element type: %X.", cvya.e(arr_b1)));
                                        }
                                        transmitPower0 = null;
                                    label_78:
                                        if(transmitPower0 == null) {
                                            czkq.a.b().p("Cannot deserialize BleAdvertisement: invalid TransmitPower.", new Object[0]);
                                            break alab1;
                                        }
                                        cztn0.e = transmitPower0;
                                        break;
                                    }
                                    case 4: {
                                        if(cvya.e(arr_b1) == 4) {
                                            int v17 = cvya.a(arr_b1);
                                            int v18 = cvya.c(arr_b1);
                                            if(v18 == 2) {
                                                if(arr_b1.length == v17 + 2) {
                                                    bleL2CapPsm0 = new BleL2CapPsm(Arrays.copyOfRange(arr_b1, v17, v17 + 2));
                                                    goto label_96;
                                                }
                                                else {
                                                    v18 = 2;
                                                }
                                            }
                                            Log.i("NC_BleL2CapPsm", String.format("Incorrect size for BLE L2CAP PSM, expected %d, actual %d", ((int)(v17 + v18)), ((int)arr_b1.length)));
                                        }
                                        else {
                                            Log.i("NC_BleL2CapPsm", String.format("Failed to parse BLE L2CAP PSM due to incorrect data element type: %X.", cvya.e(arr_b1)));
                                        }
                                        bleL2CapPsm0 = null;
                                    label_96:
                                        if(bleL2CapPsm0 == null) {
                                            czkq.a.b().p("Cannot deserialize BleAdvertisement: invalid BleL2CapPsm.", new Object[0]);
                                            break alab1;
                                        }
                                        cztn0.f = bleL2CapPsm0;
                                        break;
                                    }
                                    case 5: {
                                        if(cvya.e(arr_b1) == 5) {
                                            int v19 = cvya.c(arr_b1);
                                            int v20 = cvya.a(arr_b1);
                                            if(v19 != 3) {
                                                v9 = v19;
                                            }
                                            else if(arr_b1.length == v20 + 3) {
                                                serviceIdHash0 = new ServiceIdHash(Arrays.copyOfRange(arr_b1, v20, v20 + 3));
                                                goto label_113;
                                            }
                                            Log.i("NC_ServiceIdHash", String.format("Incorrect size for Service Id Hash: expected %d, actual %d", ((int)(v20 + v9)), ((int)arr_b1.length)));
                                        }
                                        else {
                                            Log.i("NC_ServiceIdHash", String.format("Failed to parse Service Id Hash due to incorrect data element type: %X.", cvya.e(arr_b1)));
                                        }
                                        serviceIdHash0 = null;
                                    label_113:
                                        if(serviceIdHash0 == null) {
                                            czkq.a.b().p("Cannot deserialize BleAdvertisement: invalid ServiceIdHash.", new Object[0]);
                                            break alab1;
                                        }
                                        cztn0.g = serviceIdHash0;
                                        break;
                                    }
                                    case 6: {
                                        if(cvya.e(arr_b1) == 6) {
                                            int v21 = cvya.a(arr_b1);
                                            int v22 = cvya.c(arr_b1);
                                            if(v22 == 1) {
                                                if(arr_b1.length == v21 + 1) {
                                                    supportedServices0 = new SupportedServices(arr_b1[v21]);
                                                    goto label_131;
                                                }
                                                else {
                                                    v22 = 1;
                                                }
                                            }
                                            Log.i("NC_SupportedServices", String.format("Incorrect size for Supported Services: expected %d, actual %d", ((int)(v21 + v22)), ((int)arr_b1.length)));
                                        }
                                        else {
                                            Log.i("NC_SupportedServices", String.format("Failed to parse Supported Services due to incorrect data element type: %X.", cvya.e(arr_b1)));
                                        }
                                        supportedServices0 = null;
                                    label_131:
                                        if(supportedServices0 == null) {
                                            czkq.a.b().p("Cannot deserialize BleAdvertisement: invalid SupportedService.", new Object[0]);
                                            break alab1;
                                        }
                                        cztn0.h = supportedServices0;
                                        break;
                                    }
                                    case 7: {
                                        if(cvya.e(arr_b1) == 7) {
                                            int v23 = cvya.c(arr_b1);
                                            int v24 = cvya.a(arr_b1);
                                            int v25 = v23 + v24;
                                            if(arr_b1.length == v25) {
                                                deviceInfo0 = new DeviceInfo(Arrays.copyOfRange(arr_b1, v24, v25));
                                            }
                                            else {
                                                Log.i("NC_DeviceInfo", String.format("Incorrect size for Device Info: expected %d, actual %d", v25, ((int)arr_b1.length)));
                                                deviceInfo0 = null;
                                            }
                                        }
                                        else {
                                            Log.i("NC_DeviceInfo", String.format("Failed to parse Device Info due to incorrect data element type: %X.", cvya.e(arr_b1)));
                                            deviceInfo0 = null;
                                        }
                                        if(deviceInfo0 == null) {
                                            czkq.a.b().p("Cannot deserialize BleAdvertisement: invalid DeviceInfo.", new Object[0]);
                                            break alab1;
                                        }
                                        cztn0.i = deviceInfo0;
                                    }
                                }
                                v4 = v7;
                            }
                        }
                        else {
                            czkq.a.b().h("Cannot deserialize BleAdvertisement: unsupported Version %d", Integer.valueOf(v3));
                        }
                        cztn0 = null;
                        goto label_158;
                    label_157:
                        cztm.a(cztn0);
                    label_158:
                        if(cztn0 != null) {
                            String s = bluetoothDevice0.getAddress();
                            if(s != null) {
                                this.o.put(cztn0, s);
                                gged_interceptors gged0 = gged_interceptors.i(this.p());
                                if(gged0.size() <= 0) {
                                    return;
                                }
                                String s1 = (String)gged0.get(0);
                                czrm czrm0 = (czrm)this.h.get(s1);
                                if(czrm0 != null) {
                                    czrm0.b(cztn0);
                                }
                                gghp gghp0 = this.f;
                                if(gghp0.A(s1, cztn0)) {
                                    return;
                                }
                                czqs czqs0 = (czqs)this.e.get(s1);
                                if(czqs0 == null) {
                                    return;
                                }
                                gghp0.v(s1, cztn0);
                                czqs0.a(cztn0);
                                return;
                            }
                        }
                    }
                }
                if(!this.q().isEmpty()) {
                    cunz cunz0 = bleSighting0.b;
                    UUID uUID0 = czup.b;
                    cztp cztp0 = czup.b(cunz0, new ParcelUuid(uUID0));
                    byte[] arr_b2 = cztp0 == null ? null : cztp0.a;
                    if(arr_b2 == null) {
                    label_235:
                        byte[] arr_b5 = cunz0.c(new ParcelUuid(uUID0));
                        if(arr_b5 != null && arr_b5.length > 0 && cztq.h(arr_b5[0])) {
                            if(hvol.t()) {
                                ++this.q;
                            }
                            czqs czqs1 = (czqs)this.d.get("NearbyConnections.TxAdvertisement");
                            if(czqs1 != null) {
                                czqs1.h(arr_b5);
                                return;
                            }
                            czkq.a.d().p("Receive a TX Advertisement but no client is scanning for it.", new Object[0]);
                            return;
                        }
                        cztp cztp1 = czup.b(cunz0, new ParcelUuid(uUID0));
                        byte[] arr_b6 = cztp1 == null ? null : cztp1.a;
                        if(Arrays.equals(arr_b6, cztq.a)) {
                            czkq.a.b().p("Found a fake advertisement to trigger Bluetooth Discovery.", new Object[0]);
                            this.s();
                            return;
                        }
                        czrz czrz0 = czrz.a(arr_b6);
                        if(czrz0 == null || !czri.U(this.r) || !czrz0.f) {
                            byte[] arr_b7 = null;
                            bxe bxe0 = new bxe(((bxf)this.q()));
                            while(bxe0.hasNext()) {
                                Object object0 = bxe0.next();
                                ParcelUuid parcelUuid1 = (ParcelUuid)this.i.get(((String)object0));
                                if(parcelUuid1 != null) {
                                    cztp cztp2 = czup.b(cunz0, parcelUuid1);
                                    if(cztp2 != null) {
                                        arr_b7 = cztp2.a;
                                    }
                                    if(arr_b7 != null) {
                                        break;
                                    }
                                }
                            }
                            if(arr_b7 == null && czri.U(this.r)) {
                                cztp cztp3 = czup.b(cunz0, new ParcelUuid(uUID0));
                                if(cztp3 != null) {
                                    arr_b7 = cztp3.a;
                                }
                            }
                            if(arr_b7 != null) {
                                ParcelUuid parcelUuid2 = new ParcelUuid(uUID0);
                                gged_interceptors gged2 = cunz0.a;
                                int v30 = gged2.size();
                                for(int v31 = 0; v31 < v30; ++v31) {
                                    ParcelUuid parcelUuid3 = (ParcelUuid)gged2.get(v31);
                                    if(!parcelUuid2.equals(parcelUuid3)) {
                                        parcelUuid2 = parcelUuid3;
                                    }
                                }
                                byte[] arr_b8 = cztq.i(arr_b7);
                                czrz czrz1 = new czrz(1, new byte[10], arr_b8, 0, false, false);
                                czrx czrx0 = new czrx();
                                this.j.put(czrz1, czrx0);
                                this.v(this.o(czrz1, gged_interceptors.l(arr_b7), parcelUuid2), bluetoothDevice0.getAddress());
                            }
                            cztp cztp4 = czup.b(cunz0, new ParcelUuid(uUID0));
                            if(cztp4 == null) {
                                z = true;
                                arr_b9 = null;
                            }
                            else {
                                z = cztp4.b;
                                arr_b9 = cztp4.a;
                            }
                            if(arr_b9 == null) {
                                czkq.a.d().h("BLE advertisement found with no service data or local name from BLE peripheral at address %s (could be a buggy iOS peripheral with a missing local name).", bluetoothDevice0.getAddress());
                                cztz cztz0 = new cztz();
                                gxub gxub0 = new gxub(new byte[10], cztz0);
                                bxe bxe1 = new bxe(((bxf)this.q()));
                                while(bxe1.hasNext()) {
                                    Object object1 = bxe1.next();
                                    gxub0.a(((String)object1));
                                }
                                byte[] arr_b10 = czrz.b(10, gxub0.c(), cztq.i(bluetoothDevice0.getAddress().getBytes(czrz.a)), 0, false, false);
                                cztp5 = arr_b10 == null ? null : cztp.a(arr_b10, false);
                            }
                            else {
                                czkq.a.d().h("Service data found on possible Android BLE peripheral at address %s", bluetoothDevice0.getAddress());
                                cztp5 = cztp.a(arr_b9, z);
                            }
                            if(cztp5 != null) {
                                byte[] arr_b11 = cztp5.a;
                                czrz czrz2 = czrz.a(arr_b11);
                                if(czrz2 == null) {
                                    czkq.a.d().h("Failed to deserialize BLE advertisement header %s. Ignoring.", czmk.g(arr_b11));
                                    return;
                                }
                                cztz cztz1 = new cztz();
                                gxub gxub1 = new gxub(czrz2.d, cztz1);
                                bxe bxe2 = new bxe(((bxf)this.q()));
                                while(bxe2.hasNext()) {
                                    Object object2 = bxe2.next();
                                    if(gxub1.b(((String)object2).getBytes(gxub.a))) {
                                        if(!czrz2.f) {
                                            this.s();
                                        }
                                        Map map0 = this.j;
                                        if(map0.containsKey(czrz2)) {
                                            switch(((czrx)map0.get(czrz2)).f() - 1) {
                                                case 1: {
                                                    czkq.a.b().h("Received advertisement header %s. Will retry reading its GATT advertisement.", czrz2);
                                                label_330:
                                                    Set set0 = this.q();
                                                    boolean z1 = cztp5.b;
                                                    if(!z1) {
                                                        czkq.a.b().p("Try to fetch advertisement from a possible IOS target.", new Object[0]);
                                                    }
                                                    int v32 = czrz2.c;
                                                    czrx czrx1 = (czrx)map0.get(czrz2);
                                                    if(!hvol.a.r().bV() || z1) {
                                                        v2 = czrz2.h;
                                                    }
                                                    fgva fgva0 = new fgva(bluetoothDevice0);
                                                    map0.put(czrz2, czpi0.a.k(fgva0, v32, czrx1, v2, set0, czrz2.g));
                                                    this.o(czrz2, new ArrayList(((czrx)map0.get(czrz2)).b()), null);
                                                    break;
                                                }
                                                case 2: {
                                                    czkq.a.d().h("Received advertisement header %s, but we have already read its GATT advertisement.", czrz2);
                                                    break;
                                                }
                                                default: {
                                                    czkq.a.b().h("Received advertisement header %s, but we have recently failed to read its GATT advertisement.", czrz2);
                                                }
                                            }
                                        }
                                        else {
                                            czkq.a.b().h("Received advertisement header %s, but we have never seen it before. Will try reading its GATT advertisement.", czrz2);
                                            goto label_330;
                                        }
                                        this.v(czrz2, bluetoothDevice0.getAddress());
                                        return;
                                    }
                                }
                                czkq.a.d().h("Ignoring BLE advertisement header %s because it does not contain any service IDs we\'re interested in.", czrz2);
                                return;
                            }
                        }
                    }
                    else {
                        if(arr_b2.length == 5) {
                            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b2);
                            int v26 = (byteBuffer0.get() & 0xE0) >> 5;
                            if(v26 == 1) {
                                byte[] arr_b3 = new byte[4];
                                byteBuffer0.get(arr_b3);
                                cztt0 = new cztt(arr_b3);
                            }
                            else {
                                czkq.a.e().i("[%s] Failed to parse due to unknown version : %d", "InstantOnLostAdvertisement", Integer.valueOf(v26));
                                cztt0 = null;
                            }
                        }
                        else {
                            v1 = arr_b2.length;
                            cztt0 = null;
                        }
                        if(cztt0 != null) {
                            czkq.a.d().h("Discovered instant onLost BLE advertisement hash : %s", czmk.g(cztt0.a));
                            this.u(cztt0.a);
                            return;
                        }
                        if(v1 >= 2) {
                            ByteBuffer byteBuffer1 = ByteBuffer.wrap(arr_b2);
                            int v27 = byteBuffer1.get();
                            if((v27 & 0xF0) >> 4 != 1) {
                                cztu0 = null;
                            }
                            else if((v27 & 7) == 1) {
                                int v28 = byteBuffer1.get() & 7;
                                if(v28 * 4 == byteBuffer1.remaining()) {
                                    ggdy ggdy0 = new ggdy();
                                    for(int v29 = 0; v29 < v28; ++v29) {
                                        byte[] arr_b4 = new byte[4];
                                        byteBuffer1.get(arr_b4);
                                        ggdy0.i(arr_b4);
                                    }
                                    cztu0 = new cztu(ggdy0.h());
                                }
                                else {
                                    czkq.a.b().j("[%s] Failed to parse due to incorrect count : %d, actual remain size : %d", "InstantOnLostAdvertisementV2", Integer.valueOf(v28), Integer.valueOf(byteBuffer1.remaining()));
                                    cztu0 = null;
                                }
                            }
                            else {
                                czkq.a.d().i("[%s] Failed to parse due to unknown version : %d", "InstantOnLostAdvertisementV2", Integer.valueOf(v27 & 7));
                                cztu0 = null;
                            }
                        }
                        else {
                            cztu0 = null;
                        }
                        if(cztu0 == null) {
                            goto label_235;
                        }
                        else {
                            cunf cunf0 = czkq.a.d();
                            gged_interceptors gged1 = cztu0.a;
                            cunf0.h("Discovered instant onLost V2 BLE advertisement hashes : %s", czmk.f(gged1));
                            while(v2 < ((ggna)gged1).c) {
                                this.u(((byte[])gged1.get(v2)));
                                ++v2;
                            }
                            return;
                        }
                    }
                    return;
                }
                czkq.a.d().p("Ignoring BLE advertisement header because we are not tracking any service IDs.", new Object[0]);
                return;
            }
            czkq.a.d().p("Ignoring BLE advertisement header because the given BleSighting is null or incomplete.", new Object[0]);
        }
    }

    private final int m() {
        int v2;
        synchronized(this) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Found Fast Ble Advertisements :");
            Map map0 = this.p;
            int v1 = 0;
            v2 = 0;
            ggqj ggqj0 = ggeo.k(map0).v().om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((czry)map$Entry0.getKey()).c && ((int)(((Integer)map$Entry0.getValue()))) != 0) {
                    ++v2;
                    v1 += (int)(((Integer)map$Entry0.getValue()));
                    map0.put(((czry)map$Entry0.getKey()), Integer.valueOf(0));
                    stringBuilder0.append("\n");
                    stringBuilder0.append(map$Entry0.getKey());
                    stringBuilder0.append(" : ");
                    stringBuilder0.append(map$Entry0.getValue());
                    stringBuilder0.append(" times.");
                }
            }
            if(v1 > 0) {
                stringBuilder0.append("\nTotal ");
                stringBuilder0.append(v1);
                stringBuilder0.append(" fast advertisements from ");
                stringBuilder0.append(v2);
                stringBuilder0.append(" unique advertisers.");
                czkq.a.b().h("%s", stringBuilder0);
                return v2;
            }
        }
        return v2;
    }

    private final int n() {
        int v2;
        synchronized(this) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Found BLE GATT Advertisements :");
            Map map0 = this.p;
            int v1 = 0;
            v2 = 0;
            ggqj ggqj0 = ggeo.k(map0).v().om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(!((czry)map$Entry0.getKey()).c && ((int)(((Integer)map$Entry0.getValue()))) != 0) {
                    v1 += (int)(((Integer)map$Entry0.getValue()));
                    map0.put(((czry)map$Entry0.getKey()), Integer.valueOf(0));
                    stringBuilder0.append("\n");
                    stringBuilder0.append(map$Entry0.getKey());
                    stringBuilder0.append(" : ");
                    stringBuilder0.append(map$Entry0.getValue());
                    stringBuilder0.append(" times.");
                    ++v2;
                }
            }
            if(v1 > 0) {
                stringBuilder0.append("\nTotal ");
                stringBuilder0.append(v1);
                stringBuilder0.append(" GATT advertisements from ");
                stringBuilder0.append(v2);
                stringBuilder0.append(" unique advertisers.");
                czkq.a.b().h("%s", stringBuilder0);
                return v2;
            }
        }
        return v2;
    }

    private final czrz o(czrz czrz0, List list0, ParcelUuid parcelUuid0) {
        byte[] arr_b12;
        String s;
        byte[] arr_b8;
        int v7;
        byte[] arr_b5;
        byte[] arr_b2;
        czry czry0;
        Set set0 = this.q();
        bxd bxd0 = new bxd();
        Iterator iterator0 = list0.iterator();
    label_3:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            byte[] arr_b = (byte[])object0;
            if(arr_b == null) {
                czkq.a.d().p("Cannot deserialize BleAdvertisement: null bytes passed in.", new Object[0]);
                czry0 = null;
            }
            else if(arr_b.length <= 0) {
                czkq.a.d().i("Cannot deserialize BleAdvertisement: expecting min %d raw bytes to parse the version, got %d", Integer.valueOf(1), Integer.valueOf(0));
                czry0 = null;
            }
            else {
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
                int v = byteBuffer0.get();
                int v1 = (v & 0xE0) >> 5;
                if(v1 == 2) {
                    int v2 = (v & 28) >> 2;
                    if(v2 == 2) {
                        int v3 = (v & 2) >> 1;
                        int v4 = 1 == v3 ? 2 : 8;
                        if(arr_b.length < v4) {
                            czkq.a.d().i("Cannot deserialize BleAdvertisement: expecting min %d raw bytes, got %d", Integer.valueOf(v4), Integer.valueOf(arr_b.length));
                            czry0 = null;
                        }
                        else {
                            if(v3 == 0) {
                                byte[] arr_b1 = new byte[3];
                                byteBuffer0.get(arr_b1);
                                arr_b2 = arr_b1;
                            }
                            else {
                                arr_b2 = null;
                            }
                            int v5 = v3 == 0 ? byteBuffer0.getInt() : byteBuffer0.get();
                            if(v5 < 0) {
                                czkq.a.d().h("Cannot deserialize BleAdvertisement: negative data size %d", Integer.valueOf(v5));
                                czry0 = null;
                            }
                            else if(byteBuffer0.remaining() < v5) {
                                czkq.a.d().i("Cannot deserialize BleAdvertisement: expected data to be %d bytes, but only %d bytes remain.", Integer.valueOf(v5), Integer.valueOf(byteBuffer0.remaining()));
                                czry0 = null;
                            }
                            else {
                                byte[] arr_b3 = new byte[v5];
                                byteBuffer0.get(arr_b3);
                                if(byteBuffer0.remaining() >= 2) {
                                    byte[] arr_b4 = new byte[2];
                                    byteBuffer0.get(arr_b4);
                                    arr_b5 = arr_b4;
                                }
                                else {
                                    arr_b5 = null;
                                }
                                boolean z = 1 == (v & 1);
                                if(byteBuffer0.hasRemaining()) {
                                    byte[] arr_b6 = new byte[byteBuffer0.remaining()];
                                    byteBuffer0.get(arr_b6);
                                    ByteBuffer byteBuffer1 = ByteBuffer.wrap(arr_b6);
                                    int v6 = byteBuffer1.get();
                                    if(czsb.a(((byte)v6), ((byte)1)) && byteBuffer1.remaining() >= 2) {
                                        byte[] arr_b7 = new byte[2];
                                        byteBuffer1.get(arr_b7);
                                        v7 = glxf.b(arr_b7);
                                    }
                                    else {
                                        v7 = 0;
                                    }
                                    if(czsb.a(((byte)v6), ((byte)2)) && byteBuffer1.remaining() > 1) {
                                        int v8 = byteBuffer1.get();
                                        if(v8 > 0 && byteBuffer1.remaining() >= v8) {
                                            arr_b8 = new byte[v8];
                                            byteBuffer1.get(arr_b8);
                                            goto label_74;
                                        }
                                    }
                                    arr_b8 = null;
                                label_74:
                                    czsb czsb0 = arr_b8 == null ? new czsb(v7) : new czsb(v7, arr_b8);
                                    byte[] arr_b9 = hvol.aJ() ? czsb0.b : null;
                                    czry0 = new czry(2, 2, 1 == v3, arr_b2, arr_b3, arr_b5, czsb0.a, z, arr_b9);
                                }
                                else {
                                    czry0 = new czry(2, 2, 1 == v3, arr_b2, arr_b3, arr_b5, 0, z, null);
                                }
                            }
                        }
                    }
                    else {
                        czkq.a.d().h("Cannot deserialize BleAdvertisement: unsupported SocketVersion %d", Integer.valueOf(v2));
                        czry0 = null;
                    }
                }
                else {
                    czkq.a.d().h("Cannot deserialize BleAdvertisement: unsupported Version %d", Integer.valueOf(v1));
                    czry0 = null;
                }
            }
            if(czry0 == null) {
                czkq.a.d().h("Unable to parse raw GATT advertisement %s", czmk.g(arr_b));
            }
            else {
                bxe bxe0 = new bxe(((bxf)set0));
                while(true) {
                    if(!bxe0.hasNext()) {
                        continue label_3;
                    }
                    Object object1 = bxe0.next();
                    s = (String)object1;
                    if(!bxd0.containsKey(s) || ((czry)bxd0.get(s)).a <= czry0.a) {
                        boolean z1 = czry0.c;
                        if(!z1 || parcelUuid0 == null) {
                            byte[] arr_b10 = czmk.Y(s.getBytes(), 3);
                            if(!z1) {
                                byte[] arr_b11 = czry0.d;
                                if(arr_b11 != null) {
                                    arr_b12 = Arrays.copyOf(arr_b11, arr_b11.length);
                                    goto label_101;
                                }
                            }
                            arr_b12 = null;
                        label_101:
                            if(Arrays.equals(arr_b10, arr_b12)) {
                                break;
                            }
                        }
                        else if(parcelUuid0.equals(this.i.get(s))) {
                            if(this.y(czry0)) {
                                czkq.a.b().j("This GATT advertisement %s is a Fast Advertisement and matched UUID %s in fastAdvertisementServiceUuids map with serviceID %s", czry0, parcelUuid0, s);
                            }
                            bxd0.put(s, czry0);
                        }
                    }
                }
                if(this.y(czry0)) {
                    czkq.a.b().i("Matched service ID %s to GATT advertisement %s.", s, czry0);
                }
                bxd0.put(s, czry0);
            }
        }
        czrz czrz1 = czrz0;
        for(Object object2: bxd0.keySet()) {
            String s1 = (String)object2;
            czry czry1 = (czry)bxd0.get(s1);
            ggpj ggpj0 = this.m;
            czrz czrz2 = (czrz)ggpj0.a(s1, czry1);
            int v9 = czrz1.h;
            int v10 = czry1.g;
            if(v10 != 0 && v10 != v9) {
                czrz1 = new czrz(czrz1.c, czrz1.d, czrz1.e, v10, czrz1.f, czrz1.g);
                v9 = v10;
            }
            if(czry1.i) {
                czrz1 = new czrz(czrz1.c, czrz1.d, czrz1.e, czrz1.h, czrz1.f, true);
            }
            if(czrz2 != null && (v9 == 0 || v9 == czrz2.h)) {
                if(hvol.aJ() && czry1.c) {
                    ggqj ggqj0 = ggeo.k(new ggor(((ggov)ggpj0), s1)).v().om();
                    while(ggqj0.hasNext()) {
                        Object object3 = ggqj0.next();
                        Map.Entry map$Entry0 = (Map.Entry)object3;
                        if(!czry1.equals(map$Entry0.getKey()) || czry1.h == null || ((czry)map$Entry0.getKey()).h != null) {
                            continue;
                        }
                        ggpj0.c(s1, czry1);
                        ggpj0.b(s1, czry1, ((czrz)map$Entry0.getValue()));
                        czkq.a.b().i("Replace Fast Advertisement Rx Info for service id : %s on deviceToken : %s", s1, czmk.g(czry1.f));
                        goto label_137;
                    }
                }
                if(czrz2.h != 0 && czrz1.h == 0) {
                    continue;
                }
                if(!czry1.c && hvol.aJ() && (!czrz2.equals(czrz1) && (!czri.U(this.r) || cztq.x(czrz2) || !cztq.x(czrz1)))) {
                    this.j.remove(czrz2);
                    this.k.remove(czrz2);
                }
            }
            else {
            label_137:
                czqs czqs0 = (czqs)this.d.get(s1);
                if(czqs0 == null) {
                    czkq.a.e().h("handleRawGattAdvertisements, failed to find callback for service id : %s.", s1);
                    continue;
                }
                else {
                    czqs0.f(czsy.b(czry1, v9), Arrays.copyOf(czry1.e, czry1.e.length), czry1.c);
                }
            }
            ggpj0.b(s1, czry1, czrz1);
            gfza gfza0 = this.l;
            if(!gfza0.A(czry1, s1)) {
                gfza0.v(czry1, s1);
            }
        }
        bxf bxf0 = new bxf(bxd0.values());
        this.k.put(czrz1, bxf0);
        return czrz1;
    }

    private final Set p() {
        return new bxf(this.e.keySet());
    }

    private final Set q() {
        return new bxf(this.d.keySet());
    }

    private final void r(String s, czry czry0) {
        this.l.E(czry0, s);
        this.n.remove(czry0);
        czrz czrz0 = (czrz)this.m.c(s, czry0);
        Map map0 = this.k;
        if(map0.containsKey(czrz0)) {
            Set set0 = (Set)map0.get(czrz0);
            set0.remove(czry0);
            this.j.remove(czrz0);
            if(set0.isEmpty()) {
                map0.remove(czrz0);
            }
        }
    }

    private final void s() {
        for(Object object0: this.d.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!TextUtils.equals(((CharSequence)map$Entry0.getKey()), "NearbyConnections.EnvironmentMonitor") && !TextUtils.equals(((CharSequence)map$Entry0.getKey()), "NearbyConnections.TxAdvertisement")) {
                ((czqs)map$Entry0.getValue()).e();
                return;
            }
        }
    }

    private final void t(String s, czry czry0) {
        synchronized(this) {
            czqs czqs0 = (czqs)this.d.get(s);
            if(czqs0 == null) {
                czkq.a.e().h("Failed to find callback to report instantOnLost for service id : %s.", s);
                return;
            }
            this.r(s, czry0);
            czqs0.d(czsy.a(czry0));
        }
    }

    private final void u(byte[] arr_b) {
        ggge ggge0;
        Set set0 = this.m.f();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: set0) {
            ggpi ggpi0 = (ggpi)object0;
            if((ggpi0 instanceof ggpl)) {
                gftb.z(ggpi0.b(), "row");
                gftb.z(ggpi0.a(), "column");
                gftb.z(ggpi0.c(), "value");
                arrayList0.add(ggpi0);
            }
            else {
                arrayList0.add(ggge.t(ggpi0.b(), ggpi0.a(), ggpi0.c()));
            }
        }
        switch(arrayList0.size()) {
            case 0: {
                ggge0 = ggon.b;
                break;
            }
            case 1: {
                ggpi ggpi1 = (ggpi)gggq.r(arrayList0);
                ggge0 = new ggoi(ggpi1.b(), ggpi1.a(), ggpi1.c());
                break;
            }
            default: {
                LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                LinkedHashSet linkedHashSet1 = new LinkedHashSet();
                gged_interceptors gged0 = gged_interceptors.h(arrayList0);
                for(Object object1: arrayList0) {
                    linkedHashSet0.add(((ggpi)object1).b());
                    linkedHashSet1.add(((ggpi)object1).a());
                }
                ggge0 = ggnn.u(gged0, ggfp.G(linkedHashSet0), ggfp.G(linkedHashSet1));
            }
        }
        ggqj ggqj0 = ggge0.q().om();
        while(ggqj0.hasNext()) {
            Object object2 = ggqj0.next();
            czrz czrz0 = (czrz)((ggpi)object2).c();
            czry czry0 = (czry)((ggpi)object2).a();
            String s = (String)((ggpi)object2).b();
            if(czrz0 != null && czry0 != null) {
                byte[] arr_b1 = czry.c(czry0.a, czry0.b, czry0.d, czry0.e, czry0.f, czry0.c, czry0.i, czry0.g, czry0.h);
                if(arr_b1 != null && Arrays.equals(cztq.i(arr_b1), arr_b)) {
                    this.t(s, czry0);
                    czkq.a.b().i("Triggered instant on lost for service id : %s with hash %s", s, czmk.g(arr_b));
                }
            }
        }
    }

    private final void v(czrz czrz0, String s) {
        Map map0 = this.k;
        if(!map0.containsKey(czrz0)) {
            czkq.a.b().h("No GATT advertisements found for advertisement header %s.", czrz0);
            return;
        }
        for(Object object0: ((Set)map0.get(czrz0))) {
            czry czry0 = (czry)object0;
            for(Object object1: this.l.g(czry0)) {
                String s1 = (String)object1;
                if(this.q().contains(s1)) {
                    czrm czrm0 = (czrm)this.g.get(s1);
                    if(czrm0 == null) {
                        czkq.a.e().h("updateCommonStateForFoundBleAdvertisement, failed to find entity tracker for service id : %s", s1);
                    }
                    else {
                        czrm0.b(czry0);
                        this.n.put(czry0, s);
                    }
                }
            }
        }
    }

    private static boolean w(Context context0) {
        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
        return powerManager0 == null ? false : powerManager0.isPowerSaveMode();
    }

    private static boolean x(czrz czrz0) {
        return czrz0.c == 1 && Arrays.equals(czrz0.d, new byte[10]);
    }

    private final boolean y(czry czry0) {
        Map map0 = this.p;
        Integer integer0 = (Integer)map0.get(czry0);
        if(integer0 == null) {
            map0.put(czry0, Integer.valueOf(0));
            return true;
        }
        map0.put(czry0, Integer.valueOf(((int)integer0) + 1));
        return false;
    }
}

