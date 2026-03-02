import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.OptInByRemoteCopyParams;
import j..util.Objects;

public final class dcep implements Runnable {
    public final dchp a;
    public final OptInByRemoteCopyParams b;

    public dcep(dchp dchp0, OptInByRemoteCopyParams optInByRemoteCopyParams0) {
        this.a = dchp0;
        this.b = optInByRemoteCopyParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.a;
        Objects.requireNonNull(this.a.e);
        dcgp dcgp0 = new dcgp(this.a.e);
        NearbySharingChimeraService.ac(this.a.a, "optInByRemoteCopy", azxs0, dcgp0);
    }
}

