import com.google.android.gms.multidevice.sync.devicelink.debug.ui.DeviceLinkDebugChimeraActivity;

final class ctqo extends ibsl implements ibtw {
    int a;
    final DeviceLinkDebugChimeraActivity b;
    final ykf c;
    final gra d;
    final ibvd e;

    public ctqo(DeviceLinkDebugChimeraActivity deviceLinkDebugChimeraActivity0, ykf ykf0, gra gra0, ibvd ibvd0, ibrl ibrl0) {
        this.b = deviceLinkDebugChimeraActivity0;
        this.c = ykf0;
        this.d = gra0;
        this.e = ibvd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctqo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctqo(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            DeviceLinkDebugChimeraActivity.i(this.d, true);
            this.c.f();
            ctzx ctzx0 = new ctzx(this.c);
            ctzr ctzr0 = cubd.a(((ProtoLiteMessage)ctzr.a).v_newBuilder()).a();
            ibuq.f(ctzr0, "request");
            byte[] arr_b = ctzr0.toBytesArray();
            ctzw ctzw0 = new ctzw(ctzx0.a.h("DeviceLinkDebugService", "StreamPings", arr_b));
            ctqn ctqn0 = new ctqn(this.e);
            this.a = 1;
            if(ctzw0.oR(ctqn0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

