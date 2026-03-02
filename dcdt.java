import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.RejectParams;

public final class dcdt implements Runnable {
    public final dchp a;
    public final RejectParams b;

    public dcdt(dchp dchp0, RejectParams rejectParams0) {
        this.a = dchp0;
        this.b = rejectParams0;
    }

    @Override
    public final void run() {
        RejectParams rejectParams0 = this.b;
        dchp dchp0 = this.a;
        ShareTarget shareTarget0 = dchp0.e.c.a(rejectParams0.a.a);
        if(shareTarget0 == null) {
            dcvz.a.e().p("Failed to find ShareTarget in ProviderManager", new Object[0]);
            azxs azxs0 = rejectParams0.b;
            dcey dcey0 = new dcey();
            NearbySharingChimeraService.ac(dchp0.a, "reject", azxs0, dcey0);
            return;
        }
        azxs azxs1 = rejectParams0.b;
        dcez dcez0 = new dcez(dchp0, shareTarget0);
        NearbySharingChimeraService.ac(dchp0.a, "reject", azxs1, dcez0);
    }
}

