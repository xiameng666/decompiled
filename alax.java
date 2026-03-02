import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.auth.proximity.exo.EnterprisePolicy.1;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;

public final class alax {
    final TracingBroadcastReceiver a;
    public alaw b;
    private static final baun c;
    private final Context d;

    static {
        alax.c = new baun("ProximityAuth", new String[]{"ExoPolicy"});
    }

    public alax(Context context0) {
        this.a = new EnterprisePolicy.1(this);
        this.d = context0;
    }

    public final void a(alaw alaw0) {
        this.b();
        this.b = alaw0;
        IntentFilter intentFilter0 = new IntentFilter("android.app.action.DEVICE_POLICY_MANAGER_STATE_CHANGED");
        jwe.b(this.d, this.a, intentFilter0, 2);
    }

    public final void b() {
        if(this.b != null) {
            this.b = null;
            this.d.unregisterReceiver(this.a);
        }
    }

    public final boolean c() {
        int v;
        Context context0 = this.d;
        if(context0.checkSelfPermission("android.permission.READ_NEARBY_STREAMING_POLICY") == 0) {
            DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)context0.getSystemService(DevicePolicyManager.class);
            Object[] arr_object = {devicePolicyManager0.getNearbyAppStreamingPolicy()};
            alax.c.d("getAppStreamingPolicy policy: %d", arr_object);
            v = devicePolicyManager0.getNearbyAppStreamingPolicy();
        }
        else {
            alax.c.h("Skipping policy check due to lack of permission.", new Object[0]);
            v = 0;
        }
        if(hpzm.t()) {
            alax.c.h("Enterprise policy - getAppStreamingPolicy(): %s (1=disabled, 2=enabled)", new Object[]{v});
        }
        return v != 1;
    }
}

