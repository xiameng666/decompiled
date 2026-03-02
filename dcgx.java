import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnregisterReceiveSurfaceParams;

public final class dcgx implements Runnable {
    public final dchp a;
    public final UnregisterReceiveSurfaceParams b;
    public final dchm c;

    public dcgx(dchp dchp0, UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams0, dchm dchm0) {
        this.a = dchp0;
        this.b = unregisterReceiveSurfaceParams0;
        this.c = dchm0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dceo dceo0 = new dceo(this.a, this.c);
        NearbySharingChimeraService.ac(this.a.a, "unregisterReceiveSurface", azxs0, dceo0);
    }
}

