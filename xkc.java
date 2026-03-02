import java.util.Comparator;

public final class xkc implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((xks)object0).c.compareTo(((xks)object1).c);
    }
}

