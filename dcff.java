import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnregisterInstallCallbackParams;

public final class dcff implements Runnable {
    public final dchp a;
    public final UnregisterInstallCallbackParams b;
    public final dchl c;

    public dcff(dchp dchp0, UnregisterInstallCallbackParams unregisterInstallCallbackParams0, dchl dchl0) {
        this.a = dchp0;
        this.b = unregisterInstallCallbackParams0;
        this.c = dchl0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dcdm dcdm0 = new dcdm(this.a, this.c);
        NearbySharingChimeraService.ac(this.a.a, "unregisterInstallCallback", azxs0, dcdm0);
    }
}

