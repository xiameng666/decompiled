import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterStateObserverParams;

public final class dcgv implements Runnable {
    public final dchp a;
    public final RegisterStateObserverParams b;
    public final dcng c;

    public dcgv(dchp dchp0, RegisterStateObserverParams registerStateObserverParams0, dcng dcng0) {
        this.a = dchp0;
        this.b = registerStateObserverParams0;
        this.c = dcng0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dcem dcem0 = new dcem(this.a, this.c);
        NearbySharingChimeraService.ac(this.a.a, "registerStateObserver", azxs0, dcem0);
    }
}

