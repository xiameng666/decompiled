import java.util.Comparator;

public final class jby implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        ibns ibns0 = (ibns)object0;
        ibns ibns1 = (ibns)object1;
        return ((Number)ibns0.b).intValue() - ((Number)ibns0.a).intValue() - (((Number)ibns1.b).intValue() - ((Number)ibns1.a).intValue());
    }
}

