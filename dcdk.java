import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.InstallParams;
import java.util.concurrent.Callable;

public final class dcdk implements Callable {
    public final dchp a;
    public final ShareTarget b;
    public final InstallParams c;

    public dcdk(dchp dchp0, ShareTarget shareTarget0, InstallParams installParams0) {
        this.a = dchp0;
        this.b = shareTarget0;
        this.c = installParams0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        long v = this.c.b;
        boolean z = ((Boolean)nearbySharingChimeraService0.ao.mr()).booleanValue();
        ShareTarget shareTarget0 = this.b;
        if(z) {
            nearbySharingChimeraService0.ab(shareTarget0);
        }
        return nearbySharingChimeraService0.x(shareTarget0).f(shareTarget0, v, new dccu(nearbySharingChimeraService0, v));
    }
}

