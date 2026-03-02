import java.util.Comparator;

public final class bbrt implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return String.CASE_INSENSITIVE_ORDER.compare(((String)((kau)object0).b), ((String)((kau)object1).b));
    }
}

