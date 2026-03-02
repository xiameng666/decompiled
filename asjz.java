import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;

final class asjz extends ibsl implements ibtw {
    int a;
    final BackupSettingsDeviceDataFragment b;

    public asjz(BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0, ibrl ibrl0) {
        this.b = backupSettingsDeviceDataFragment0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asjz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new asjz(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icnj icnj0 = this.b.N().i;
            asjy asjy0 = new asjy(this.b);
            this.a = 1;
            if(icnj0.oR(asjy0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

