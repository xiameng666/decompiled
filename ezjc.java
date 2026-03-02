import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.google.android.gms.trustagent.trustlet.device.ui.TrustedDevicesFragment.DisabledViewPreference;
import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice;

public final class ezjc implements lqj {
    public final ezjf a;

    public ezjc(ezjf ezjf0) {
        this.a = ezjf0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ezjf ezjf0 = this.a;
        if(ezjf0.d == null) {
            return;
        }
        PreferenceCategory preferenceCategory0 = ezjf0.ag;
        if(preferenceCategory0 != null) {
            preferenceCategory0.ah();
        }
        ezjf0.d.ah();
        for(Object object1: ((ezjg)object0).a) {
            TrustedUiDevice trustedUiDevice0 = (TrustedUiDevice)object1;
            String s = trustedUiDevice0.d();
            PreferenceCategory preferenceCategory1 = ezjf0.ag;
            if(preferenceCategory1 == null) {
                preferenceCategory1 = ezjf0.d;
            }
            gftb.check(preferenceCategory1);
            if(preferenceCategory1.l(s) == null) {
                String s1 = trustedUiDevice0.d();
                TrustedDevicesFragment.DisabledViewPreference trustedDevicesFragment$DisabledViewPreference0 = new TrustedDevicesFragment.DisabledViewPreference(ezjf0.requireContext());
                trustedDevicesFragment$DisabledViewPreference0.L(s1);
                trustedDevicesFragment$DisabledViewPreference0.w = false;
                trustedDevicesFragment$DisabledViewPreference0.S(trustedUiDevice0.c);
                trustedDevicesFragment$DisabledViewPreference0.r().putParcelable("trusted_device", trustedUiDevice0);
                int v = trustedUiDevice0.d;
                boolean z = true;
                switch(v) {
                    case 1: {
                        trustedDevicesFragment$DisabledViewPreference0.P(0x7F15080F);  // string:common_connected "Connected"
                        break;
                    }
                    case 2: {
                        trustedDevicesFragment$DisabledViewPreference0.P(0x7F15031C);  // string:auth_trust_agent_bt_device_status_action_required "Action required"
                        break;
                    }
                    case 3: {
                        trustedDevicesFragment$DisabledViewPreference0.P(0x7F15034A);  // string:auth_trust_agent_trusted_devices_bluetooth_turn_off_summary "Bluetooth is 
                                                                                       // turned off."
                    }
                }
                if(v == 4) {
                    z = false;
                }
                trustedDevicesFragment$DisabledViewPreference0.a = z;
                trustedDevicesFragment$DisabledViewPreference0.K(false);
                gftb.check(preferenceCategory1);
                preferenceCategory1.am(trustedDevicesFragment$DisabledViewPreference0);
                ezjf0.N();
            }
        }
        ezjf0.d.am(ezjf0.ak);
        if(bbqa.a()) {
            PreferenceScreen preferenceScreen0 = ezjf0.d;
            PreferenceCategory preferenceCategory2 = ezjf0.ag;
            gftb.check(preferenceCategory2);
            preferenceScreen0.am(preferenceCategory2);
        }
        Preference preference0 = new Preference(ezjf0.getContext());
        preference0.C = 0x7F0E07F9;  // layout:preference_material
        preference0.L("auth_trust_agent_pref_trusted_devices_add_trusted_device_key");
        preference0.S(ezjf0.getString(0x7F150332));  // string:auth_trust_agent_pref_trusted_devices_add_trusted_device_title "Add trusted 
                                                     // device"
        preference0.J(ezjf0.getContext().getDrawable(0x7F080AE5));  // drawable:quantum_gm_ic_add_vd_theme_24
        preference0.w = false;
        if(bbqa.a()) {
            ezjf0.ag.am(preference0);
        }
        else {
            ezjf0.d.am(preference0);
        }
        ezjf0.d.am(ezjf0.ai);
        ezjf0.N();
    }
}

