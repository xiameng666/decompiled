import com.google.android.gms.multidevice.featuresettings.callswitching.CallSwitchingLandingFragment;

final class ctag extends ibsl implements ibtw {
    int a;
    final CallSwitchingLandingFragment b;
    final Object c;

    public ctag(CallSwitchingLandingFragment callSwitchingLandingFragment0, Object object0, ibrl ibrl0) {
        this.b = callSwitchingLandingFragment0;
        this.c = object0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctag)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctag(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            csxk csxk0 = this.b.K();
            ibuq.d(this.c, "null cannot be cast to non-null type kotlin.Boolean");
            this.a = 1;
            if(csxk0.e(0, ((Boolean)this.c).booleanValue(), this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

