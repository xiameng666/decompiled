import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.nearby.fastpair.sass.device.connection.ui.SwitchUiHandler.1;
import j..util.Objects;

public final class cyps implements Runnable {
    public final SwitchUiHandler.1 a;
    public final Intent b;
    public final Context c;

    public cyps(SwitchUiHandler.1 switchUiHandler$10, Intent intent0, Context context0) {
        this.a = switchUiHandler$10;
        this.b = intent0;
        this.c = context0;
    }

    @Override
    public final void run() {
        cypu cypu0 = this.a.a;
        ggtj ggtj0 = (ggtj)cypu0.u.d().ar(0x1F35);
        Intent intent0 = this.b;
        ggtj0.B("SwitchUiHandler: Received action %s", (intent0 == null ? "null" : intent0.getAction()));
        if(intent0 != null && !TextUtils.isEmpty(intent0.getAction())) {
            if("com.google.android.gms.nearby.fastpair.sass.device.ACTION_REVERT_CONNECTION".equals(intent0.getAction())) {
                cypu0.g.d(cyjt.e);
                cypu.q(cypu0);
                Runnable runnable0 = cypu0.h;
                if(runnable0 != null) {
                    runnable0.run();
                }
                cypu0.s.a();
                cypu0.f();
                cypu0.k();
                cypu0.b();
                cypu0.h();
                return;
            }
            if("com.google.android.gms.nearby.fastpair.sass.device.ACTION_MOVED_TO_OTHER_DEVICE".equals(intent0.getAction())) {
                cypu0.g.d(cyjt.f);
                cypu.q(cypu0);
                Runnable runnable1 = cypu0.j;
                if(runnable1 != null) {
                    runnable1.run();
                }
                cypu0.s.a();
                cypu0.d();
                cypu0.k();
                cypu0.b();
                cypu0.h();
                return;
            }
            if("com.google.android.gms.nearby.fastpair.sass.device.ACTION_SWITCH_FAILED_CLICK".equals(intent0.getAction())) {
                cypu0.g.k(cypu0.c.e, cyjt.n);
                cypu0.g.d(cyjt.n);
                Runnable runnable2 = cypu0.m;
                if(runnable2 != null) {
                    runnable2.run();
                }
                cypu0.g();
                cypu0.k();
                return;
            }
            if("com.google.android.gms.nearby.fastpair.sass.device.ACTION_REVERT_FEEDBACK_CLICK".equals(intent0.getAction())) {
                cypu0.g.d(cyjt.p);
                Objects.requireNonNull(cypu0);
                cypr cypr0 = new cypr(cypu0);
                cypu0.a.execute(cypr0);
                cyfe.a(this.c, "Audio switch failed", cyfe.c);
                return;
            }
            if("com.google.android.gms.nearby.fastpair.sass.device.ACTION_ONBOARD_CLICK".equals(intent0.getAction())) {
                cypu0.g.d(cyjt.l);
                cypu0.n();
                return;
            }
            if("com.google.android.gms.nearby.fastpair.sass.device.ACTION_OFFBOARD_CLICK".equals(intent0.getAction())) {
                cypu0.g.d(cyjt.m);
                cypu0.n();
                return;
            }
            if("com.google.android.gms.nearby.fastpair.sass.device.ACTION_SWITCH_FAILED_TWICE_CLICK".equals(intent0.getAction())) {
                cypu0.g.k(cypu0.c.e, cyjt.o);
                cypu0.g.d(cyjt.o);
                cypu0.n();
            }
        }
    }
}

