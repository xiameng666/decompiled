import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import com.android.settingslib.widget.FooterPreference;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.model.TrustableDevice;
import j..util.Optional;

public final class ezhe extends ezbr implements ohj {
    public static final int ag;
    private static final bboh ah;
    private ezho ai;
    public FooterPreference d;

    static {
        ezhe.ah = bboh.b("TrustAgent", bbcu.aR);
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.B(0x7F190115);  // xml:trusted_bluetooth_selection_preferences
        this.d = (FooterPreference)this.iO("auth_trust_agent_trusted_bluetooth_footer_pref_key");
        Intent intent0 = new Intent("android.settings.BLUETOOTH_SETTINGS");
        ComponentName componentName0 = intent0.resolveActivity(AppContextProvider.a().getPackageManager());
        if(componentName0 != null) {
            intent0.setComponent(componentName0);
            this.d.l(new ezhd(this, intent0));
            this.d.ah(this.getString(0x7F15032D));  // string:auth_trust_agent_link_to_pair_devices "Pair new device"
        }
    }

    @Override  // ohv
    public final boolean I(Preference preference0) {
        TrustableDevice trustableDevice0 = (TrustableDevice)TrustableDevice.c(preference0.r(), "trustable_device").orElseThrow();
        xob xob0 = (xob)this.getContext();
        if(xob0 == null) {
            ((ggtj)ezhe.ah.j()).x("Null activity in BluetoothDeviceSelectionFragment");
            return false;
        }
        Intent intent0 = new Intent((!bbqa.c() || !trustableDevice0.b ? "com.google.android.gms.auth.trustagent.ADD_DEVICE" : "com.google.android.gms.auth.trustagent.DEVICE_ENROLLED_IN_ACTIVE_UNLOCK")).putExtra("extra_request_code", 1002);
        intent0.putExtra("trustable_device", trustableDevice0);
        xob0.setResult(-1, intent0);
        xob0.finish();
        return false;
    }

    @Override  // ohj
    public final boolean c(Preference preference0) {
        return false;
    }

    @Override  // skp
    public final void onViewCreated(View view0, Bundle bundle0) {
        super.onViewCreated(view0, bundle0);
        ezho ezho0 = (ezho)new lso(((xob)this.requireContext())).a(ezho.class);
        this.ai = ezho0;
        ezho0.d = (ggfp)Optional.ofNullable(((xob)this.getContext())).map(new ezgy()).map(new ezgz()).map(new ezha()).orElseGet(new ezhb());
        ezho0.a();
        ezho ezho1 = this.ai;
        ezho1.a();
        lps lps0 = this.getViewLifecycleOwner();
        ezgx ezgx0 = new ezgx(this);
        ezho1.c.g(lps0, ezgx0);
    }
}

