import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.view.Display;
import com.google.android.gms.findmydevice.spot.locationreporting.BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver;
import j..util.Objects;
import java.util.concurrent.Executor;

@ibnh
public final class bowz implements bown {
    public static final bboh a;
    public final fqey b;
    public final bpbb c;
    public final fqxe d;
    public final gmch e;
    public final Executor f;
    public final Context g;
    public final Object h;
    public BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver i;
    private final bpav j;
    private final cljp k;
    private final Display l;

    static {
        bowz.a = bboh.b("BatchScanningManager", bbcu.eD);
    }

    public bowz(bpav bpav0, fqey fqey0, bpbb bpbb0, fqxe fqxe0, gmch gmch0, Context context0) {
        this.h = new Object();
        this.j = bpav0;
        this.b = fqey0;
        this.c = bpbb0;
        this.d = fqxe0;
        this.e = gmch0;
        this.f = new gmct(gmch0);
        this.g = context0;
        this.k = cljp.a(context0);
        this.l = ((DisplayManager)context0.getSystemService(DisplayManager.class)).getDisplay(0);
    }

    @Override  // bown
    public final void a() {
        hsxl hsxl0 = hsxl.a;
        if(hsxl0.b().a()) {
            boolean z = hsxl0.b().b();
            if(this.b.a(z)) {
                ((ggtj)bowz.a.h()).x("Initializing batch scanner.");
                Objects.requireNonNull(this.j);
                fray.a(gdtd.e(new bowp(this.j), this.e).h(new bowq(this), gmap.a), "Ble batch scanner initialization failed", new Object[0]);
            }
        }
    }

    @Override  // bown
    public final void b() {
        synchronized(this.h) {
            BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0 = this.i;
            if(batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0 != null) {
                batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0.c();
            }
        }
    }

    @Override  // bown
    public final void c() {
        synchronized(this.h) {
            BatchScanningManagerImpl.ScreenOnOffBroadcastReceiver batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0 = this.i;
            if(batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0 != null) {
                batchScanningManagerImpl$ScreenOnOffBroadcastReceiver0.d();
            }
        }
    }

    public final void d() {
        this.k.c("com.google.android.gms.findmydevice.spot.locationreporting.BatchScanningGmsTaskService");
    }

    public final void e(boolean z, long v) {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("start_batch_scanning", z);
        clkn clkn0 = new clkn();
        clkn0.w("com.google.android.gms.findmydevice.spot.locationreporting.BatchScanningGmsTaskService");
        clkn0.u = bundle0;
        clkn0.e(v, 1L + v);
        int v1 = 2;
        clkn0.g(2);
        clkn0.r(false);
        if(hsxl.e()) {
            v1 = 1;
        }
        clkn0.v(v1);
        clkn0.q("FMD_SPOT_LRBSCN");
        clko clko0 = clkn0.a();
        this.k.f(clko0);
    }

    public final boolean f() {
        return this.l != null && this.l.getState() == 1;
    }
}

