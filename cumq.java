import java.util.Comparator;

public final class cumq implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return -((cumx)object0).d.compareTo(((cumx)object1).d);
    }
}

