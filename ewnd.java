import java.util.Comparator;

public final class ewnd implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((ewlw)object0).c.compareTo(((ewlw)object1).c);
    }
}

