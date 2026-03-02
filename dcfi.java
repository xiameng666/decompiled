import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterCloudSharingReceiverParams;

public final class dcfi implements Runnable {
    public final dchp a;
    public final RegisterCloudSharingReceiverParams b;

    public dcfi(dchp dchp0, RegisterCloudSharingReceiverParams registerCloudSharingReceiverParams0) {
        this.a = dchp0;
        this.b = registerCloudSharingReceiverParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.a;
        dcgk dcgk0 = new dcgk(this.a, this.b);
        NearbySharingChimeraService.ac(this.a.a, "registerCloudSharingReceiver", azxs0, dcgk0);
    }
}

