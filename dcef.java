import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.concurrent.Callable;

public final class dcef implements Callable {
    public final dchp a;
    public final dchk b;

    public dcef(dchp dchp0, dchk dchk0) {
        this.a = dchp0;
        this.b = dchk0;
    }

    @Override
    public final Object call() {
        cunf cunf0 = dcvz.a;
        cunf cunf1 = cunf0.b();
        dfsu dfsu0 = this.b.a;
        cunf1.h("Unregistering provider %s", dfsu0);
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        if(hvqz.z()) {
            gged_interceptors gged0 = nearbySharingChimeraService0.c.h(dfsu0);
            cunf0.b().i("Unregistering provider %s with %s targets", dfsu0, Integer.valueOf(gged0.size()));
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ShareTarget shareTarget0 = (ShareTarget)gged0.get(v1);
                if(((Boolean)nearbySharingChimeraService0.ao.mr()).booleanValue() && nearbySharingChimeraService0.aS(shareTarget0) || nearbySharingChimeraService0.Q.containsKey(shareTarget0)) {
                    cunf0.b().h("Cancelling transfer for %s", shareTarget0.b);
                    nearbySharingChimeraService0.c(shareTarget0);
                }
            }
            int v2 = gged0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                nearbySharingChimeraService0.af(((ShareTarget)gged0.get(v3)));
            }
        }
        dijl dijl0 = nearbySharingChimeraService0.c.d(dfsu0);
        if(dijl0 == null) {
            cunf0.e().h("Failed to unregister %s", dfsu0);
            return (int)13;
        }
        cunf0.d().i("Successfully unregistered provider %s with id %s", dfsu0, dijl0.a);
        return (int)0;
    }
}

