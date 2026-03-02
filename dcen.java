import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetDeviceVisibilityParams;

public final class dcen implements Runnable {
    public final dchp a;
    public final SetDeviceVisibilityParams b;
    public final int c;
    public final long d;
    public final String e;

    public dcen(dchp dchp0, SetDeviceVisibilityParams setDeviceVisibilityParams0, int v, long v1, String s) {
        this.a = dchp0;
        this.b = setDeviceVisibilityParams0;
        this.c = v;
        this.d = v1;
        this.e = s;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.a;
        dcec dcec0 = new dcec(this.a, this.c, this.d, this.e);
        NearbySharingChimeraService.ac(this.a.a, "setDeviceVisibility", azxs0, dcec0);
    }
}

