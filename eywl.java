import com.google.android.gms.trustagent.activeunlock.primary.ui.screenlock.AssociatedDeviceScreenLockSetUpFragment;

final class eywl extends ibsl implements ibtw {
    int a;
    final AssociatedDeviceScreenLockSetUpFragment b;

    public eywl(AssociatedDeviceScreenLockSetUpFragment associatedDeviceScreenLockSetUpFragment0, ibrl ibrl0) {
        this.b = associatedDeviceScreenLockSetUpFragment0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eywl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eywl(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            eywt eywt0 = this.b.B();
            this.a = 1;
            Object object2 = eywt0.m(eywt0.d, this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

