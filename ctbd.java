import com.google.android.gms.multidevice.featuresettings.multidevicesync.MultideviceSyncLandingFragment;

final class ctbd extends ibsl implements ibtw {
    int a;
    final MultideviceSyncLandingFragment b;

    public ctbd(MultideviceSyncLandingFragment multideviceSyncLandingFragment0, ibrl ibrl0) {
        this.b = multideviceSyncLandingFragment0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctbd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctbd(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.N(this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

