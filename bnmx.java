import android.content.Context;
import android.nearby.NearbyManager;
import android.os.SystemProperties;
import j..util.Collection.-EL;
import java.util.List;

final class bnmx implements bnni {
    private final NearbyManager a;

    public bnmx(Context context0) {
        this.a = (NearbyManager)context0.getSystemService("nearby");
    }

    @Override  // bnni
    public final void a(List list0) {
        NearbyManager nearbyManager0 = this.a;
        if(nearbyManager0 == null) {
            return;
        }
        nearbyManager0.setPoweredOffFindingEphemeralIds(((List)Collection.-EL.stream(list0).map(new bnmw()).collect(ggaf.a)));
    }

    @Override  // bnni
    public final void b(Boolean boolean0) {
        int v = 1;
        NearbyManager nearbyManager0 = this.a;
        if(nearbyManager0 == null) {
            return;
        }
        if(boolean0.booleanValue()) {
            v = 2;
        }
        nearbyManager0.setPoweredOffFindingMode(v);
    }

    @Override  // bnni
    public final boolean c() {
        if(hsww.a.b().g()) {
            try {
                if(this.a != null && this.a.getPoweredOffFindingMode() != 0) {
                    return true;
                }
            }
            catch(NoSuchMethodError unused_ex) {
            }
            return false;
        }
        return hsww.i() && hsww.j() && Boolean.parseBoolean(SystemProperties.get("ro.bluetooth.finder.supported"));
    }
}

