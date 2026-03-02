import java.util.Comparator;

public final class dgad implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        long v = ((dbwz)object0).d;
        long v1 = ((dbwz)object1).d;
        return v == v1 ? Long.compare(((dbwz)object0).e, ((dbwz)object1).e) : Long.compare(v, v1);
    }
}

