import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;
import java.io.Closeable;

final class fejo implements fekb, ffmj, Closeable {
    private final fczq a;
    private final fekh b;
    private final fejs c;
    private final fdpk d;

    public fejo(Context context0, fczq fczq0) {
        this.d = new fdpk(10);
        batl.h("BluetoothClientConnection.constructor");
        this.a = fczq0;
        fekh fekh0 = new fekh();
        this.b = fekh0;
        fejs fejs0 = new fejs(context0, (bahu.a(context0) == null ? null : bahu.a(context0).getRemoteDevice(fczq0.c)), fczq0, fekh0, ffgp.i());
        this.c = fejs0;
        ffmn.d("WearableBluetooth", "Starting BT client thread for config: %s", new Object[]{fczq0});
        fejs0.start();
    }

    @Override  // fekb
    public final void b() {
        batl.h("resetBackoffAndRetryConnection");
        this.c.d();
    }

    @Override  // fekb
    public final void c() {
        batl.h("retryConnection");
        this.c.c();
    }

    @Override  // fekb
    public final void close() {
        batl.h("close");
        if(Log.isLoggable("WearableBluetooth", 3)) {
            Log.d("WearableBluetooth", "Interrupting bluetooth thread");
        }
        this.c.close();
    }

    @Override  // fekb
    public final void f(int v) {
        fejs fejs0 = this.c;
        fczq fczq0 = fejs0.b;
        ffmn.a("WearableBluetooth", "updateConnectionStrategy(%d), previous=%d, connected=%b", new Object[]{v, ((int)fczq0.l), Boolean.valueOf(fejs0.f)});
        boolean z = hzun.a.b().l();
        if(v != fczq0.l) {
        label_7:
            fczq0.l = v;
            felq felq0 = fejs.b(fczq0);
            fejs0.d.set(felq0);
            if(!fejs0.f || !z) {
                PendingIntent pendingIntent0 = fejs0.a();
                fejs0.c.a(pendingIntent0);
                fejs0.d();
            }
        }
        else if(!z) {
            z = false;
            goto label_7;
        }
        this.d.a("Updated to " + fczq.c(v));
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        batl.h("dump");
        bbpd0.println("Connection: " + this.a.c);
        bbpd0.println(this.a);
        bbpd0.println("---- Retry strategy update history ----");
        bbpd0.println(this.d);
        bbpd0.println("---- BT Connection Health ----");
        this.b.md(bbpd0, z, z1);
        bbpd0.println("---- Client Connection Control Flags ----");
        bbpd0.b();
        bbpd0.c("doNotConnectIfNotBonded", Boolean.valueOf(hzuk.c()));
        bbpd0.a();
        bbpd0.println();
    }
}

