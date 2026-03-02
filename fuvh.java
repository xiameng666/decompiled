import j..util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

public final class fuvh {
    private final Map a;

    public fuvh() {
        EnumMap enumMap0 = new EnumMap(fuvg.class);
        enumMap0.put(fuvg.c, Double.valueOf(142.156));
        enumMap0.put(fuvg.e, Double.valueOf(100.453));
        enumMap0.put(fuvg.f, Double.valueOf(175.247));
        enumMap0.put(fuvg.g, Double.valueOf(109.315));
        enumMap0.put(fuvg.h, Double.valueOf(265.911));
        this.a = DesugarCollections.unmodifiableMap(enumMap0);
    }

    public final double a(Map map0, fuvg fuvg0) {
        Double double0 = (Double)map0.get(fuvg0);
        if(double0 == null) {
            double0 = (Double)this.a.get(fuvg0);
        }
        return (double)double0;
    }
}

