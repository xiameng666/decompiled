import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.update.control.ActiveStateTrackingBroadcastReceiver;
import com.google.android.gms.update.control.BatteryControl.2;
import com.google.android.gms.update.control.BatteryControl.3;
import com.google.android.gms.update.control.BatteryControl.4;
import com.google.android.gms.update.control.ChimeraGcmTaskService;

public final class ezxc {
    public static final baun a;
    public static final fagf b;
    public static final fage c;
    public final Context d;
    public final fagt e;
    private final ActiveStateTrackingBroadcastReceiver f;
    private final ActiveStateTrackingBroadcastReceiver g;
    private final ActiveStateTrackingBroadcastReceiver h;

    static {
        ezxc.a = fabk.d("BatteryControl");
        ezxc.b = new fagf("control.battery.passive_battery_charging_monitoring_enabled", Boolean.valueOf(false));
        ezxc.c = new ezxb();
    }

    public ezxc(Context context0) {
        this.d = context0;
        this.e = (fagt)fagt.a.b();
        this.f = new BatteryControl.2(this);
        this.h = new BatteryControl.3(this);
        this.g = new BatteryControl.4(this);
    }

    public final void a() {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter0.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        this.f.c(this.d, intentFilter0);
    }

    public final void b() {
        ezxc.a.j("Starting charging state monitoring.", new Object[0]);
        if(hvxt.a.b().b()) {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            this.h.c(this.d, intentFilter0);
            return;
        }
        this.e.e(new fagh[]{new fagh(ezxc.b, Boolean.valueOf(true))});
        ChimeraGcmTaskService.f(this.d);
    }

    public final void c() {
        ezxc.a.j("Starting battery saver mode state monitoring.", new Object[0]);
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        this.g.c(this.d, intentFilter0);
    }

    public final void d() {
        this.f.d(this.d);
    }

    public final void e() {
        ezxc.a.j("Stopping charging state monitoring.", new Object[0]);
        this.e.c(new fagn[]{ezxc.b});
        cljp.a(this.d).d("DeviceCharging", "com.google.android.gms.update.SystemUpdateGcmTaskService");
        this.h.d(this.d);
    }

    public final void f() {
        ezxc.a.j("Stopping battery saver mode state monitoring.", new Object[0]);
        this.g.d(this.d);
    }
}

