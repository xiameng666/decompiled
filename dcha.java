import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;

public final class dcha implements Runnable {
    public final dchp a;
    public final RegisterSendSurfaceParams b;
    public final dcnp c;
    public final dclv d;
    public final int e;

    public dcha(dchp dchp0, RegisterSendSurfaceParams registerSendSurfaceParams0, dcnp dcnp0, dclv dclv0, int v) {
        this.a = dchp0;
        this.b = registerSendSurfaceParams0;
        this.c = dcnp0;
        this.d = dclv0;
        this.e = v;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.d;
        dcfy dcfy0 = new dcfy(this.a, this.c, this.d, this.e, this.b);
        NearbySharingChimeraService.ac(this.a.a, "registerSendSurface", azxs0, dcfy0);
    }
}

