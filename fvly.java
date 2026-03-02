import android.content.Context;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.google.android.location.collectionlib.DeviceStateScanner.DeviceEventsReceiver;

public final class fvly extends fvnr {
    protected final DeviceStateScanner.DeviceEventsReceiver a;
    protected final Context b;

    public fvly(Context context0, fvls fvls0, fvlt fvlt0, fybc fybc0) {
        super(fvls0, fvlt0, fybc0);
        this.a = new DeviceStateScanner.DeviceEventsReceiver(this);
        this.b = context0;
    }

    public final void a(int v) {
        long v1 = SystemClock.elapsedRealtime();
        this.m.a.i(v, v1);
    }

    @Override  // fvnr
    protected final void b() {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.USER_PRESENT");
        intentFilter0.addAction("android.intent.action.SCREEN_ON");
        intentFilter0.addAction("android.intent.action.SCREEN_OFF");
        intentFilter0.addAction("android.intent.action.BATTERY_CHANGED");
        jwe.c(this.a.a.b, this.a, intentFilter0, null, this.a.a.m, 2);
    }

    @Override  // fvnr
    protected final void c() {
        this.a.a.b.unregisterReceiver(this.a);
    }
}

