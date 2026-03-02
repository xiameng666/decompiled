import java.util.Comparator;

public final class gqmn implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = Boolean.compare(((hhyf)object0).e.isEmpty(), ((hhyf)object1).e.isEmpty());
        return v == 0 ? ((hhyf)object0).e.compareTo(((hhyf)object1).e) : v;
    }
}

