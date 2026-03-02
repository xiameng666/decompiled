import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.concurrent.Callable;

public final class dcez implements Callable {
    public final dchp a;
    public final ShareTarget b;

    public dcez(dchp dchp0, ShareTarget shareTarget0) {
        this.a = dchp0;
        this.b = shareTarget0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        boolean z = ((Boolean)nearbySharingChimeraService0.ao.mr()).booleanValue();
        ShareTarget shareTarget0 = this.b;
        if(z) {
            if(!nearbySharingChimeraService0.aS(shareTarget0)) {
                return (int)0x8AB7;
            }
            nearbySharingChimeraService0.ab(shareTarget0);
            nearbySharingChimeraService0.ad(shareTarget0, new dcnn(0x403).a());
        }
        int v = nearbySharingChimeraService0.x(shareTarget0).c(shareTarget0);
        nearbySharingChimeraService0.R = null;
        dcvz.a.b().h("Client rejected incoming file from %s", shareTarget0);
        return v;
    }
}

