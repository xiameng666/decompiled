import com.google.android.gms.multidevice.sync.devicelink.debug.ui.DeviceLinkDebugChimeraActivity;

public final class ctqp extends ibsl implements ibtx {
    final DeviceLinkDebugChimeraActivity a;

    public ctqp(DeviceLinkDebugChimeraActivity deviceLinkDebugChimeraActivity0, ibrl ibrl0) {
        this.a = deviceLinkDebugChimeraActivity0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        Throwable throwable0 = (Throwable)object1;
        return new ctqp(this.a, ((ibrl)object2)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.i.b(Boolean.valueOf(false));
        return ibom.a;
    }
}

