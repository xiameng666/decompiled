import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;

public final class askd extends ibsl implements ibtw {
    final BackupSettingsDeviceDataFragment a;
    private Object b;

    public askd(BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0, ibrl ibrl0) {
        this.a = backupSettingsDeviceDataFragment0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((askd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new askd(this.a, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        icck icck0 = (icck)this.b;
        icbb.b(icck0, null, null, new asjw(this.a, null), 3);
        icbb.b(icck0, null, null, new asjz(this.a, null), 3);
        icbb.b(icck0, null, null, new askc(this.a, null), 3);
        return ibom.a;
    }
}

