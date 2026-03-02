import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.AcceptParams;

public final class dcdz implements Runnable {
    public final dchp a;
    public final AcceptParams b;

    public dcdz(dchp dchp0, AcceptParams acceptParams0) {
        this.a = dchp0;
        this.b = acceptParams0;
    }

    @Override
    public final void run() {
        AcceptParams acceptParams0 = this.b;
        dchp dchp0 = this.a;
        ShareTarget shareTarget0 = dchp0.e.c.a(acceptParams0.a.a);
        if(shareTarget0 == null) {
            dcvz.a.e().p("Failed to find ShareTarget in ProviderManager", new Object[0]);
            azxs azxs0 = acceptParams0.b;
            dcfc dcfc0 = new dcfc();
            NearbySharingChimeraService.ac(dchp0.a, "accept", azxs0, dcfc0);
            return;
        }
        azxs azxs1 = acceptParams0.b;
        dcfd dcfd0 = new dcfd(dchp0, shareTarget0);
        NearbySharingChimeraService.ac(dchp0.a, "accept", azxs1, dcfd0);
    }
}

