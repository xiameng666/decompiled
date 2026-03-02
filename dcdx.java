import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetAllowPermissionAutoParams;
import java.util.concurrent.Callable;

public final class dcdx implements Callable {
    public final dchp a;
    public final SetAllowPermissionAutoParams b;

    public dcdx(dchp dchp0, SetAllowPermissionAutoParams setAllowPermissionAutoParams0) {
        this.a = dchp0;
        this.b = setAllowPermissionAutoParams0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        boolean z = this.b.a;
        if(((dfsk)nearbySharingChimeraService0.d.get()).P(nearbySharingChimeraService0.v()) == z) {
            return (int)35500;
        }
        if(!z) {
            nearbySharingChimeraService0.M();
        }
        ((dfsk)nearbySharingChimeraService0.d.get()).u(nearbySharingChimeraService0.v(), z);
        boolean z1 = true;
        boolean z2 = nearbySharingChimeraService0.aH() && !hvqz.q();
        if(!nearbySharingChimeraService0.aG() && !nearbySharingChimeraService0.aF()) {
            z1 = false;
        }
        if(z && (z2 || z1)) {
            nearbySharingChimeraService0.aA();
        }
        if(hvrc.a.b().g()) {
            nearbySharingChimeraService0.N();
        }
        return (int)0;
    }
}

