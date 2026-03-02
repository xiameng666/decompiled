import android.security.advancedprotection.AdvancedProtectionManager.Callback;
import android.security.advancedprotection.AdvancedProtectionManager;
import java.util.HashMap;

public final class ccij implements ibts {
    public final ccim a;
    public final ccik b;

    public ccij(ccim ccim0, ccik ccik0) {
        this.a = ccim0;
        this.b = ccik0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((AdvancedProtectionManager)object0), "it");
        HashMap hashMap0 = this.a.b;
        synchronized(hashMap0) {
            AdvancedProtectionManager.Callback advancedProtectionManager$Callback0 = an..ExternalSyntheticApiModelOutline0.m(hashMap0.remove(this.b));
            if(advancedProtectionManager$Callback0 == null) {
                return ibom.a;
            }
            ((AdvancedProtectionManager)object0).unregisterAdvancedProtectionCallback(advancedProtectionManager$Callback0);
        }
        return ibom.a;
    }
}

