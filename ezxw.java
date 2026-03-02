import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.update.control.ActiveStateTrackingBroadcastReceiver;
import com.google.android.gms.update.control.ChimeraGcmTaskService;
import com.google.android.gms.update.control.NetworkControl.2;

public final class ezxw {
    public static final baun a;
    public static final fagf b;
    public static final fage c;
    public final Context d;
    public final fagt e;
    private final ActiveStateTrackingBroadcastReceiver f;

    static {
        ezxw.a = fabk.d("NetworkControl");
        ezxw.b = new fagf("control.network.passive_wifi_reconnection_monitoring_enabled", Boolean.valueOf(false));
        ezxw.c = new ezxv();
    }

    public ezxw(Context context0) {
        this.d = context0;
        this.e = (fagt)fagt.a.b();
        this.f = new NetworkControl.2(this);
    }

    public final void a() {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        this.f.c(this.d, intentFilter0);
    }

    public final void b() {
        this.e.e(new fagh[]{new fagh(ezxw.b, Boolean.valueOf(true))});
        ChimeraGcmTaskService.h(this.d);
    }

    public final void c() {
        this.f.d(this.d);
    }

    public final void d() {
        this.e.c(new fagn[]{ezxw.b});
        cljp.a(this.d).d("WifiConnected", "com.google.android.gms.update.SystemUpdateGcmTaskService");
    }
}

