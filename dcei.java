import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnregisterSharingProviderParams;

public final class dcei implements Runnable {
    public final dchp a;
    public final UnregisterSharingProviderParams b;
    public final dchk c;

    public dcei(dchp dchp0, UnregisterSharingProviderParams unregisterSharingProviderParams0, dchk dchk0) {
        this.a = dchp0;
        this.b = unregisterSharingProviderParams0;
        this.c = dchk0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.a;
        dcef dcef0 = new dcef(this.a, this.c);
        NearbySharingChimeraService.ac(this.a.a, "unregisterSharingProvider", azxs0, dcef0);
    }
}

