import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.OptInParams;
import j..util.Objects;

public final class dcdq implements Runnable {
    public final dchp a;
    public final OptInParams b;

    public dcdq(dchp dchp0, OptInParams optInParams0) {
        this.a = dchp0;
        this.b = optInParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.a;
        Objects.requireNonNull(this.a.e);
        dcgf dcgf0 = new dcgf(this.a.e);
        NearbySharingChimeraService.ac(this.a.a, "optIn", azxs0, dcgf0);
    }
}

