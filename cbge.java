import android.app.role.RoleManager;
import android.content.Context;
import java.util.List;

public final class cbge {
    private final Context a;

    public cbge(Context context0, ibrt ibrt0) {
        ibuq.f(context0, "context");
        ibuq.f(ibrt0, "blockingContext");
        super();
        this.a = context0;
    }

    public final List a() {
        if(bbqa.a()) {
            try {
                Object object0 = this.a.getSystemService("role");
                RoleManager roleManager0 = (object0 instanceof RoleManager) ? ((RoleManager)object0) : null;
                if(roleManager0 != null) {
                    List list0 = roleManager0.getRoleHolders("android.app.role.SUPERVISION");
                    if(list0 != null) {
                        return list0;
                    }
                }
            }
            catch(SecurityException unused_ex) {
            }
            return ibps.a;
        }
        return ibps.a;
    }
}

