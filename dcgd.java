import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetFastInitNotificationEnabledParams;

public final class dcgd implements Runnable {
    public final dchp a;
    public final SetFastInitNotificationEnabledParams b;

    public dcgd(dchp dchp0, SetFastInitNotificationEnabledParams setFastInitNotificationEnabledParams0) {
        this.a = dchp0;
        this.b = setFastInitNotificationEnabledParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.a;
        dcej dcej0 = new dcej(this.a, this.b);
        NearbySharingChimeraService.ac(this.a.a, "setFastInitNotificationEnabled", azxs0, dcej0);
    }
}

