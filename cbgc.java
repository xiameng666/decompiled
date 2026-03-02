import android.app.admin.DevicePolicyManager;
import android.app.supervision.SupervisionManager;
import android.content.ComponentName;
import android.content.Context;

public final class cbgc implements cbga {
    public final Context a;
    public final cbge b;
    private static final ComponentName c;
    private final ibnn d;

    static {
        cbgc.c = new ComponentName("com.google.android.gms", "com.google.android.gms.kids.account.receiver.ProfileOwnerReceiver");
    }

    public cbgc(Context context0, cbge cbge0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
        this.b = cbge0;
        this.d = new ibnz(new cbgb(this));
    }

    @Override  // cbga
    public final String a() {
        if(this.g()) {
            return "com.google.android.gms";
        }
        return this.f() || bbqa.a() && this.b.a().contains("com.google.android.gms.supervision") ? "com.google.android.gms.supervision" : null;
    }

    @Override  // cbga
    public final boolean b() {
        if(!this.g() && !this.f()) {
            if(cbgq.a() && e.a()) {
                Object object0 = this.a.getSystemService("supervision");
                ibuq.d(object0, "null cannot be cast to non-null type android.app.supervision.SupervisionManager");
                return ((SupervisionManager)object0).isSupervisionEnabled();
            }
            return false;
        }
        return true;
    }

    @Override  // cbga
    public final boolean c() {
        return this.a() != null;
    }

    private final DevicePolicyManager d() {
        return (DevicePolicyManager)this.d.a();
    }

    private final boolean e(String s) {
        if(s.equals("com.google.android.gms")) {
            return this.d().isAdminActive(cbgc.c) ? this.d().isProfileOwnerApp(s) : false;
        }
        return this.d().isProfileOwnerApp(s);
    }

    private final boolean f() {
        return this.e("com.google.android.gms.supervision");
    }

    private final boolean g() {
        return this.e("com.google.android.gms");
    }
}

