import com.google.android.gms.multidevice.sync.devicelink.debug.ui.DeviceLinkDebugChimeraActivity;
import java.util.Set;

final class ctqr implements icih {
    final DeviceLinkDebugChimeraActivity a;

    public ctqr(DeviceLinkDebugChimeraActivity deviceLinkDebugChimeraActivity0) {
        this.a = deviceLinkDebugChimeraActivity0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if((((ctpc)object0) instanceof ctoy)) {
            ((ctoy)(((ctpc)object0))).a.f();
            DeviceLinkDebugChimeraActivity deviceLinkDebugChimeraActivity0 = this.a;
            do {
                Object object1 = deviceLinkDebugChimeraActivity0.l.b();
                Set set0 = ibqg.h(((Set)object1), ((ctoy)(((ctpc)object0))).a);
            }
            while(!deviceLinkDebugChimeraActivity0.l.h(object1, set0));
            return ibom.a;
        }
        if((((ctpc)object0) instanceof ctoz)) {
            DeviceLinkDebugChimeraActivity deviceLinkDebugChimeraActivity1 = this.a;
            do {
                Object object2 = deviceLinkDebugChimeraActivity1.l.b();
                Set set1 = ibqg.f(((Set)object2), ((ctoz)(((ctpc)object0))).a);
            }
            while(!deviceLinkDebugChimeraActivity1.l.h(object2, set1));
        }
        return ibom.a;
    }
}

