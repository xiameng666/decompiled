import android.app.admin.DevicePolicyManager;

public final class cbgb implements ibth {
    public final cbgc a;

    public cbgb(cbgc cbgc0) {
        this.a = cbgc0;
    }

    @Override  // ibth
    public final Object a() {
        Object object0 = this.a.a.getSystemService("device_policy");
        ibuq.d(object0, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
        return (DevicePolicyManager)object0;
    }
}

