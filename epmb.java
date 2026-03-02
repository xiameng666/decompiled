import android.content.ComponentName;
import android.content.Intent;
import androidx.preference.Preference;

public final class epmb implements ohj {
    public final epmi a;

    public epmb(epmi epmi0) {
        this.a = epmi0;
    }

    @Override  // ohj
    public final boolean c(Preference preference0) {
        Intent intent0 = new Intent().setComponent(new ComponentName(this.a.requireContext(), "com.google.android.gms.significantplaces.settings.TrustedPlacesSettingsActivity")).addFlags(0x40000000).addFlags(0x800000);
        ibuq.e(intent0, "addFlags(...)");
        epil.a();
        this.a.startActivity(intent0);
        return true;
    }
}

