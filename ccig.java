import android.security.advancedprotection.AdvancedProtectionManager;

public final class ccig implements ibts {
    public final boolean a;

    public ccig(boolean z) {
        this.a = z;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        AdvancedProtectionManager advancedProtectionManager0 = (AdvancedProtectionManager)object0;
        ibuq.f(advancedProtectionManager0, "it");
        advancedProtectionManager0.setAdvancedProtectionEnabled(this.a);
        return ibom.a;
    }
}

