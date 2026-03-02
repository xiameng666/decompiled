import android.util.Pair;
import java.util.List;

public final class dcqm {
    public final jqt a;

    public dcqm(jqt jqt0) {
        this.a = jqt0;
    }

    public final void a(sob sob0) {
        cunf cunf0 = dcvz.a.b();
        boolean z = sob0.b;
        boolean z1 = sob0.c;
        List list0 = sob0.c();
        cunf0.k("Phonesky P2P service evaluate isPlayInstallable: %s, containsInAppPurchases: %s, containsAds: %s, not installable reason: %s>", Boolean.valueOf(sob0.a), Boolean.valueOf(z1), Boolean.valueOf(z), list0);
        jqt jqt0 = this.a;
        int v = 0;
        int v1 = 2;
        Integer integer0 = (int)1;
        if(sob0.a) {
            if(z1) {
                v = 2;
            }
            if(z) {
                v |= 1;
            }
            jqt0.b(new Pair(integer0, ((byte)v)));
            return;
        }
        if(!sob0.c().contains(integer0) && !sob0.c().contains(Integer.valueOf(2))) {
            v1 = 0;
        }
        jqt0.b(new Pair(v1, ((byte)0)));
    }
}

