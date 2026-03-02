import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnregisterSendSurfaceParams;

public final class dcfo implements Runnable {
    public final dchp a;
    public final UnregisterSendSurfaceParams b;
    public final dchn c;

    public dcfo(dchp dchp0, UnregisterSendSurfaceParams unregisterSendSurfaceParams0, dchn dchn0) {
        this.a = dchp0;
        this.b = unregisterSendSurfaceParams0;
        this.c = dchn0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dcgq dcgq0 = new dcgq(this.a, this.c);
        NearbySharingChimeraService.ac(this.a.a, "unregisterSendSurface", azxs0, dcgq0);
    }
}

