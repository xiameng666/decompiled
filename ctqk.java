import com.google.android.gms.multidevice.sync.devicelink.debug.ui.DeviceLinkDebugChimeraActivity;

final class ctqk extends ibsl implements ibtw {
    int a;
    final DeviceLinkDebugChimeraActivity b;

    public ctqk(DeviceLinkDebugChimeraActivity deviceLinkDebugChimeraActivity0, ibrl ibrl0) {
        this.b = deviceLinkDebugChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctqk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctqk(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctzs ctzs0 = cubf.a(((ProtoLiteMessage)ctzs.a).v_newBuilder()).a();
            this.a = 1;
            if(this.b.j.a(ctzs0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

