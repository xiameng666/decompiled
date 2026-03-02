import java.util.Comparator;

public final class xkb implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((xln)object0).c.compareTo(((xln)object1).c);
    }
}

