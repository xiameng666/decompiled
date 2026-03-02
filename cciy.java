import com.google.android.gms.libs.advancedprotection.AdvancedProtectionSwitchPreference;

public final class cciy implements ccik {
    final AdvancedProtectionSwitchPreference a;

    public cciy(AdvancedProtectionSwitchPreference advancedProtectionSwitchPreference0) {
        this.a = advancedProtectionSwitchPreference0;
        super();
    }

    @Override  // ccik
    public final void a(boolean z) {
        AdvancedProtectionSwitchPreference advancedProtectionSwitchPreference0 = this.a;
        if(advancedProtectionSwitchPreference0.al()) {
            advancedProtectionSwitchPreference0.H(false);
            advancedProtectionSwitchPreference0.N(false);
        }
        else {
            advancedProtectionSwitchPreference0.H(advancedProtectionSwitchPreference0.c);
            advancedProtectionSwitchPreference0.N(advancedProtectionSwitchPreference0.d);
        }
        advancedProtectionSwitchPreference0.d();
    }
}

