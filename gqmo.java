import java.util.Comparator;

public final class gqmo implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = Boolean.compare(((hhyf)object0).c.isEmpty(), ((hhyf)object1).c.isEmpty());
        return v == 0 ? ((hhyf)object0).c.compareTo(((hhyf)object1).c) : v;
    }
}

