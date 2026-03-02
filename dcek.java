import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.CancelParams;

public final class dcek implements Runnable {
    public final dchp a;
    public final CancelParams b;

    public dcek(dchp dchp0, CancelParams cancelParams0) {
        this.a = dchp0;
        this.b = cancelParams0;
    }

    @Override
    public final void run() {
        CancelParams cancelParams0 = this.b;
        dchp dchp0 = this.a;
        ShareTarget shareTarget0 = dchp0.e.c.a(cancelParams0.a.a);
        if(shareTarget0 == null) {
            dcvz.a.e().p("Failed to find ShareTarget in ProviderManager", new Object[0]);
            azxs azxs0 = cancelParams0.b;
            dcdg dcdg0 = new dcdg();
            NearbySharingChimeraService.ac(dchp0.a, "cancel", azxs0, dcdg0);
            return;
        }
        azxs azxs1 = cancelParams0.b;
        dcdu dcdu0 = new dcdu(dchp0, shareTarget0);
        NearbySharingChimeraService.ac(dchp0.a, "cancel", azxs1, dcdu0);
    }
}

