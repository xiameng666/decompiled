import java.util.Comparator;

public final class xko implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((xll)object0).c.compareTo(((xll)object1).c);
    }
}

