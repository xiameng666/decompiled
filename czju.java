import j..util.Map.-EL;
import java.util.HashMap;
import java.util.Map;

public final class czju {
    public static final ggeo a;
    public static final bbcu b;
    private static final Map c;

    static {
        czju.c = new HashMap();
        ggek ggek0 = new ggek();
        ggek0.i("NearbyConnections", bbcu.an);
        ggek0.i("NearbyMediums", bbcu.an);
        ggek0.i("NearbyMessages", bbcu.av);
        ggek0.i("NearbySetup", bbcu.cv);
        ggek0.i("NearbySharing", bbcu.cV);
        ggek0.i("ExposureNotification", bbcu.dM);
        ggek0.i("NearbyFastPair", bbcu.eo);
        ggek0.i("NearbyDiscovery", bbcu.eo);
        ggek0.i("ENPromos", bbcu.eF);
        ggek0.i("NearbyPresence", bbcu.fj);
        czju.a = ggek0.b();
        czju.b = bbcu.aj;
    }

    public static bboh a() {
        bboh bboh0;
        synchronized(czju.class) {
            czjt czjt0 = new czjt();
            bboh0 = (bboh)Map.-EL.computeIfAbsent(czju.c, "Nearby", czjt0);
        }
        return bboh0;
    }
}

