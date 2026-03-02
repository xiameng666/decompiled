import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.ResetParams;

public final class dcgo implements Runnable {
    public final dchp a;
    public final ResetParams b;

    public dcgo(dchp dchp0, ResetParams resetParams0) {
        this.a = dchp0;
        this.b = resetParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.a;
        dcfq dcfq0 = new dcfq(this.a);
        NearbySharingChimeraService.ac(this.a.a, "reset", azxs0, dcfq0);
    }
}

