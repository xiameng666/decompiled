import android.accounts.Account;
import android.bluetooth.le.AdvertiseData.Builder;
import android.bluetooth.le.AdvertiseSettings.Builder;
import android.bluetooth.le.AdvertisingSetCallback;
import android.bluetooth.le.AdvertisingSetParameters.Builder;
import android.bluetooth.le.AdvertisingSetParameters;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter.Builder;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings.Builder;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import android.util.ArrayMap;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation.1;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation.2;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation.3;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation.6;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ddli {
    public final ScheduledExecutorService a;
    public int b;
    public final Map c;
    public String d;
    public final Map e;
    public ddlf f;
    public int g;
    private final Context h;
    private final bsaq i;
    private cupu j;
    private cupv k;
    private ScanCallback l;
    private boolean m;
    private boolean n;
    private ScheduledFuture o;
    private final Map p;
    private boolean q;
    private boolean r;
    private AdvertisingSetCallback s;
    private final dgaf t;
    private long u;
    private final Handler v;
    private final dcpn w;
    private final BroadcastReceiver x;
    private final BroadcastReceiver y;
    private final BroadcastReceiver z;

    public ddli(Context context0, dgaf dgaf0) {
        this.a = cuui.f();
        this.b = -2;
        this.c = new ArrayMap();
        this.e = new ArrayMap();
        this.p = new ArrayMap();
        this.q = true;
        this.v = new clht(Looper.getMainLooper());
        this.x = new FastInitiation.1(this);
        this.y = new FastInitiation.2(this);
        this.z = new FastInitiation.3(this);
        this.g = -1;
        this.h = !hvqz.Z() && !hvqz.y() ? context0 : context0.getApplicationContext();
        this.t = dgaf0;
        this.i = cumz.e(context0, "FastInitiation");
        this.j = cupu.b(context0, "FastInitiation");
        this.k = cupv.a(context0, "FastInitiation");
        if(hvqz.Z()) {
            dizl.c(context0);
        }
        this.w = dcpn.f(context0);
    }

    public final int a() {
        ddlh ddlh0 = ddlh.a;
        ArrayList arrayList0 = new ArrayList();
        gged_interceptors gged0 = gged_interceptors.i(this.c.values());
        int v = gged0.size();
        int v1 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            ddlf ddlf0 = ((ddlg)gged0.get(v2)).a;
            if(ddlf0.c == ddlh0 && ddlf0.b == 0) {
                arrayList0.add(ddlf0);
            }
        }
        for(Object object0: arrayList0) {
            if(!this.e.containsKey(((ddlf)object0).d)) {
                ++v1;
            }
        }
        return v1;
    }

    public static String b(int v) {
        switch(v) {
            case -1: {
                return "NONE";
            }
            case 0: {
                return "NOTIFY";
            }
            default: {
                return v == 1 ? "SILENT" : "UNKNOWN";
            }
        }
    }

    public static String c(int v) {
        if(v != -2) {
            switch(v) {
                case -1: {
                    return "SCAN_MODE_OPPORTUNISTIC";
                }
                case 0: {
                    return "SCAN_MODE_LOW_POWER";
                }
                case 1: {
                    return "SCAN_MODE_BALANCED";
                }
                case 2: {
                    return "SCAN_MODE_LOW_LATENCY";
                }
                case 3: {
                    return "SCAN_MODE_AMBIENT_DISCOVERY";
                }
                default: {
                    return "UNKNOWN";
                }
            }
        }
        return "NONE";
    }

    public final void d(int v) {
        String s;
        synchronized(this) {
            cunf cunf0 = dcvz.a.b();
            switch(v) {
                case 1: {
                    s = "SCAN_FAILED_ALREADY_STARTED";
                    break;
                }
                case 2: {
                    s = "SCAN_FAILED_APPLICATION_REGISTRATION_FAILED";
                    break;
                }
                case 3: {
                    s = "SCAN_FAILED_INTERNAL_ERROR";
                    break;
                }
                case 4: {
                    s = "SCAN_FAILED_FEATURE_UNSUPPORTED";
                    break;
                }
                case 5: {
                    s = "SCAN_FAILED_BLUETOOTH_DISABLED";
                    break;
                }
                case 6: {
                    s = "SCAN_FILTERS_NOT_ALLOWED_FOR_LOCATION";
                    break;
                }
                default: {
                    s = "UNKNOWN";
                }
            }
            cunf0.h("Scanning for FastInitiation failed with error %s. Stopping scan.", String.format(Locale.ENGLISH, "[%d]%s", v, s));
            this.h();
        }
    }

    public final void e(String s) {
        synchronized(this) {
            this.e.remove(s);
        }
    }

    public final void f() {
        synchronized(this) {
            if(this.i()) {
                this.g();
            }
            if(this.k()) {
                this.h();
            }
            this.a.shutdown();
        }
    }

    public final void g() {
        synchronized(this) {
            if(!this.i()) {
                dcvz.a.d().p("Can\'t stop advertising FastInitiation. Not advertising.", new Object[0]);
                return;
            }
            AdvertisingSetCallback advertisingSetCallback0 = this.s;
            if(advertisingSetCallback0 != null) {
                cupu cupu0 = this.j;
                if(cupu0 != null) {
                    cupu0.d(((AdvertisingSetCallback)Objects.requireNonNull(advertisingSetCallback0)));
                }
                this.s = null;
            }
            this.g = -1;
            dcvz.a.b().p("Stopped advertising FastInitiation", new Object[0]);
        }
    }

    public final void h() {
        synchronized(this) {
            if(!this.k()) {
                dcvz.a.d().p("Can\'t stop scanning for FastInitiation. Not scanning.", new Object[0]);
                return;
            }
            ScanCallback scanCallback0 = this.l;
            if(scanCallback0 != null) {
                this.k.d(scanCallback0);
                this.l = null;
            }
            cutr.f(this.h, this.x);
            cutr.f(this.h, this.y);
            cutr.f(this.h, this.z);
            dizl.c(this.h);
            this.f = null;
            this.p.clear();
            this.b = -2;
            Map map0 = this.c;
            gged_interceptors gged0 = gged_interceptors.i(map0.values());
            int v1 = gged0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((ddlg)gged0.get(v2)).d.cancel(true);
            }
            map0.clear();
            ScheduledFuture scheduledFuture0 = this.o;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(true);
                this.o = null;
            }
            dcvz.a.b().p("Stopped scanning for FastInitiation", new Object[0]);
        }
    }

    public final boolean i() {
        synchronized(this) {
        }
        return this.s != null;
    }

    public final boolean j() {
        return this.i != null && this.i.t();
    }

    public final boolean k() {
        synchronized(this) {
        }
        return this.l != null;
    }

    public final boolean l(int v, cuur cuur0, cuuq cuuq0) {
        int v2;
        ddkv ddkv0;
        synchronized(this) {
            this.j = cupu.b(this.h, "FastInitiation");
            if(this.h.getPackageManager().hasSystemFeature("android.hardware.bluetooth") && this.h.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") && this.t() && this.j != null) {
                if(this.i()) {
                    if(this.g == v) {
                        dcvz.a.d().h("Failed to advertise FastInitiation. Already advertising with type=%s.", ddli.b(v));
                        return false;
                    }
                    this.g();
                    dcvz.a.b().h("Restarting FastInitiation advertising with type=%s.", ddli.b(v));
                }
                byte[] arr_b = dizs.f(1, this.t.b);
                dgae dgae0 = this.t.b(arr_b);
                if(cuur0 != null && cuuq0 != null) {
                    byte[] arr_b1 = dgae0.a;
                    byte[] arr_b2 = dgae0.b;
                    boolean z = this.u();
                    ddkv0 = new ddkv(0, v, ddkv.a(), cuur.b(cuur0.c, cuur0.d), cuuq0, arr_b1, arr_b2, z);
                    v2 = v;
                }
                else {
                    byte[] arr_b3 = dgae0.a;
                    byte[] arr_b4 = dgae0.b;
                    boolean z1 = this.u();
                    v2 = v;
                    ddkv0 = new ddkv(0, v2, ddkv.a(), null, null, arr_b3, arr_b4, z1);
                }
                int v3 = 2;
                new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(3).setConnectable(false).build();
                gmcu gmcu0 = new gmcu();
                cunf cunf0 = dcvz.a;
                cunf0.d().h("FastInit advertise require BT : %s", Boolean.valueOf(this.u()));
                ddlc ddlc0 = new ddlc(gmcu0);
                cupu cupu0 = this.j;
                AdvertisingSetParameters advertisingSetParameters0 = new AdvertisingSetParameters.Builder().setLegacyMode(true).setConnectable(false).setScannable(((boolean)(hvol.u() ^ 1))).setTxPowerLevel(1).setInterval(0xA0).build();
                AdvertiseData.Builder advertiseData$Builder0 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
                ParcelUuid parcelUuid0 = ddkv.a;
                byte[] arr_b5 = {0, 0};
                byte b = (byte)(((byte)(ddkv0.f << 5 & 0xFFFFFFE0)) | ddkv0.g << 2 & 28);
                arr_b5[0] = b;
                if(!ddkv0.d()) {
                    v3 = 0;
                }
                byte b1 = (byte)(v3 | b);
                arr_b5[0] = b1;
                arr_b5[0] = (byte)(b1 | ddkv0.c());
                arr_b5[1] = (byte)(-ddkv0.h);
                byte[] arr_b6 = glwl.d(new byte[][]{ddkv.b, arr_b5});
                cuur cuur1 = ddkv0.b();
                if(ddkv0.d() && cuur1 != null) {
                    cuuq cuuq1 = ddkv0.i;
                    if(cuuq1 != null) {
                        arr_b6 = glwl.d(new byte[][]{arr_b6, new byte[]{((byte)((cuuq1.a == cuup.a ? 0 : 0x20) | cuur1.a()))}, cuuq1.e()});
                    }
                }
                int v4 = ddkv.e;
                byte[] arr_b7 = Arrays.copyOf(arr_b6, v4 + 9);
                byte[] arr_b8 = ddkv0.e();
                byte[] arr_b9 = ddkv0.f();
                if(ddkv0.c() && arr_b8 != null && arr_b9 != null) {
                    arr_b7 = glwl.d(new byte[][]{arr_b7, arr_b8, arr_b9});
                }
                if(cupu0.e(advertisingSetParameters0, advertiseData$Builder0.addServiceData(parcelUuid0, Arrays.copyOf(glwl.d(new byte[][]{Arrays.copyOf(arr_b7, v4 + 18), new byte[]{(ddkv0.j ? (byte)0x80 : 0)}}), v4 + 19)).build(), null, ddlc0)) {
                    try {
                        gmcu0.v(hvqs.aw(), TimeUnit.SECONDS);
                        this.s = ddlc0;
                        this.g = v2;
                        cunf0.d().p("Started advertising FastInitiation.", new Object[0]);
                        return true;
                    }
                    catch(InterruptedException unused_ex) {
                        Thread.currentThread().interrupt();
                        dcvz.a.e().p("Interrupted while waiting to start FastInitiation advertising.", new Object[0]);
                        return false;
                    }
                    catch(ExecutionException executionException0) {
                        dcvz.a.e().f(executionException0).p("Failed to start FastInitiation advertising.", new Object[0]);
                    }
                    catch(TimeoutException timeoutException0) {
                        dcvz.a.e().f(timeoutException0).h("Failed to start FastInitiation advertising in %d seconds.", Long.valueOf(hvqs.aw()));
                    }
                    return false;
                }
                dcvz.a.e().p("Failed to start FastInitiation advertising.", new Object[0]);
                return false;
            }
            dcvz.a.b().p("Failed to advertise FastInitiation. Advertising is not supported on this device.", new Object[0]);
        }
        return false;
    }

    final void m(dcbn dcbn0) {
        boolean z;
        ArrayMap arrayMap0 = new ArrayMap();
        Map map0 = this.c;
        gged_interceptors gged0 = gged_interceptors.i(map0.values());
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ddlf ddlf0 = ((ddlg)gged0.get(v1)).a;
            cuuq cuuq0 = ddlf0.f;
            if(cuuq0 != null) {
                cuur cuur0 = ddlf0.e;
                if(cuur0 != null) {
                    arrayMap0.put(cuuq0, cuur0);
                }
            }
        }
        ggeo ggeo0 = ggeo.k(arrayMap0);
        if(!map0.isEmpty()) {
            z = false;
            gged_interceptors gged1 = gged_interceptors.i(map0.values());
            int v2 = gged1.size();
            int v3 = 0;
            while(true) {
                if(v3 >= v2) {
                    goto label_25;
                }
                boolean z1 = ((ddlg)gged1.get(v3)).a.g;
                ++v3;
                if(z1) {
                    break;
                }
            }
        }
        z = true;
    label_25:
        boolean z2 = false;
        if(!map0.isEmpty()) {
            gged_interceptors gged2 = gged_interceptors.i(map0.values());
            int v4 = gged2.size();
            int v5 = 0;
            while(v5 < v4) {
                boolean z3 = ((ddlg)gged2.get(v5)).a.h;
                ++v5;
                if(z3) {
                    z2 = true;
                    break;
                }
            }
        }
        ddlf ddlf1 = this.r();
        if(bata.b(this.f, ddlf1) && this.p.equals(ggeo0) && this.q == z && this.r == z2) {
            dcvz.a.d().p("FastInit is skipping reporting advertisement, because it was reported before", new Object[0]);
            return;
        }
        if(ddlf1 != null) {
            if(ddlf1.d != null && this.e.containsKey(ddlf1.d) && this.a() < 2) {
                dcvz.a.a().p("FastInit is skipping reporting CLOSE NOTIFY advertisement, because it was reported before", new Object[0]);
                return;
            }
            dcvz.a.d().i("FastInit reporting type %s, state %s", ddli.b(ddlf1.b), ddli.s(ddlf1.c));
            dcbn0.a(ddlf1.a, ddlf1.b, ddlf1.c, ggeo0, z, z2);
            if(ddlf1.c == ddlh.a && ddlf1.b == 0 && this.a() < 2) {
                this.d = ddlf1.d;
            }
            this.f = new ddlf(ddlf1.a, ddlf1.b, ddlf1.c, ddlf1.d, ddlf1.e, ddlf1.f, ddlf1.g, ddlf1.h);
            this.p.clear();
            this.p.putAll(ggeo0);
            this.q = z;
            this.r = z2;
            return;
        }
        ddlf ddlf2 = this.f;
        if(ddlf2 != null) {
            dcvz.a.d().i("FastInit reporting type %s, state %s", ddli.b(ddlf2.b), ddli.s(ddlh.c));
            dcbn0.a(ddlf2.a, ddlf2.b, ddlh.c, ggnf.a, true, false);
            this.f = null;
            this.p.clear();
            return;
        }
        dcvz.a.d().p("FastInit is did not report an update as there were no meaningful changes.", new Object[0]);
    }

    // Detected as a lambda impl.
    final void n(dcbn dcbn0, String s) {
        synchronized(this) {
            dcvz.a.d().h("FastInit lost sight of %s", s);
            this.c.remove(s);
            if(!this.k()) {
                return;
            }
            this.m(dcbn0);
            this.v(dcbn0);
        }
    }

    final void o(dcbn dcbn0, ScanResult scanResult0) {
        byte[] arr_b8;
        byte[] arr_b7;
        boolean z;
        cuuq cuuq0;
        cuur cuur0;
        ddkv ddkv0;
        synchronized(this) {
            if(this.k()) {
                ScanRecord scanRecord0 = scanResult0.getScanRecord();
                if(scanRecord0 == null) {
                    dcvz.a.d().p("Ignoring non FastInitiation advertisement. Empty ScanRecord.", new Object[0]);
                    return;
                }
                byte[] arr_b = null;
                ParcelUuid parcelUuid0 = ddkv.a;
                Map map0 = scanRecord0.getServiceData();
                if(map0 != null && map0.containsKey(parcelUuid0)) {
                    arr_b = (byte[])map0.get(parcelUuid0);
                }
                else if(hvol.aD()) {
                    ByteBuffer byteBuffer0 = ByteBuffer.wrap(scanRecord0.getBytes());
                    while(byteBuffer0.remaining() >= 2) {
                        int v1 = byteBuffer0.get() & 0xFF;
                        int v2 = byteBuffer0.get();
                        if(byteBuffer0.remaining() < v1 - 1) {
                            break;
                        }
                        byte[] arr_b1 = new byte[v1 - 1];
                        byteBuffer0.get(arr_b1);
                        if(v2 == 9 && Arrays.equals(Arrays.copyOf(arr_b1, ddkv.c.length), ddkv.c)) {
                            byte[] arr_b2 = bbmu.g(arr_b1);
                            if(arr_b2 != null) {
                                arr_b = arr_b2;
                                break;
                            }
                        }
                    }
                }
                else {
                    String s = scanRecord0.getDeviceName();
                    if(s != null) {
                        try {
                            arr_b = bbmu.g(s.getBytes());
                        }
                        catch(IllegalArgumentException unused_ex) {
                        }
                    }
                }
                if(arr_b == null) {
                    dcvz.a.d().p("Failed to convert null into FastInit advertisement.", new Object[0]);
                    ddkv0 = null;
                }
                else {
                    int v3 = ddkv.e;
                    if(arr_b.length < v3) {
                        dcvz.a.d().p("Failed to convert bytes into FastInit advertisement due to unmatched advertisement size.", new Object[0]);
                        ddkv0 = null;
                    }
                    else if(Arrays.equals(dizs.h(arr_b, 0, ddkv.b.length), ddkv.b)) {
                        byte[] arr_b3 = dizs.h(dizs.h(arr_b, 0, v3), ddkv.b.length, v3);
                        int v4 = arr_b3[0];
                        int v5 = -arr_b3[1];
                        if((v4 & 2) == 2) {
                            byte[] arr_b4 = arr_b.length >= v3 + 9 ? dizs.h(arr_b, v3, v3 + 9) : null;
                            if(arr_b4 == null) {
                                dcvz.a.d().p("Failed to convert bytes into FastInit advertisement due to unmatched advertisement size.", new Object[0]);
                                ddkv0 = null;
                            }
                            else {
                                int v6 = arr_b4[0];
                                cuur0 = cuur.b(cuur.a[(v6 & 0x1F) >> 2], cuur.b[v6 & 3]);
                                cuuq0 = cuuq.b(dizs.h(arr_b4, 1, ((arr_b4[0] & 0x20) <= 0 ? 2 : 8) + 1));
                                goto label_58;
                            }
                        }
                        else {
                            cuur0 = null;
                            cuuq0 = null;
                        label_58:
                            if((v4 & 1) == 0) {
                                arr_b8 = null;
                                arr_b7 = null;
                            label_70:
                                if(arr_b.length < v3 + 19) {
                                    z = true;
                                }
                                else if((dizs.h(arr_b, v3 + 18, v3 + 19)[0] & 0xFFFFFF80) != 0xFFFFFF80) {
                                    z = false;
                                }
                                else {
                                    z = true;
                                }
                                ddkv0 = new ddkv(v4 >> 5, (v4 & 28) >> 2, v5, cuur0, cuuq0, arr_b8, arr_b7, z);
                            }
                            else {
                                byte[] arr_b5 = arr_b.length < v3 + 18 ? null : dizs.h(arr_b, v3 + 9, v3 + 18);
                                if(arr_b5 == null) {
                                    dcvz.a.d().p("Failed to convert bytes into FastInit advertisement due to unmatched advertisement size.", new Object[0]);
                                    ddkv0 = null;
                                }
                                else {
                                    byte[] arr_b6 = dizs.h(arr_b5, 0, 1);
                                    arr_b7 = dizs.h(arr_b5, 1, 9);
                                    arr_b8 = arr_b6;
                                    goto label_70;
                                }
                            }
                        }
                    }
                    else {
                        dcvz.a.d().p("Failed to convert bytes into FastInit advertisement due to unmatched advertisement id.", new Object[0]);
                        ddkv0 = null;
                    }
                }
                if(ddkv0 == null) {
                    dcvz.a.d().p("Ignoring non FastInitiation advertisement. Invalid data.", new Object[0]);
                    return;
                }
                cunf cunf0 = dcvz.a;
                cunf cunf1 = cunf0.d();
                Integer integer0 = scanResult0.getRssi();
                int v7 = ddkv0.h;
                cunf1.i("FastInit found with RSSI: %d, Tx: %d", integer0, Integer.valueOf(v7));
                String s1 = scanResult0.getDevice().getAddress();
                int v8 = scanResult0.getRssi();
                long v9 = this.b == 2 ? hvqs.a.aT().at() : hvqs.a.aT().as();
                Map map1 = this.c;
                ddlg ddlg0 = (ddlg)map1.get(s1);
                if(ddlg0 == null) {
                    ddlg0 = new ddlg(this, () -> synchronized(this) {
                        dcvz.a.d().h("FastInit lost sight of %s", s1);
                        this.c.remove(s1);
                        if(!this.k()) {
                            return;
                        }
                        this.m(dcbn0);
                        this.v(dcbn0);
                    }, v9);
                    map1.put(s1, ddlg0);
                    ddlg0.a.a = ddkv0.f;
                    ddlg0.a.d = s1;
                    ddlg0.a.e = ddkv0.b();
                    ddlg0.a.f = ddkv0.i;
                    ddlg0.a.g = ddkv0.j;
                }
                else {
                    ddlg0.d.cancel(true);
                    ddlg0.d = ((cuuh)ddlg0.f.a).g(ddlg0.c, v9, TimeUnit.MILLISECONDS);
                }
                if(!ddlg0.e) {
                    boolean z1 = false;
                    dgaf dgaf0 = this.t;
                    byte[] arr_b9 = ddkv0.e();
                    byte[] arr_b10 = ddkv0.f();
                    dfsk dfsk0 = dgaf0.a;
                    Account account0 = dfsk0.c();
                    if(arr_b9 != null && arr_b10 != null && arr_b9.length == 1 && arr_b10.length == 8) {
                        int v10 = dfsk0.d(account0).f;
                        int v11 = 0;
                        for(Object object0: dgaf0.a(account0, "nearby_sharing_sender_certificate_book_from_self_share").b) {
                            v11 |= Arrays.equals(dizs.d(((dbwz)object0).c.toByteArray(), arr_b9, 8), arr_b10);
                        }
                        if(v11 == 0) {
                        alab1:
                            switch(v10) {
                                case 3: {
                                    z1 = true;
                                    break;
                                }
                                case -1: 
                                case 0: 
                                case 4: {
                                    break;
                                }
                                default: {
                                    for(Object object1: dgaf0.a(account0, "nearby_sharing_sender_certificate_book_from_selected_contacts").b) {
                                        if(!Arrays.equals(dizs.d(((dbwz)object1).c.toByteArray(), arr_b9, 8), arr_b10)) {
                                            continue;
                                        }
                                        z1 = true;
                                        break alab1;
                                    }
                                    if(v10 != 2) {
                                        for(Object object2: dgaf0.a(account0, "nearby_sharing_sender_certificate_book_from_all_contacts").b) {
                                            if(Arrays.equals(dizs.d(((dbwz)object2).c.toByteArray(), arr_b9, 8), arr_b10)) {
                                                z1 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        else if(v10 != 0) {
                            z1 = true;
                        }
                    }
                    ddlg0.a.h = z1;
                    boolean z2 = this.t() && djam.b(this.h) && this.m && z1;
                    ddlg0.e = true;
                    ddlg0.a.b = z2 ? 1 : ddkv0.g;
                    cunf0.b().h("isFastInitSilent is %s.", Boolean.valueOf(z2));
                }
                int v12 = cumz.b() + v8;
                double f = cupp.a(((int)ddlg0.b.a(((double)v12))), v7) * 100.0;
                ddlh ddlh0 = ddlg0.a();
                ddlh ddlh1 = ddlg0.a();
                hvqs hvqs0 = hvqs.a;
                if((f < ((double)hvqs0.aT().ao()))) {
                    ddlh1 = ddlh.a;
                }
                else if(!(f < ((double)hvqs0.aT().ap()))) {
                    if((f < ((double)hvqs0.aT().aq()))) {
                        ddlh1 = ddlh.b;
                    }
                    else if(!(f < ((double)hvqs0.aT().ar()))) {
                        ddlh1 = ddlh.c;
                    }
                    else if(ddlh.a.equals(ddlh0)) {
                        ddlh1 = ddlh.b;
                    }
                }
                else if(ddlh.c.equals(ddlh0)) {
                    ddlh1 = ddlh.b;
                }
                ddlf ddlf0 = ddlg0.a;
                if(ddlf0.c != ddlh1) {
                    ddlf0.c = ddlh1;
                }
                long v13 = System.currentTimeMillis();
                long v14 = v13 - this.u;
                this.u = v13;
                cunf0.d().m("Detected FastInit mac %s, rssi %s, distance %s cm, state %s, type %s, interval %s millis", s1, Integer.valueOf(v8), Long.valueOf(Math.round(f)), ddli.s(ddlh1), ddli.b(ddkv0.g), Long.valueOf(v14));
                this.m(dcbn0);
                this.v(dcbn0);
                return;
            }
            dcvz.a.d().p("Ignoring FastInitiation advertisement. Not scanning.", new Object[0]);
        }
    }

    // Detected as a lambda impl.
    public final void p(dcbn dcbn0) {
        synchronized(this) {
            if(!this.k()) {
                return;
            }
            this.n = false;
            this.v(dcbn0);
            this.o = null;
            dcvz.a.b().p("FastInitiation warming period has ended", new Object[0]);
        }
    }

    public final boolean q(boolean z, dcbn dcbn0) {
        boolean z1;
        synchronized(this) {
            dcvz.a.b().p("Starting scanning for Fast Initiation.", new Object[0]);
            Context context0 = this.h;
            this.k = cupv.a(context0, "FastInitiation");
            this.m = z;
            gged_interceptors gged0 = gged_interceptors.i(this.c.values());
            int v1 = gged0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((ddlg)gged0.get(v2)).e = false;
            }
            this.n = Long.compare(hvqs.D(), 0L) > 0;
            if(z) {
                this.w.o(12);
            }
            z1 = this.v(dcbn0);
            if(z1) {
                IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED");
                cutr.c(context0, this.x, intentFilter0, this.v);
                IntentFilter intentFilter1 = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
                cutr.c(context0, this.y, intentFilter1, this.v);
                IntentFilter intentFilter2 = new IntentFilter("android.location.MODE_CHANGED");
                cutr.c(context0, this.z, intentFilter2, this.v);
                if(this.n) {
                    ddkx ddkx0 = () -> synchronized(this) {
                        if(!this.k()) {
                            return;
                        }
                        this.n = false;
                        this.v(dcbn0);
                        this.o = null;
                        dcvz.a.b().p("FastInitiation warming period has ended", new Object[0]);
                    };
                    long v3 = hvqs.D();
                    this.o = ((cuuh)this.a).g(ddkx0, v3, TimeUnit.MILLISECONDS);
                    return true;
                }
            }
            else {
                this.m = false;
                this.n = false;
            }
        }
        return z1;
    }

    private final ddlf r() {
        gged_interceptors gged0 = gged_interceptors.i(this.c.values()).ot();
        int v = gged0.size();
        ddlf ddlf0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            ddlf ddlf1 = ((ddlg)gged0.get(v1)).a;
            if(ddlf0 == null || ddlh.c.equals(ddlf0.c)) {
                ddlf0 = ddlf1;
            }
            if(ddlh.a.equals(ddlf1.c)) {
                if(ddlf1.b == 0) {
                    return ddlf1;
                }
                ddlf0 = ddlf1;
            }
        }
        return ddlf0;
    }

    private static String s(ddlh ddlh0) {
        switch(ddlh0.ordinal()) {
            case 0: {
                return "CLOSE";
            }
            case 1: {
                return "FAR";
            }
            case 2: {
                return "LOST";
            }
            default: {
                throw new RuntimeException(null, null);
            }
        }
    }

    private final boolean t() {
        return this.i == null ? false : this.i.v();
    }

    private final boolean u() {
        return !czri.U(this.h);
    }

    private final boolean v(dcbn dcbn0) {
        ddlf ddlf0 = this.r();
        ddlh ddlh0 = ddlf0 == null ? ddlh.c : ddlf0.c;
        if(!this.m) {
            return this.w(dcbn0, -1);
        }
        return !ddlh.c.equals(ddlh0) || this.n ? this.w(dcbn0, ((int)hvqs.a.aT().aw())) : this.w(dcbn0, ((int)hvqs.a.aT().au()));
    }

    private final boolean w(dcbn dcbn0, int v) {
        Context context0 = this.h;
        if(context0.getPackageManager().hasSystemFeature("android.hardware.bluetooth") && context0.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            djam.b(context0);
            if(this.k != null && (this.t() || this.j())) {
                if(this.k() && this.b == v) {
                    dcvz.a.d().h("Skip starting FastInitiation scanning, since already scan in current mode %s.", ddli.c(v));
                    return true;
                }
                if(this.k()) {
                    this.k.d(this.l);
                    this.l = null;
                    this.b = -2;
                }
                ScanFilter.Builder scanFilter$Builder0 = new ScanFilter.Builder();
                scanFilter$Builder0.setServiceData(ddkv.a, ddkv.b);
                ScanFilter.Builder scanFilter$Builder1 = new ScanFilter.Builder();
                scanFilter$Builder1.setServiceUuid(ddkv.a);
                if(!hvol.aD() && Build.VERSION.SDK_INT >= 33) {
                    scanFilter$Builder1.setAdvertisingDataTypeWithData(9, Arrays.copyOf(ddkv.c, ddkv.c.length + 1), Arrays.copyOf(ddkv.d, ddkv.d.length + 1));
                }
                List list0 = Arrays.asList(new ScanFilter[]{scanFilter$Builder0.build(), scanFilter$Builder1.build()});
                ScanSettings scanSettings0 = new ScanSettings.Builder().setScanMode(v).setCallbackType(1).setReportDelay(0L).build();
                FastInitiation.6 fastInitiation$60 = new FastInitiation.6(this, context0, dcbn0);
                cupv cupv0 = this.k;
                if(cupv0 != null) {
                    if(hvqz.y()) {
                        cjpc cjpc0 = dizl.b(context0);
                        int v1 = dizl.a(context0, hvqs.aX(), ((int)hvqs.k()));
                        if(v1 == ((int)hvqs.e())) {
                        label_29:
                            int v2 = dizl.a(context0, hvqs.aW(), ((int)hvqs.j()));
                            if(v2 == ((int)hvqs.d())) {
                            label_34:
                                int v3 = dizl.a(context0, hvqs.ba(), ((int)hvqs.O()));
                                if(v3 == ((int)hvqs.f())) {
                                label_39:
                                    int v4 = dizl.a(context0, hvqs.aZ(), ((int)hvqs.N()));
                                    if(v2 == ((int)hvqs.d())) {
                                        dizl.d(context0, hvqs.aX(), ((int)hvqs.e()));
                                        dizl.d(context0, hvqs.aW(), ((int)hvqs.d()));
                                        dizl.d(context0, hvqs.ba(), ((int)hvqs.f()));
                                        dizl.d(context0, hvqs.aZ(), ((int)hvqs.a.aT().f()));
                                    }
                                    else {
                                        cjpa cjpa3 = cjpc0.c();
                                        cjpa3.f(hvqs.aZ(), v4);
                                        if(!cjpd.g(cjpa3)) {
                                            dizl.d(context0, hvqs.aX(), ((int)hvqs.e()));
                                            dizl.d(context0, hvqs.aW(), ((int)hvqs.d()));
                                            dizl.d(context0, hvqs.ba(), ((int)hvqs.f()));
                                            dizl.d(context0, hvqs.aZ(), ((int)hvqs.a.aT().f()));
                                        }
                                    }
                                }
                                else {
                                    cjpa cjpa2 = cjpc0.c();
                                    cjpa2.f(hvqs.ba(), v3);
                                    if(cjpd.g(cjpa2)) {
                                        goto label_39;
                                    }
                                }
                            }
                            else {
                                cjpa cjpa1 = cjpc0.c();
                                cjpa1.f(hvqs.aW(), v2);
                                if(cjpd.g(cjpa1)) {
                                    goto label_34;
                                }
                            }
                        }
                        else {
                            cjpa cjpa0 = cjpc0.c();
                            cjpa0.f(hvqs.aX(), v1);
                            if(cjpd.g(cjpa0)) {
                                goto label_29;
                            }
                        }
                    }
                    if(cupv0.b(list0, scanSettings0, fastInitiation$60)) {
                        this.u = System.currentTimeMillis();
                        this.l = fastInitiation$60;
                        this.b = v;
                        dcvz.a.b().h("Started scanning for FastInitiation with mode: %s", ddli.c(v));
                        return true;
                    }
                }
                dizl.c(context0);
                dcvz.a.b().p("Call to startScan for FastInitiation failed.", new Object[0]);
                return false;
            }
        }
        dcvz.a.b().p("Failed to scan for FastInitiation. Scanning is not supported on this device.", new Object[0]);
        return false;
    }
}

