import com.google.android.gms.trustagent.activeunlock.primary.ui.screenlock.AssociatedDeviceScreenLockSetUpFragment;

final class eywn extends ibsl implements ibtw {
    int a;
    final AssociatedDeviceScreenLockSetUpFragment b;
    private Object c;

    public eywn(AssociatedDeviceScreenLockSetUpFragment associatedDeviceScreenLockSetUpFragment0, ibrl ibrl0) {
        this.b = associatedDeviceScreenLockSetUpFragment0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eywn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new eywn(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icck icck0 = (icck)this.c;
            AssociatedDeviceScreenLockSetUpFragment associatedDeviceScreenLockSetUpFragment0 = this.b;
            lpg lpg0 = associatedDeviceScreenLockSetUpFragment0.getLifecycle();
            lpf lpf0 = lpf.d;
            icew icew0 = icrd.a.i();
            boolean z = icew0.es(this.u());
            if(!z) {
                lpf lpf1 = ((lpw)lpg0).b;
                if(lpf1 == lpf.a) {
                    throw new lpm();
                }
                if(lpf1.compareTo(lpf0) >= 0) {
                    icbb.b(icck0, null, null, new eywl(associatedDeviceScreenLockSetUpFragment0, null), 3);
                    return ibom.a;
                }
            }
            eywm eywm0 = new eywm(icck0, associatedDeviceScreenLockSetUpFragment0);
            this.a = 1;
            if(lsx.a(lpg0, lpf0, z, icew0, eywm0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

