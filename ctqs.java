import com.google.android.gms.multidevice.sync.devicelink.debug.ui.DeviceLinkDebugChimeraActivity;

public final class ctqs extends ibsl implements ibtw {
    int a;
    final DeviceLinkDebugChimeraActivity b;

    public ctqs(DeviceLinkDebugChimeraActivity deviceLinkDebugChimeraActivity0, ibrl ibrl0) {
        this.b = deviceLinkDebugChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctqs)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctqs(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = this.b.b().b();
            ctqr ctqr0 = new ctqr(this.b);
            this.a = 1;
            if(icig0.oR(ctqr0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

