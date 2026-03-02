import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

public final class ezgx implements lqj {
    public final ezhe a;

    public ezgx(ezhe ezhe0) {
        this.a = ezhe0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ezhe ezhe0 = this.a;
        if(!((ezhf)object0).a) {
            ezhc ezhc0 = new ezhc(ezhe0);
            PreferenceScreen preferenceScreen0 = (PreferenceScreen)ezhe0.iO("auth_trust_agent_trusted_bluetooth_choose_list_key");
            gftb.check(preferenceScreen0);
            preferenceScreen0.ah();
            for(Object object1: ((ezhf)object0).b) {
                preferenceScreen0.am(((Preference)ezhc0.apply(object1)));
            }
            preferenceScreen0.am(ezhe0.d);
            return;
        }
        String s = ezhe0.getString(0x7F150349);  // string:auth_trust_agent_trusted_devices_add_device_bluetooth_disable_summary "Bluetooth 
                                                 // is turned off"
        ((PreferenceScreen)ezhe0.iO("auth_trust_agent_trusted_bluetooth_choose_list_key")).ah();
        new Preference(ezhe0.getContext()).S(s);
    }
}

