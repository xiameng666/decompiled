import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetDownloadsDirectoryParams;

public final class dcge implements Runnable {
    public final dchp a;
    public final SetDownloadsDirectoryParams b;

    public dcge(dchp dchp0, SetDownloadsDirectoryParams setDownloadsDirectoryParams0) {
        this.a = dchp0;
        this.b = setDownloadsDirectoryParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.b;
        dcdv dcdv0 = new dcdv(this.a, this.b);
        NearbySharingChimeraService.ac(this.a.a, "setDownloadsDirectory", azxs0, dcdv0);
    }
}

