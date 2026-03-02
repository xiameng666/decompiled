import java.util.Comparator;

public final class xki implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((xku)object0).c.compareTo(((xku)object1).c);
    }
}

