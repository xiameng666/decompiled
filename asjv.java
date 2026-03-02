import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;

final class asjv implements icih {
    final BackupSettingsDeviceDataFragment a;

    public asjv(BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0) {
        this.a = backupSettingsDeviceDataFragment0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        boolean z = (((aqqh)object0) instanceof aqqf) && ibuq.m(((asmv)((aqqf)(((aqqh)object0))).a).b, Boolean.valueOf(false));
        BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0 = this.a;
        backupSettingsDeviceDataFragment0.K().H(z);
        backupSettingsDeviceDataFragment0.S().c(z);
        backupSettingsDeviceDataFragment0.R().c(z);
        backupSettingsDeviceDataFragment0.V(((aqqh)object0));
        if(backupSettingsDeviceDataFragment0.d == null) {
            ibuq.j("deviceDataStateMapper");
        }
        String s = askv.a(backupSettingsDeviceDataFragment0.requireContext(), ((aqqh)object0)).b;
        if(backupSettingsDeviceDataFragment0.W()) {
            atdg.a(backupSettingsDeviceDataFragment0.requireContext(), backupSettingsDeviceDataFragment0.L(), 0x7F1504D1, s);  // string:backup_settings_devicedata_toggle_backup_device_data "Back up other device 
                                                                                                                               // data"
            return ibom.a;
        }
        backupSettingsDeviceDataFragment0.O().n(s);
        return ibom.a;
    }
}

