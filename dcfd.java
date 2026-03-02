import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.concurrent.Callable;

public final class dcfd implements Callable {
    public final dchp a;
    public final ShareTarget b;

    public dcfd(dchp dchp0, ShareTarget shareTarget0) {
        this.a = dchp0;
        this.b = shareTarget0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        boolean z = ((Boolean)nearbySharingChimeraService0.ao.mr()).booleanValue();
        ShareTarget shareTarget0 = this.b;
        if(z && !nearbySharingChimeraService0.aS(shareTarget0)) {
            return (int)0x8AB7;
        }
        int v = nearbySharingChimeraService0.x(shareTarget0).a(shareTarget0);
        dcvz.a.b().h("Client accepted incoming file from %s", shareTarget0);
        return v;
    }
}

