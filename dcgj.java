import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetVisibilityParams;

public final class dcgj implements Runnable {
    public final dchp a;
    public final SetVisibilityParams b;
    public final int c;

    public dcgj(dchp dchp0, SetVisibilityParams setVisibilityParams0, int v) {
        this.a = dchp0;
        this.b = setVisibilityParams0;
        this.c = v;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dcdy dcdy0 = new dcdy(this.a, this.c);
        NearbySharingChimeraService.ac(this.a.a, "setVisibility", azxs0, dcdy0);
    }
}

