import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings.Builder;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.SystemClock;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.personalsafety.scanners.BleScanner.ScanCallbackWrapperWithScanType;
import com.google.android.gms.personalsafety.scanners.BleScheduler;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class eifs extends cmoa implements LocationListener, ehuc, eifk {
    private int A;
    private int B;
    private long C;
    private long D;
    private boolean E;
    private final ScanSettings F;
    private final int G;
    private int H;
    public static eifs a;
    public final eigk b;
    final ScanCallback c;
    final ScanCallback d;
    final ScanCallback e;
    final ScanCallback f;
    final ScanCallback g;
    public final eicb h;
    public ehud i;
    public eigi j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public long o;
    public long p;
    public final bbng q;
    public final Set r;
    final HashMap s;
    public final List t;
    public final ArrayDeque u;
    public final int v;
    private static final ggfp w;
    private BluetoothLeScanner x;
    private final bbku y;
    private boolean z;

    static {
        eifs.w = ggfp.L(Integer.valueOf(2), Integer.valueOf(7), Integer.valueOf(8));
    }

    public eifs(Context context0, bbng bbng0) {
        new HashSet();
        this.z = false;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.C = 0L;
        this.D = 0L;
        this.o = 0L;
        this.p = 0L;
        this.E = false;
        this.r = new HashSet();
        this.s = new HashMap();
        this.t = new ArrayList();
        this.u = new ArrayDeque();
        this.F = new ScanSettings.Builder().setCallbackType(1).setScanMode((hxjf.a.c().c() ? 1 : 2)).setLegacy(false).build();
        this.v = (int)TimeUnit.SECONDS.toMillis(hrtd.a.I().m());
        this.G = (int)hrtd.a.I().j();
        this.b = eigk.c();
        this.y = new bbll(1, 10);
        BluetoothAdapter bluetoothAdapter0 = bahu.a(context0);
        this.h = eicb.a(context0);
        if(bluetoothAdapter0 != null) {
            this.x = bluetoothAdapter0.getBluetoothLeScanner();
        }
        this.c = new BleScanner.ScanCallbackWrapperWithScanType(this, gwgu.c);
        this.d = new BleScanner.ScanCallbackWrapperWithScanType(this, gwgu.b);
        this.e = new BleScanner.ScanCallbackWrapperWithScanType(this, gwgu.d);
        this.f = new BleScanner.ScanCallbackWrapperWithScanType(this, gwgu.e);
        this.g = new BleScanner.ScanCallbackWrapperWithScanType(this, gwgu.f);
        this.q = bbng0;
    }

    public static eifs b(Context context0) {
        if(eifs.a == null) {
            eifs.a = new eifs(context0, bbnk.a);
        }
        return eifs.a;
    }

    final void c(gwgu gwgu0) {
        synchronized(this) {
            ScheduledFuture scheduledFuture0 = (ScheduledFuture)this.s.remove(gwgu0);
            if(scheduledFuture0 != null && !scheduledFuture0.cancel(false)) {
                ((ggtj)eicd.a.j()).B("Unable to cancel scheduled stop for scan type %s", gwgu0.name());
            }
        }
    }

    @Override  // eifk
    public final void d(ActivityRecognitionResult activityRecognitionResult0) {
        if(hxjo.d()) {
            Integer integer0 = activityRecognitionResult0.d().a();
            if(eifs.w.contains(integer0)) {
                long v = hrtd.a.I().l();
                this.h(gwgu.b, v);
            }
        }
    }

    public final void e() {
        if(this.s()) {
            return;
        }
        eica.b(this.u, "Connecting to CHRE and Nearby nanoapp");
        if(this.i == null) {
            this.i = ehud.a();
        }
        this.i.b(this);
    }

    final void f() {
        if(this.i != null && this.i.a) {
            this.k = true;
            this.t(3);
        }
    }

    public final void g(gwgu gwgu0) {
        ArrayList arrayList0;
        if(this.x == null) {
            ((ggtj)eicd.a.j()).x("BLS unavailable");
            return;
        }
        if(gwgu0 == null) {
            ((ggtj)eicd.a.j()).x("Scan type must be set");
            return;
        }
        if(this.r(gwgu0)) {
            eifm eifm0 = eifn.a(gwgu0);
            for(Object object0: new HashSet(this.r)) {
                gwgu gwgu1 = (gwgu)object0;
                eifm eifm1 = eifn.a(gwgu1);
                int v = eifm0.e;
                if(v > eifm1.e) {
                    eifn.a(gwgu1);
                    this.p(gwgu1, true);
                }
                else if(v == eifn.a(gwgu1).e && gwgu1 != gwgu0) {
                    this.p(gwgu1, true);
                }
                else {
                    if(gwgu1 != gwgu0) {
                        continue;
                    }
                    this.p(gwgu1, false);
                }
            }
            ScanCallback scanCallback0 = this.w(gwgu0);
            ++this.l;
            if(hrtd.at() && (gwgu0 == gwgu.c || gwgu0 == gwgu.e || gwgu0 == gwgu.f)) {
                arrayList0 = new ArrayList();
            }
            else {
                arrayList0 = new ArrayList();
                for(Object object1: eifv.a) {
                    arrayList0.add(((eifu)object1).c());
                }
            }
            if(scanCallback0 == null) {
                ((ggtj)eicd.a.j()).x("Scan callback is null");
            }
            else {
                BluetoothLeScanner bluetoothLeScanner0 = this.x;
                if(bluetoothLeScanner0 == null) {
                label_50:
                    this.r.add(gwgu0);
                    eica.b(this.u, eifn.b(gwgu0));
                    if(gwgu0 == gwgu.b) {
                        this.h.p(5, 0L, 2);
                    }
                }
                else {
                    try {
                        bluetoothLeScanner0.startScan(arrayList0, this.F, scanCallback0);
                        goto label_50;
                    }
                    catch(IllegalStateException | SecurityException | NullPointerException exception0) {
                        a.e(eicd.a.j(), "Could not start scan (type %s)", eifn.b(gwgu0), exception0);
                        eica.b(this.u, "BLS failed to start");
                        eicb eicb0 = this.h;
                        eicb0.q(2);
                        if(gwgu0 == gwgu.b) {
                            eicb0.p(5, 0L, 3);
                        }
                    }
                }
            }
            if(gwgu0 == gwgu.b) {
                int v1 = this.n + 1;
                this.n = v1;
                if(v1 == this.G) {
                    this.i(this.A);
                }
            }
            this.C = System.currentTimeMillis();
            eijr eijr0 = eijr.a();
            long v2 = System.currentTimeMillis();
            new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.getDefault()).format(new Date(v2));
            eijn eijn0 = new eijn(v2);
            gmbu.t(eijr0.b.b(eijn0, gmap.a), new eign(), gmap.a);
        }
        this.E = false;
    }

    public final void h(gwgu gwgu0, long v) {
        if(this.r(gwgu0)) {
            this.g(gwgu0);
            eifr eifr0 = () -> this.p(gwgu0, true);
            gmcf gmcf0 = this.y.g(eifr0, v, TimeUnit.MILLISECONDS);
            this.s.put(gwgu0, gmcf0);
        }
    }

    public final void i(int v) {
        this.B = v;
        ((ggtj)eicd.a.h()).z("Scan interval updated to %d", this.B);
    }

    public final void j(eigi eigi0) {
        synchronized(this) {
            this.j = eigi0;
            hrtd.W();
            if(hrtd.W()) {
                this.e();
                return;
            }
            if(hrtd.S()) {
                this.k(eigi0);
                return;
            }
            ((ggtj)eicd.a.j()).x("BLS not running for auto");
        }
    }

    public final void k(eigi eigi0) {
        synchronized(this) {
            if(this.z) {
                return;
            }
            this.f();
            this.z = true;
            this.n = 0;
            clkn clkn0 = new clkn();
            clkn0.w(BleScheduler.a);
            clkn0.q("personal_safety_ble_oneoff");
            clkn0.x(0, 0);
            clkn0.y(2, 2);
            clkn0.e(2L, 10L);
            clkn0.p = false;
            clko clko0 = clkn0.a();
            cljp.a(AppContextProvider.a()).f(clko0);
            clkq clkq0 = new clkq();
            clkq0.w("com.google.android.gms.personalsafety.scanners.BleScheduler");
            clkq0.q("personal_safety_ble_periodic");
            clkq0.v(2);
            clkq0.x(0, 0);
            clkq0.y(2, 2);
            clkq0.e(hrtd.f(), hrtd.a.I().n(), cllj.a);
            clkq0.p = false;
            clkr clkr0 = clkq0.a();
            cljp.a(AppContextProvider.a()).f(clkr0);
            this.A = eigi0.c;
            this.i(eigi0.c);
            eica.a(this.u, "Duty cycled AP BLS has started");
            this.u(1);
        }
    }

    @Override  // cmoa
    public final void kq(LocationResult locationResult0) {
        if(!hrtd.P()) {
            return;
        }
        if(!this.q()) {
            ((ggtj)eicd.a.j()).x("Ble scanner not running, ignore location update");
            return;
        }
        if(this.s()) {
            this.D = System.currentTimeMillis();
            this.t(2);
            return;
        }
        if(this.C - this.D > hrtd.r()) {
            this.E = true;
            ((ggtj)eicd.a.j()).x("Last location and ble data are far apart");
        }
        this.D = System.currentTimeMillis();
        long v = hxjf.b();
        this.h(gwgu.b, v);
    }

    public final void l() {
        synchronized(this) {
            this.f();
            this.m();
        }
    }

    public final void m() {
        cljp.a(AppContextProvider.a()).c(BleScheduler.a);
        this.n = 0;
        if(this.z) {
            eica.a(this.u, "Duty cycled BLS has ended");
            this.z = false;
        }
    }

    public final void n() {
        this.k = false;
        ehud ehud0 = this.i;
        if(ehud0 == null) {
            return;
        }
        bboh bboh0 = eicd.a;
        ((ggtj)bboh0.h()).B("[%s] Stop CHRE scan.", "ChreScanner");
        ehub ehub0 = ehud0.d;
        if(!ehub0.c()) {
            ((ggtj)bboh0.i()).B("[%s] ChreCommunication is not connected. Cannot stop a CHRE scan.", "ChreScanner");
        }
        else if(ehub0.d(ehud.e(false))) {
            ehud0.a = false;
            ehud0.b = null;
            this.i = null;
            ((ggtj)bboh0.h()).x("CHRE BLS has been stopped");
            eica.b(this.u, "CHRE BLS has ended");
            return;
        }
        ((ggtj)bboh0.i()).x("Failed to stop CHRE BLS");
        eica.b(this.u, "Failed to stop CHRE BLS");
    }

    // Detected as a lambda impl.
    public final void o(gwgu gwgu0) {
        this.p(gwgu0, true);
    }

    @Override  // android.location.LocationListener
    public final void onLocationChanged(Location location0) {
        if(!this.q()) {
            ((ggtj)eicd.a.j()).x("Ble scanner not running, ignore location update");
            return;
        }
        if(this.s()) {
            this.D = System.currentTimeMillis();
            this.t(2);
            return;
        }
        if(this.C - this.D > hrtd.r()) {
            this.E = true;
            ((ggtj)eicd.a.j()).x("Last location and ble data are far apart");
        }
        this.D = System.currentTimeMillis();
        long v = hxjf.b();
        this.h(gwgu.b, v);
    }

    public final void p(gwgu gwgu0, boolean z) {
        Set set0 = this.r;
        if(!set0.contains(gwgu0)) {
            return;
        }
        this.c(gwgu0);
        ScanCallback scanCallback0 = this.w(gwgu0);
        ++this.m;
        BluetoothLeScanner bluetoothLeScanner0 = this.x;
        if(bluetoothLeScanner0 != null && scanCallback0 != null) {
            try {
                bluetoothLeScanner0.stopScan(scanCallback0);
                set0.remove(gwgu0);
                if(z) {
                    eigk eigk0 = this.b;
                    if(eigk0 != null) {
                        eigk0.a(gwgu0);
                    }
                }
            }
            catch(IllegalStateException | SecurityException | NullPointerException exception0) {
                a.ae(eicd.a.j(), "Could not stop scan", exception0);
                this.h.q(3);
            }
        }
    }

    final boolean q() {
        return this.z || this.s();
    }

    final boolean r(gwgu gwgu0) {
        int v = (int)hrtd.a.I().k();
        return this.E || gwgu0 == gwgu.c || gwgu0 == gwgu.d || gwgu0 == gwgu.e || gwgu0 == gwgu.f || gwgu0 == gwgu.b && this.s() || Long.compare(System.currentTimeMillis(), this.C + ((long)this.B)) > 0 && this.n < v;
    }

    public final boolean s() {
        return this.i != null && this.i.a;
    }

    final void t(int v) {
        if(this.i != null) {
            long v1 = SystemClock.elapsedRealtime() - this.o;
            if(v != 3 && hrtd.s() != 0L && v1 <= hrtd.s()) {
                ((ggtj)eicd.a.h()).B("Not flushing CHRE reports (%s), not enough time passed since last flush", "LOCATION_UPDATE");
                return;
            }
            ehud ehud0 = this.i;
            gftb.check(ehud0);
            if(ehud0.d(v)) {
                this.o = SystemClock.elapsedRealtime();
                return;
            }
            ((ggtj)eicd.a.i()).x("Failed to flush CHRE reports");
            return;
        }
        ((ggtj)eicd.a.i()).x("chreScanner is null");
    }

    public final void u(int v) {
        this.H = v;
        this.b.d(v);
    }

    public final int v() {
        int v = this.H;
        if(v == 0) {
            return 1;
        }
        return v - 1 == 0 ? 2 : 3;
    }

    private final ScanCallback w(gwgu gwgu0) {
        switch(gwgu0.ordinal()) {
            case 1: {
                return this.d;
            }
            case 2: {
                return this.c;
            }
            case 3: {
                return this.e;
            }
            case 4: {
                return this.f;
            }
            case 5: {
                return this.g;
            }
            default: {
                return null;
            }
        }
    }
}

