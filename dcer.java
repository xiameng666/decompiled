import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SyncParams;

public final class dcer implements Runnable {
    public final dchp a;
    public final SyncParams b;

    public dcer(dchp dchp0, SyncParams syncParams0) {
        this.a = dchp0;
        this.b = syncParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.a;
        dceb dceb0 = new dceb(this.a, this.b);
        NearbySharingChimeraService.ac(this.a.a, "sync", azxs0, dceb0);
        this.a.e.Z = false;
    }
}

