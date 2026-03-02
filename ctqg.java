import com.google.android.gms.multidevice.sync.devicelink.debug.ui.DeviceLinkDebugChimeraActivity;

public final class ctqg implements ibth {
    public final DeviceLinkDebugChimeraActivity a;

    public ctqg(DeviceLinkDebugChimeraActivity deviceLinkDebugChimeraActivity0) {
        this.a = deviceLinkDebugChimeraActivity0;
    }

    @Override  // ibth
    public final Object a() {
        DeviceLinkDebugChimeraActivity deviceLinkDebugChimeraActivity0 = this.a;
        icbr icbr0 = deviceLinkDebugChimeraActivity0.k;
        if(icbr0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        icbr0.V(cubf.a(((ProtoLiteMessage)ctzs.a).v_newBuilder()).a());
        deviceLinkDebugChimeraActivity0.h.b(Boolean.valueOf(false));
        return ibom.a;
    }
}

