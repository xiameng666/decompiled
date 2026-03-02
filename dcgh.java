import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetDataUsageParams;

public final class dcgh implements Runnable {
    public final dchp a;
    public final SetDataUsageParams b;

    public dcgh(dchp dchp0, SetDataUsageParams setDataUsageParams0) {
        this.a = dchp0;
        this.b = setDataUsageParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dcet dcet0 = new dcet(this.a, this.b);
        NearbySharingChimeraService.ac(this.a.a, "setDataUsage", azxs0, dcet0);
    }
}

