import java.util.Comparator;

final class wzj implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((xet)object0).c.compareTo(((xet)object1).c);
    }
}

