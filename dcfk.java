import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;

public final class dcfk implements Runnable {
    public final dchp a;
    public final SetEnabledParams b;

    public dcfk(dchp dchp0, SetEnabledParams setEnabledParams0) {
        this.a = dchp0;
        this.b = setEnabledParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dcgn dcgn0 = new dcgn(this.a, this.b);
        NearbySharingChimeraService.ac(this.a.a, "setEnabled", azxs0, dcgn0);
    }
}

