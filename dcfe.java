import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;

public final class dcfe implements Runnable {
    public final dchp a;
    public final SetAccountParams b;

    public dcfe(dchp dchp0, SetAccountParams setAccountParams0) {
        this.a = dchp0;
        this.b = setAccountParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dcfs dcfs0 = new dcfs(this.a, this.b);
        NearbySharingChimeraService.ac(this.a.a, "setAccount", azxs0, dcfs0);
    }
}

