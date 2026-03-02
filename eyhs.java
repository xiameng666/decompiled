import com.google.android.gms.trustagent.activeunlock.primary.settings.ActiveUnlockSettingsTileChimeraContentProvider;

public final class eyhs extends ibsl implements ibtw {
    int a;
    final ActiveUnlockSettingsTileChimeraContentProvider b;

    public eyhs(ActiveUnlockSettingsTileChimeraContentProvider activeUnlockSettingsTileChimeraContentProvider0, ibrl ibrl0) {
        this.b = activeUnlockSettingsTileChimeraContentProvider0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyhs)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyhs(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ActiveUnlockSettingsTileChimeraContentProvider activeUnlockSettingsTileChimeraContentProvider0 = this.b;
            exyg exyg0 = activeUnlockSettingsTileChimeraContentProvider0.b;
            if(exyg0 == null) {
                ibuq.j("enrolledDeviceRepository");
                exyg0 = null;
            }
            icig icig0 = exyg0.p();
            eyhr eyhr0 = new eyhr(activeUnlockSettingsTileChimeraContentProvider0);
            this.a = 1;
            if(icig0.oR(eyhr0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

