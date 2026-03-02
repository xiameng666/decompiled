import com.google.android.gms.nearby.sharing.RangingData;
import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfxi implements Runnable {
    public final dfzz a;
    public final String b;
    public final int c;
    public final RangingData d;

    public dfxi(dfzz dfzz0, String s, int v, RangingData rangingData0) {
        this.a = dfzz0;
        this.b = s;
        this.c = v;
        this.d = rangingData0;
    }

    @Override
    public final void run() {
        String s2;
        dfzz dfzz0 = this.a;
        String s = this.b;
        if(!dfzz0.bA()) {
            dcvz.a.b().h("Ignoring distance changed for endpoint %s because we\'re no longer scanning", s);
            return;
        }
        ShareTarget shareTarget0 = dfzz0.W(s);
        if(shareTarget0 == null) {
            dcvz.a.d().h("Received distance changed for endpoint %s but did not find an associated ShareTarget. Was this endpoint not resolvable?", s);
            return;
        }
        RangingData rangingData0 = this.d;
        int v = this.c;
        dfzz0.n.b(shareTarget0, v, rangingData0);
        if(v != 1) {
            cunf cunf0 = dcvz.a.b();
            String s1 = shareTarget0.b;
            switch(v) {
                case 2: {
                    s2 = "VERY_CLOSE";
                    break;
                }
                case 3: {
                    s2 = "CLOSE";
                    break;
                }
                case 4: {
                    s2 = "FAR";
                    break;
                }
                default: {
                    s2 = "VERY_FAR";
                }
            }
            cunf0.k("Reported onShareTargetDistanceChanged for (%s)%s with distance %s, %s.", s, s1, s2, rangingData0);
        }
    }
}

