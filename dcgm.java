import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnregisterStateObserverParams;

public final class dcgm implements Runnable {
    public final dchp a;
    public final UnregisterStateObserverParams b;
    public final dcho c;

    public dcgm(dchp dchp0, UnregisterStateObserverParams unregisterStateObserverParams0, dcho dcho0) {
        this.a = dchp0;
        this.b = unregisterStateObserverParams0;
        this.c = dcho0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dcdn dcdn0 = new dcdn(this.a, this.c);
        NearbySharingChimeraService.ac(this.a.a, "unregisterStateObserver", azxs0, dcdn0);
    }
}

