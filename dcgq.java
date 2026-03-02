import android.content.Intent;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Callable;

public final class dcgq implements Callable {
    public final dchp a;
    public final dchn b;

    public dcgq(dchp dchp0, dchn dchn0) {
        this.a = dchp0;
        this.b = dchn0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        boolean z = nearbySharingChimeraService0.aH();
        if(z) {
            Map map0 = nearbySharingChimeraService0.Q;
            if(!map0.isEmpty()) {
                gggq.y(map0.entrySet(), new dcbi());
            }
        }
        dcht dcht0 = (dcht)nearbySharingChimeraService0.q.b(this.b.a);
        if(dcht0 == null) {
            dcvz.a.e().p("Send surface data is null", new Object[0]);
            return (int)13;
        }
        if(z && !nearbySharingChimeraService0.aH()) {
            if(((Boolean)nearbySharingChimeraService0.ao.mr()).booleanValue()) {
                gged_interceptors gged0 = gged_interceptors.i(nearbySharingChimeraService0.T.e());
                int v = gged0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    dikd dikd0 = (dikd)gged0.get(v1);
                    for(Object object0: nearbySharingChimeraService0.K(new Integer[]{((int)0)})) {
                        dcvz.a.b().h("Reporting in progress share target %s when unregistering send surface", dikd0.a.b);
                        dcnn dcnn0 = dikd0.b.a();
                        dcnn0.d();
                        TransferMetadata transferMetadata0 = dcnn0.a();
                        ((dcnp)((kau)object0).a).e(dikd0.a, transferMetadata0);
                    }
                }
                if(hvrc.a.b().aw()) {
                    for(Object object1: nearbySharingChimeraService0.S.e()) {
                        if(((ShareTarget)object1).k) {
                            dcvz.a.b().p("Stop scanning to clear the all share targets cache", new Object[0]);
                            nearbySharingChimeraService0.ba(false);
                            break;
                        }
                    }
                }
            }
            else {
                for(Object object2: nearbySharingChimeraService0.Q.entrySet()) {
                    ShareTarget shareTarget0 = (ShareTarget)((Map.Entry)object2).getKey();
                    TransferMetadata transferMetadata1 = (TransferMetadata)((Map.Entry)object2).getValue();
                    for(Object object3: nearbySharingChimeraService0.K(new Integer[]{((int)0)})) {
                        dcvz.a.b().h("Update %s to background surface", transferMetadata1);
                        ((dcnp)((kau)object3).a).e(shareTarget0, transferMetadata1);
                    }
                }
            }
        }
        nearbySharingChimeraService0.M();
        dcvz.a.b().h("A SendSurface(%s) has been unregistered", dcme.a(dcht0.b));
        nearbySharingChimeraService0.ak(new dbzy(nearbySharingChimeraService0), hvqs.ax());
        nearbySharingChimeraService0.N();
        if(!hvqz.X()) {
            Intent intent0 = nearbySharingChimeraService0.X;
            if(intent0 != null) {
                intent0.removeExtra("send_surface_start_time");
                nearbySharingChimeraService0.a.q(nearbySharingChimeraService0.X);
            }
        }
        return (int)0;
    }
}

