import android.app.PendingIntent;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

public final class cypo implements Runnable {
    public final cypu a;

    public cypo(cypu cypu0) {
        this.a = cypu0;
    }

    @Override
    public final void run() {
        cypu cypu0 = this.a;
        if(cypu0.p == null) {
            ((ggtj)cypu0.u.f().ar(8006)).z("SwitchUiHandler: Already dismissed notification for notification id: %s", 123001);
            return;
        }
        cypu0.c();
        if(cypu0.i == null) {
        label_11:
            if(cypu0.k == null) {
            label_17:
                Intent intent0 = new Intent("com.google.android.gms.nearby.fastpair.sass.device.ACTION_SWITCH_FAILED_TWICE_CLICK").setPackage("com.google.android.gms");
                PendingIntent pendingIntent0 = PendingIntent.getBroadcast(cypu0.b, 8, intent0, 0xC000000);
                cypu0.t = cypu0.f.a();
                cyow cyow0 = new cyow(cypu0.d, cypu0.c.b, pendingIntent0);
                cypu0.d.b.execute(cyow0);
                cypu0.g.k(cypu0.c.e, cyjt.o);
                cyph cyph0 = new cyph(cypu0);
                long v = cypu0.a(hvpg.a.aY().dm());
                cypu0.q = ((cuuh)cypu0.a).g(cyph0, v, TimeUnit.SECONDS);
            }
            else {
                Runnable runnable1 = cypu0.l;
                if(runnable1 != null) {
                    runnable1.run();
                    cypu0.m = cypu0.k;
                    goto label_26;
                }
                goto label_17;
            }
        }
        else {
            Runnable runnable0 = cypu0.l;
            if(runnable0 != null) {
                runnable0.run();
                cypu0.m = cypu0.i;
                goto label_26;
            }
            goto label_11;
        }
    label_26:
        cypu0.l = null;
    }
}

