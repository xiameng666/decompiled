import com.google.android.gms.multidevice.sync.devicelink.debug.ui.DeviceLinkDebugChimeraActivity;

final class ctqm extends ibsl implements ibtw {
    Object a;
    int b;
    final DeviceLinkDebugChimeraActivity c;
    final ykf d;
    final gra e;
    final gra f;

    public ctqm(DeviceLinkDebugChimeraActivity deviceLinkDebugChimeraActivity0, ykf ykf0, gra gra0, gra gra1, ibrl ibrl0) {
        this.c = deviceLinkDebugChimeraActivity0;
        this.d = ykf0;
        this.e = gra0;
        this.f = gra1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctqm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctqm(this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            ((gra)object2).b(((String)object0));
            DeviceLinkDebugChimeraActivity.f(this.e, false);
            return ibom.a;
        }
        ibnx.b(object0);
        DeviceLinkDebugChimeraActivity.f(this.e, true);
        gra gra0 = this.f;
        this.a = gra0;
        this.b = 1;
        Object object3 = this.c.c(this.d, this);
        if(object3 != object1) {
            object2 = gra0;
            object0 = object3;
            ((gra)object2).b(((String)object0));
            DeviceLinkDebugChimeraActivity.f(this.e, false);
            return ibom.a;
        }
        return object1;
    }
}

