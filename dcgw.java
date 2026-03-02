import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.IgnoreConsentParams;

public final class dcgw implements Runnable {
    public final dchp a;
    public final IgnoreConsentParams b;

    public dcgw(dchp dchp0, IgnoreConsentParams ignoreConsentParams0) {
        this.a = dchp0;
        this.b = ignoreConsentParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.d;
        dcex dcex0 = new dcex(this.a, this.b);
        NearbySharingChimeraService.ac(this.a.a, "ignoreConsent", azxs0, dcex0);
    }
}

