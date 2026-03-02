import android.content.Context;
import android.security.advancedprotection.AdvancedProtectionManager;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class ccim {
    public static ccim a;
    public final HashMap b;
    private static final bboh c;
    private final Context d;

    static {
        ccim.c = bboh.a("AdvancedProtectionMgrCp");
    }

    public ccim(Context context0) {
        this.d = context0;
        this.b = new HashMap();
    }

    public final void a(Executor executor0, ccik ccik0) {
        ibuq.f(executor0, "executor");
        ibuq.f(ccik0, "callbackCompat");
        this.e(new ccif(this, ccik0, executor0));
    }

    public final void b(boolean z) {
        this.e(new ccig(z));
    }

    public final void c(ccik ccik0) {
        ibuq.f(ccik0, "callbackCompat");
        this.e(new ccij(this, ccik0));
    }

    public final boolean d() {
        Boolean boolean0 = (Boolean)this.e(new ccih());
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    private final Object e(ibts ibts0) {
        if(!ccil.b()) {
            return null;
        }
        AdvancedProtectionManager advancedProtectionManager0 = an..ExternalSyntheticApiModelOutline0.m(this.d.getSystemService(AdvancedProtectionManager.class));
        if(advancedProtectionManager0 == null) {
            ((ggtj)ccim.c.j()).x("AdvancedProtectionManager is not available on this device/form factor");
            return null;
        }
        return ibts0.a(advancedProtectionManager0);
    }
}

