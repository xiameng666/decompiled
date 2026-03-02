import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.InstallParams;

public final class dcfl implements Runnable {
    public final dchp a;
    public final InstallParams b;
    public final ShareTarget c;

    public dcfl(dchp dchp0, InstallParams installParams0, ShareTarget shareTarget0) {
        this.a = dchp0;
        this.b = installParams0;
        this.c = shareTarget0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.c;
        dcdk dcdk0 = new dcdk(this.a, this.c, this.b);
        NearbySharingChimeraService.ac(this.a.a, "install", azxs0, dcdk0);
    }
}

