import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Map;

public final class dfww implements Runnable {
    public final dfzz a;
    public final ShareTarget b;
    public final String c;
    public final long d;

    public dfww(dfzz dfzz0, ShareTarget shareTarget0, String s, long v) {
        this.a = dfzz0;
        this.b = shareTarget0;
        this.c = s;
        this.d = v;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a;
        Map map0 = dfzz0.T;
        ShareTarget shareTarget0 = this.b;
        if(map0.get(shareTarget0) == null) {
            dcvz.a.b().h("Not reporting onEndpointLost since we called onShareTargetUpdated() for target %s.", shareTarget0.b);
            return;
        }
        String s = this.c;
        if(!dfzz0.M.contains(shareTarget0) && !dfzz0.L.contains(shareTarget0)) {
            if(map0.get(shareTarget0) == null) {
                dcvz.a.b().h("Not reporting onEndpointLost since we called onShareTargetUpdated() for endpoint %s.", s);
                return;
            }
            cunf cunf0 = dcvz.a;
            cunf0.b().i("ShareTarget %s was lost %s ms ago. A similar ShareTarget hasn\'t been found since then, so assuming the ShareTarget is no longer nearby. Reporting onShareTargetLost.", shareTarget0.b, Long.valueOf(this.d));
            dclv dclv0 = dfzz0.n;
            ShareTarget shareTarget1 = dfzz0.W(s);
            if(shareTarget1 == null) {
                cunf0.b().h("Ignoring lost endpoint %s because we don\'t have an associated ShareTarget", s);
                return;
            }
            dfzj dfzj0 = dfzz0.ae(shareTarget1);
            dfzj0.a();
            if(dclv0 != null && dfzj0.b()) {
                dclv0.c(shareTarget1);
            }
            dfzz0.N.remove(shareTarget1);
            dfzz0.O.remove(shareTarget1);
            dfzz0.y.h(shareTarget1, s);
            cunf0.b().i("Reported onShareTargetLost for (%s)%s", s, shareTarget1.b);
            map0.remove(shareTarget1);
            String s1 = dfzz.am(s, dfzj0.c);
            dfzz0.V.remove(s1);
            dfzz0.U.h(s1, shareTarget1);
            return;
        }
        dfzz0.ae(shareTarget0).a();
        dcvz.a.b().h("Marked endpoint %s as lost but skipped additional operations because it\'s in connected/transfer queue.", s);
    }
}

