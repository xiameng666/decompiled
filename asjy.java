import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;
import com.google.android.gms.backup.settings.devicedata.profilepreference.ProfilePreference;

final class asjy implements icih {
    final BackupSettingsDeviceDataFragment a;

    public asjy(BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0) {
        this.a = backupSettingsDeviceDataFragment0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        asdv asdv0 = (asdv)((aqqh)object0).b();
        BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0 = this.a;
        ProfilePreference profilePreference0 = (ProfilePreference)backupSettingsDeviceDataFragment0.S().a;
        profilePreference0.a = asdv0;
        if(asdv0 != null) {
            if((asdv0 instanceof asdt)) {
                profilePreference0.S(null);
                profilePreference0.P(0x7F1507D5);  // string:common_add_account "Add account"
                profilePreference0.I(0x7F0805F5);  // drawable:gs_person_add_vd_theme_24
            }
            else {
                if(!(asdv0 instanceof asdu)) {
                    throw new ibnq();
                }
                profilePreference0.S(((asdu)asdv0).b.b);
                profilePreference0.n(((asdu)asdv0).b.c);
                profilePreference0.J(null);
                backupSettingsDeviceDataFragment0.S().e(new asjx(backupSettingsDeviceDataFragment0, asdv0));
                return ibom.a;
            }
        }
        backupSettingsDeviceDataFragment0.S().e(new asjx(backupSettingsDeviceDataFragment0, asdv0));
        return ibom.a;
    }
}

