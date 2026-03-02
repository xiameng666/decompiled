import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterInstallCallbackParams;

public final class dceh implements Runnable {
    public final dchp a;
    public final RegisterInstallCallbackParams b;
    public final dbzg c;
    public final int d;

    public dceh(dchp dchp0, RegisterInstallCallbackParams registerInstallCallbackParams0, dbzg dbzg0, int v) {
        this.a = dchp0;
        this.b = registerInstallCallbackParams0;
        this.c = dbzg0;
        this.d = v;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.c;
        dcev dcev0 = new dcev(this.a, this.c, this.d);
        NearbySharingChimeraService.ac(this.a.a, "registerInstallCallback", azxs0, dcev0);
    }
}

