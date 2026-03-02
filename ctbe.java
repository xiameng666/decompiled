import com.google.android.gms.multidevice.featuresettings.multidevicesync.MultideviceSyncLandingFragment;

final class ctbe extends ibsl implements ibtw {
    int a;
    final MultideviceSyncLandingFragment b;
    final int c;
    final Object d;

    public ctbe(MultideviceSyncLandingFragment multideviceSyncLandingFragment0, int v, Object object0, ibrl ibrl0) {
        this.b = multideviceSyncLandingFragment0;
        this.c = v;
        this.d = object0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctbe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctbe(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            csxk csxk0 = this.b.M();
            ibuq.d(this.d, "null cannot be cast to non-null type kotlin.Boolean");
            this.a = 1;
            if(csxk0.e(this.c, ((Boolean)this.d).booleanValue(), this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

