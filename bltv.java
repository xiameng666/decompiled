import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.fido.authenticator.service.controllers.UserAuthorizationController.3;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import java.util.concurrent.atomic.AtomicInteger;

public final class bltv {
    public final Context a;
    public final String b;
    public final blsj c;
    public final AtomicInteger d;
    public bltu e;
    public TracingBroadcastReceiver f;
    public final int g;
    public static final int h;
    private final bnae i;
    private final bnaj j;
    private TracingBroadcastReceiver k;

    static {
        bnaa.a("UserApprovalController");
    }

    public bltv(Context context0, bnae bnae0, String s, int v) {
        bnah bnah0 = new bnah(context0);
        super();
        this.a = context0;
        this.i = bnae0;
        gftb.check(s);
        this.b = s;
        this.j = bnah0;
        this.g = v;
        String s1 = context0.getString((v == 1 ? 0x7F151184 : 0x7F151160));  // string:fido_paask_notification_title "@com.google.android.gms:string/fido_paask_header"
        boolean z = blyq.c(3, bnae0.c);
        this.c = new blsj(context0, bnae0.a, s1, s, z);
        this.d = new AtomicInteger(0);
    }

    public final void a() {
        AtomicInteger atomicInteger0 = this.d;
        switch(atomicInteger0.get()) {
            case 1: {
                this.c.a();
                this.e();
                break;
            }
            case 2: {
                this.d();
                Intent intent0 = new Intent("com.google.android.gms.fido.authenticator.ui.dismiss_authenticator_activity");
                this.a.sendBroadcast(intent0);
            }
        }
        bltu bltu0 = this.e;
        if(bltu0 != null) {
            bltu0.a(16);
        }
        atomicInteger0.set(3);
    }

    public final void b(blhc blhc0) {
        this.j.y(this.i, blhc0);
    }

    public final void c() {
        AtomicInteger atomicInteger0 = this.d;
        boolean z = true;
        switch(atomicInteger0.get()) {
            case 0: 
            case 1: {
                break;
            }
            default: {
                z = false;
            }
        }
        baqc.d(z);
        atomicInteger0.set(2);
        this.b(blhc.aq);
        if(this.k == null) {
            this.k = new UserAuthorizationController.3(this);
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("com.google.android.gms.fido.authenticator.service.authenticator_activity_state_update");
            intentFilter0.addAction("com.google.android.gms.fido.authenticator.service.authenticator_activity_completion");
            jwe.b(this.a, this.k, intentFilter0, 2);
        }
        bluf bluf0 = new bluf();
        bluf0.c(8);
        bluf0.a = this.b;
        Intent intent0 = bluf0.a();
        intent0.addFlags(0x10000000).addFlags(0x20000000).addFlags(0x800000).addFlags(0x40000000).addFlags(4).addFlags(0x10000);
        this.a.startActivity(intent0);
    }

    public final void d() {
        TracingBroadcastReceiver tracingBroadcastReceiver0 = this.k;
        if(tracingBroadcastReceiver0 == null) {
            return;
        }
        this.a.unregisterReceiver(tracingBroadcastReceiver0);
        this.k = null;
    }

    public final void e() {
        TracingBroadcastReceiver tracingBroadcastReceiver0 = this.f;
        if(tracingBroadcastReceiver0 == null) {
            return;
        }
        this.a.unregisterReceiver(tracingBroadcastReceiver0);
        this.f = null;
    }

    public final boolean f() {
        KeyguardManager keyguardManager0 = (KeyguardManager)this.a.getSystemService("keyguard");
        return keyguardManager0 != null && keyguardManager0.isKeyguardLocked();
    }
}

