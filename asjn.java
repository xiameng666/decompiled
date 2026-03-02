import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;

public final class asjn implements ibth {
    public final BackupSettingsDeviceDataFragment a;

    public asjn(BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0) {
        this.a = backupSettingsDeviceDataFragment0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.Q().a(0x406FE, new aspo());
        askr askr0 = this.a.N();
        grjo grjo0 = BackupSettingsDeviceDataFragment.X(true);
        ibuq.f(grjo0, "androidBackupSettingsFragmentTextDetails");
        asdv asdv0 = (asdv)((aqqh)askr0.i.b()).b();
        if(!(asdv0 instanceof asdu)) {
            ((ggtj)askr.a.i()).x("Tried to disable device data backup without an account.");
            return ibom.a;
        }
        askp askp0 = new askp(askr0, asdv0, grjo0, null);
        icbb.b(askr0.f, null, null, askp0, 3);
        return ibom.a;
    }
}

