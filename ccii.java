import android.security.advancedprotection.AdvancedProtectionManager.Callback;

public final class ccii implements AdvancedProtectionManager.Callback {
    public final ccik a;

    public ccii(ccik ccik0) {
        this.a = ccik0;
    }

    public final void onAdvancedProtectionChanged(boolean z) {
        this.a.a(z);
    }
}

