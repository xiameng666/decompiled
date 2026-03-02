import j..time.Instant;
import j..util.Map.-EL;
import java.util.Comparator;
import java.util.Map;

public final class byoh implements Comparator {
    private final Map a;

    public byoh(Map map0) {
        this.a = map0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        ibuq.f(((bybu)object0), "p0");
        ibuq.f(((bybu)object1), "p1");
        String s = ((bybu)object0).h;
        String s1 = ((bybu)object1).h;
        if(!ibuq.m(s, s1)) {
            Integer integer0 = (int)2000;
            int v = ((Number)Map.-EL.getOrDefault(this.a, s, integer0)).intValue();
            int v1 = ((Number)Map.-EL.getOrDefault(this.a, s1, integer0)).intValue();
            if(v < v1) {
                return -1;
            }
            if(v1 < v) {
                return 1;
            }
        }
        Instant instant0 = ((bybu)object0).o;
        Instant instant1 = ((bybu)object1).o;
        if(instant0 != null && instant1 != null) {
            if(instant0.compareTo(instant1) < 0) {
                return 1;
            }
            return instant0.compareTo(instant1) <= 0 ? 0 : -1;
        }
        if(instant0 != null) {
            return -1;
        }
        return instant1 == null ? 0 : 1;
    }
}

