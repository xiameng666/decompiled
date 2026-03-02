import java.util.Comparator;

public final class ekmt implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        if(((ejyy)object0) == null) {
            return 1;
        }
        if(((ejyy)object1) == null) {
            return -1;
        }
        int v = Long.compare(((ejyy)object0).c, ((ejyy)object1).c);
        if(v == 0) {
            return 0;
        }
        return v > 0 ? -1 : 1;
    }
}

