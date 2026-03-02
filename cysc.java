import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.nearby.fastpair.sass.wear.WearScannerHelper.2;
import java.io.PrintWriter;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class cysc implements cyga, gxxt {
    public final Context a;
    public final cxnb b;
    public final PackageManager c;
    public final gxxu d;
    public final cyrz e;
    public final fced f;
    public final DisplayManager g;
    public final Handler h;
    public Runnable i;
    public final cygb j;
    public final cxzo k;
    public final AudioManager l;
    public String m;
    public cust n;
    public boolean o;
    private final kba p;
    private final gxuf q;
    private final ScheduledExecutorService r;
    private BroadcastReceiver s;
    private DisplayManager.DisplayListener t;
    private ScheduledFuture u;

    public cysc(Context context0, kba kba0, cxnb cxnb0, gxuf gxuf0, gxxu gxxu0, bbng bbng0, PackageManager packageManager0, fced fced0, cygb cygb0, cxzo cxzo0, AudioManager audioManager0) {
        this.h = new clht(Looper.getMainLooper());
        this.r = new bbll(1, 10);
        this.n = cyjh.a;
        this.a = context0;
        this.p = kba0;
        this.b = cxnb0;
        this.q = gxuf0;
        this.d = gxxu0;
        this.e = new cyrz(bbng0);
        this.c = packageManager0;
        this.f = fced0;
        DisplayManager displayManager0 = (DisplayManager)context0.getSystemService(DisplayManager.class);
        gfuy.e(displayManager0);
        this.g = displayManager0;
        this.j = cygb0;
        this.k = cxzo0;
        this.l = audioManager0;
    }

    @Override  // gxxt
    public final void a(int v, int v1, int v2, BluetoothDevice bluetoothDevice0) {
        if(v2 != 0 && v2 != 2) {
            return;
        }
        this.k();
    }

    @Override  // gxxt
    public final void b(BluetoothDevice bluetoothDevice0) {
    }

    @Override  // gxxt
    public final void c(BluetoothDevice bluetoothDevice0, int v) {
    }

    @Override  // gxxt
    public final void d(int v, BluetoothProfile bluetoothProfile0) {
    }

    @Override  // cyga
    public final void f() {
        Object object0 = this.p.a();
        if(object0 != null) {
            ((cyfa)object0).b.remove(this);
        }
        this.d.n(this);
        this.l(3);
        DisplayManager.DisplayListener displayManager$DisplayListener0 = this.t;
        if(displayManager$DisplayListener0 != null) {
            this.g.unregisterDisplayListener(displayManager$DisplayListener0);
        }
        Runnable runnable0 = this.i;
        if(runnable0 != null) {
            this.h.removeCallbacks(runnable0);
        }
        cutr.f(this.a, this.s);
    }

    @Override  // cyga
    public final void g(PrintWriter printWriter0) {
        printWriter0.println();
        printWriter0.println("WearScannerHelper");
        printWriter0.printf("  ", new Object[0]).println(this.e.toString().replace("\n", "\n  "));
    }

    @Override  // cyga
    public final void h() {
        this.i = () -> {
            cyrr cyrr0 = new cyrr(this);
            this.r.execute(cyrr0);
        };
        Object object0 = this.p.a();
        if(object0 != null) {
            ((cyfa)object0).b.add(this);
        }
        this.k();
        this.d.j(this);
        cyrt cyrt0 = new cyrt(this);
        this.t = cyrt0;
        clht clht0 = new clht(Looper.getMainLooper());
        this.g.registerDisplayListener(cyrt0, clht0);
        WearScannerHelper.2 wearScannerHelper$20 = new WearScannerHelper.2(this);
        this.s = wearScannerHelper$20;
        IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.nearby.fastpair.sass.device.ACTION_CONNECTING_UI_LAUNCHING");
        cutr.b(this.a, wearScannerHelper$20, intentFilter0);
    }

    public final void i(Runnable runnable0, long v) {
        ScheduledFuture scheduledFuture0 = this.u;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
            this.u = null;
        }
        if(v > 0L) {
            this.u = ((bbll)this.r).g(runnable0, v, TimeUnit.SECONDS);
        }
    }

    public final void j(String s) {
        cyry cyry0 = new cyry(this, s);
        this.q.f(cyry0);
    }

    @Override  // gxxt
    public final void jl() {
    }

    // Detected as a lambda impl.
    public final void k() {
        cyrr cyrr0 = new cyrr(this);
        this.r.execute(cyrr0);
    }

    public final void l(int v) {
        this.m = null;
        cyrw cyrw0 = new cyrw(this, v);
        this.q.f(cyrw0);
    }
}

