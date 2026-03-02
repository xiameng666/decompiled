import com.google.android.gms.chromesync.zeroparty.DeviceAuthorizationKey;
import java.util.List;

public final class afvv implements bxto {
    @Override  // bxto
    public final Object a(Object object0) {
        if(((List)object0).isEmpty()) {
            throw bxma.f(0xC40F, "No DeviceAuthorizationKeys available.");
        }
        ggdy ggdy0 = new ggdy();
        for(Object object1: ((List)object0)) {
            ggdy0.i(afnx.a(((DeviceAuthorizationKey)object1)));
        }
        return ggdy0.h();
    }
}

