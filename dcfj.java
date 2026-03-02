import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OpenParams;

public final class dcfj implements Runnable {
    public final dchp a;
    public final OpenParams b;
    public final ShareTarget c;

    public dcfj(dchp dchp0, OpenParams openParams0, ShareTarget shareTarget0) {
        this.a = dchp0;
        this.b = openParams0;
        this.c = shareTarget0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dcfz dcfz0 = new dcfz(this.a, this.c);
        NearbySharingChimeraService.ac(this.a.a, "open", azxs0, dcfz0);
    }
}

