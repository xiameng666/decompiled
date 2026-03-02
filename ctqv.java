import com.google.android.gms.multidevice.sync.devicelink.debug.ui.DeviceLinkDebugChimeraActivity;

final class ctqv extends ibsl implements ibtw {
    int a;
    final DeviceLinkDebugChimeraActivity b;

    public ctqv(DeviceLinkDebugChimeraActivity deviceLinkDebugChimeraActivity0, ibrl ibrl0) {
        this.b = deviceLinkDebugChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctqv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctqv(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ykm ykm0 = this.b.a();
            this.a = 1;
            if(ykm0.b(this.b.m, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

