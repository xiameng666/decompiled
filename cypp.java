import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.service.notification.StatusBarNotification;

public final class cypp implements Runnable {
    public final cypu a;

    public cypp(cypu cypu0) {
        this.a = cypu0;
    }

    @Override
    public final void run() {
        cypu cypu0 = this.a;
        Context context0 = cypu0.b;
        StatusBarNotification[] arr_statusBarNotification = new cuqn(context0).k();
        for(int v = 0; v < arr_statusBarNotification.length; ++v) {
            if(arr_statusBarNotification[v].getNotification().getChannelId().equals("SASS_NOTIFICATION_CHANNEL2")) {
                cypu0.t = Math.max(cypu0.t, cypu0.f.a());
            }
        }
        long v1 = cypu0.t + hvpg.a.aY().cX();
        bbng bbng0 = cypu0.f;
        if(v1 > bbng0.a()) {
            cypu0.i();
            return;
        }
        if(!cypu0.o()) {
            cypu0.l();
            return;
        }
        if(cypu0.p()) {
            ggtj ggtj0 = (ggtj)cypu0.u.d().ar(8013);
            String s = cypu0.c.b();
            ggtj0.B("SwitchUiHandler: Show offboard notification for %s", gxyf.b(gxye.a, s));
            cypu0.d.f(123003);
            PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, 7, new Intent("com.google.android.gms.nearby.fastpair.sass.device.ACTION_OFFBOARD_CLICK").setPackage("com.google.android.gms"), 0xC000000);
            cypa cypa0 = new cypa(cypu0.d, cypu0.c.b, pendingIntent0);
            cypu0.d.b.execute(cypa0);
            cypu0.g.k(cypu0.c.e, cyjt.m);
            cypu0.g.e(cyjt.m);
            cypu0.g.k(cypu0.c.e, cyjt.m);
            String s1 = cypu0.c.a.getAddress();
            cyrk cyrk0 = new cyrk(bbng0.a());
            gmbu.t(cypu0.e.g(s1, cyrk0, false), new cypt(cypu0), gmap.a);
            return;
        }
        ((ggtj)cypu0.u.g().ar(8005)).x("SwitchUiHandler: One of onboard/offboard notification should have been shown.");
    }
}

