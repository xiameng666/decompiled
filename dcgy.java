import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetAllowPermissionAutoParams;

public final class dcgy implements Runnable {
    public final dchp a;
    public final SetAllowPermissionAutoParams b;

    public dcgy(dchp dchp0, SetAllowPermissionAutoParams setAllowPermissionAutoParams0) {
        this.a = dchp0;
        this.b = setAllowPermissionAutoParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dcdx dcdx0 = new dcdx(this.a, this.b);
        NearbySharingChimeraService.ac(this.a.a, "setAllowPermissionAuto", azxs0, dcdx0);
    }
}

