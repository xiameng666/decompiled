import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterSharingProviderParams;

public final class dcgi implements Runnable {
    public final dchp a;
    public final RegisterSharingProviderParams b;
    public final dfsu c;
    public final String d;

    public dcgi(dchp dchp0, RegisterSharingProviderParams registerSharingProviderParams0, dfsu dfsu0, String s) {
        this.a = dchp0;
        this.b = registerSharingProviderParams0;
        this.c = dfsu0;
        this.d = s;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.a;
        dchd dchd0 = new dchd(this.a, this.c, this.d);
        NearbySharingChimeraService.ac(this.a.a, "registerSharingProvider", azxs0, dchd0);
    }
}

