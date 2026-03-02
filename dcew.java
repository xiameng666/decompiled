import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;

public final class dcew implements Runnable {
    public final dchp a;
    public final SetDeviceNameParams b;

    public dcew(dchp dchp0, SetDeviceNameParams setDeviceNameParams0) {
        this.a = dchp0;
        this.b = setDeviceNameParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dcfv dcfv0 = new dcfv(this.a, this.b);
        NearbySharingChimeraService.ac(this.a.a, "setDeviceName", azxs0, dcfv0);
    }
}

