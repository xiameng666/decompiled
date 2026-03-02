import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.google.android.gms.auth.authzen.transaction.ScreenLocker.1;

public final class aiky {
    public final xob a;
    public final hhqw b;
    public final Bundle c;
    public final long d;
    public boolean e;
    public static final baun f;
    private BroadcastReceiver g;
    private ServiceConnection h;
    private boolean i;
    private final aikk j;

    static {
        aiky.f = new baun(new String[]{"ScreenLocker"});
    }

    public aiky(xob xob0, hhqw hhqw0, Bundle bundle0, long v, aikk aikk0) {
        this.a = xob0;
        this.b = hhqw0;
        this.c = bundle0;
        this.d = v;
        this.j = aikk0;
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.USER_PRESENT");
        ScreenLocker.1 screenLocker$10 = new ScreenLocker.1(this);
        this.g = screenLocker$10;
        jwe.b(xob0, screenLocker$10, intentFilter0, 2);
        this.h = new aikw(this);
        bbic.a().d(xob0, new Intent().setClassName(xob0, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"), this.h, 1);
        evql evql0 = new azts(xob0, null).cg();
        evql0.b(new aiku(this));
        evql0.A(new aikv());
    }

    public final ailt a() {
        ailt ailt0 = new ailq();
        ailt0.setArguments(this.c);
        return ailt0;
    }

    public final void b() {
        BroadcastReceiver broadcastReceiver0 = this.g;
        if(broadcastReceiver0 != null) {
            this.a.unregisterReceiver(broadcastReceiver0);
            this.g = null;
        }
        this.d();
    }

    public final void c(boolean z) {
        if(this.i) {
            return;
        }
        this.i = true;
        aikl aikl0 = this.j.a;
        ailt ailt0 = aikl0.b();
        ailt0.E();
        aikl0.m(ailq.a, ailt0);
        if(z) {
            aikl0.h();
        }
        this.b();
    }

    public final void d() {
        if(this.h != null) {
            bbic.a().b(this.a, this.h);
            this.h = null;
        }
    }
}

