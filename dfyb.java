import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Map;

public final class dfyb implements Runnable {
    public final dfzz a;
    public final String b;

    public dfyb(dfzz dfzz0, String s) {
        this.a = dfzz0;
        this.b = s;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a;
        String s = this.b;
        dfzz0.a.remove(s);
        dfzz0.X.remove(s);
        ShareTarget shareTarget0 = dfzz0.W(s);
        if(shareTarget0 == null) {
            dcvz.a.b().h("Ignoring lost endpoint %s because we don\'t have an associated ShareTarget", s);
            return;
        }
        if(hvrc.a.b().M()) {
            String s1 = dfzz0.ao(shareTarget0);
            if(s1 != null) {
                dfzz0.bc(shareTarget0, s1);
                dcvz.a.e().p("Ignoring processShareTargetLost. This ShareTarget is still discovered by Nearby Connections.", new Object[0]);
                return;
            }
        }
        long v = shareTarget0.h ? hvqs.L() : hvqs.aC();
        dfww dfww0 = new dfww(dfzz0, shareTarget0, s, v);
        cunf cunf0 = dcvz.a;
        cunf0.b().i("Received onEndpointLost for ShareTarget %s. Waiting %d milliseconds to find it again before reporting.", shareTarget0.b, Long.valueOf(v));
        Map map0 = dfzz0.T;
        cumn cumn0 = (cumn)map0.remove(shareTarget0);
        if(cumn0 != null) {
            cumn0.b();
        }
        map0.put(shareTarget0, cumn.d(cunf0, new dfxh(dfzz0, dfww0), v, dfzz0.g));
    }
}

