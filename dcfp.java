import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.StopQrCodeSessionParams;
import j..util.Objects;

public final class dcfp implements Runnable {
    public final dchp a;
    public final StopQrCodeSessionParams b;

    public dcfp(dchp dchp0, StopQrCodeSessionParams stopQrCodeSessionParams0) {
        this.a = dchp0;
        this.b = stopQrCodeSessionParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.a;
        Objects.requireNonNull(this.a.e);
        dcdo dcdo0 = new dcdo(this.a.e);
        NearbySharingChimeraService.ac(this.a.a, "stopQrCodeSession", azxs0, dcdo0);
    }
}

