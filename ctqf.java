import com.google.android.gms.multidevice.sync.devicelink.debug.ui.DeviceLinkDebugChimeraActivity;

public final class ctqf implements ibth {
    public final DeviceLinkDebugChimeraActivity a;

    public ctqf(DeviceLinkDebugChimeraActivity deviceLinkDebugChimeraActivity0) {
        this.a = deviceLinkDebugChimeraActivity0;
    }

    @Override  // ibth
    public final Object a() {
        ykm ykm0 = this.a.a();
        ctxy ctxy0 = this.a.m;
        ykm0.c(ctxy0);
        ibuq.f(this.a.e, "observer");
        synchronized(ctxy0) {
            if(ibuq.m(ctxy0.a, this.a.e)) {
                ctxy0.a = null;
            }
        }
        return ibom.a;
    }
}

