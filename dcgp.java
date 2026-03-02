import com.google.android.gms.nearby.sharing.ModuleInitializer;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.util.concurrent.Callable;

public final class dcgp implements Callable {
    public final NearbySharingChimeraService a;

    public dcgp(NearbySharingChimeraService nearbySharingChimeraService0) {
        this.a = nearbySharingChimeraService0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a;
        if(!ModuleInitializer.a(nearbySharingChimeraService0)) {
            dcvz.a.a().p("Cannot opt in for remote copy, because Nearby Share is not available.", new Object[0]);
            return (int)35501;
        }
        if(nearbySharingChimeraService0.aN()) {
            return (int)35500;
        }
        ((dfsk)nearbySharingChimeraService0.d.get()).p();
        nearbySharingChimeraService0.N();
        dcpu dcpu0 = new dcpu();
        dcpu0.b = 1;
        dcpu0.a = 5;
        nearbySharingChimeraService0.Q(new dcpv(dcpu0));
        dcvz.a.b().p("NearbySharing was opted in by remote copy", new Object[0]);
        return (int)0;
    }
}

