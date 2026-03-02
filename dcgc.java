import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;

public final class dcgc implements Runnable {
    public final dchp a;
    public final RegisterReceiveSurfaceParams b;
    public final dcnp c;
    public final int d;

    public dcgc(dchp dchp0, RegisterReceiveSurfaceParams registerReceiveSurfaceParams0, dcnp dcnp0, int v) {
        this.a = dchp0;
        this.b = registerReceiveSurfaceParams0;
        this.c = dcnp0;
        this.d = v;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.c;
        dcdr dcdr0 = new dcdr(this.a, this.c, this.d, this.b);
        NearbySharingChimeraService.ac(this.a.a, "registerReceiveSurface", azxs0, dcdr0);
    }
}

