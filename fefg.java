import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Looper;
import android.provider.Settings.System;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.node.ble.IosSystemServicesHandler.1;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public final class fefg implements fdyv {
    public feff a;
    public final Looper b;
    public final Context c;
    public final feez d;
    public boolean e;
    public final AtomicBoolean f;
    public final fefj g;
    public final ayux h;
    public final ayux i;
    public final ayux j;
    public final ayux k;
    public final BroadcastReceiver l;
    public final IntentFilter m;
    public boolean n;
    public ContentObserver o;
    public feeh p;
    public feef q;
    private final fdyu r;

    public fefg(Context context0, feez feez0, fefj fefj0, Looper looper0, fdyu fdyu0) {
        this.e = false;
        this.f = new AtomicBoolean(false);
        Objects.requireNonNull(this);
        this.l = new IosSystemServicesHandler.1(this);
        this.m = new IntentFilter("com.google.android.clockwork.settings.ACTION_SET_HOME_READY");
        this.n = false;
        this.c = context0;
        this.d = feez0;
        this.g = fefj0;
        this.b = looper0;
        this.r = fdyu0;
        fdob fdob0 = fdob.b();
        this.h = fdob0.a(fdnl.b);
        this.j = fdob0.a(fdnl.d);
        this.i = fdob0.a(fdnl.a);
        this.k = fdob0.a(fdnl.c);
        fdyu0.e(this);
    }

    @Override  // fdyv
    public final boolean a(int v, fdpl fdpl0, String s, byte[] arr_b, String s1, boolean z) {
        if(hzxc.a.b().a() && Objects.equals(s, "/notifications/request_ancs_permission")) {
            this.f.set(true);
            this.a.a();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fesw.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fesw)hftp0.b_message).c = 1;
            ((fesw)hftp0.b_message).b |= 1;
            byte[] arr_b1 = ((fesw)hftp0.N_build()).toBytesArray();
            fdyr fdyr0 = new fdyr(v, new byte[0]);
            MessageOptions messageOptions0 = new MessageOptions(0);
            this.r.g(fdpl0, s1, "/notifications/request_ancs_permission", arr_b1, null, fdyr0, messageOptions0);
            return true;
        }
        return false;
    }

    public final void b() {
        this.e = false;
        if(this.n) {
            this.n = false;
            this.c.unregisterReceiver(this.l);
        }
        if(hzxc.c()) {
            this.d();
        }
    }

    public final void c(feff feff0) {
        gftb.r(this.a == null, "listener should only be set once.");
        gftb.check(feff0);
        this.a = feff0;
    }

    public final void d() {
        if(this.o == null) {
            return;
        }
        this.c.getContentResolver().unregisterContentObserver(this.o);
        this.o = null;
    }

    public final void e() {
        feer.a(this.c.getContentResolver());
        feer.b(this.c.getContentResolver());
    }

    public final boolean f() {
        return hzxc.c() && Settings.System.getInt(this.c.getContentResolver(), "setup_wizard_has_run", 0) == 1;
    }
}

