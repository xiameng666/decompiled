import java.util.Comparator;

public final class ier implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = ibuq.a(((ify)object0).l, ((ify)object1).l);
        return v == 0 ? ibuq.a(((ify)object0).hashCode(), ((ify)object1).hashCode()) : v;
    }
}

