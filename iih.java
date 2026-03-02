import java.util.Comparator;

final class iih implements Comparator {
    public static final iih a;

    static {
        iih.a = new iih();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        int v = ibuq.a(((ify)object1).l, ((ify)object0).l);
        return v == 0 ? ibuq.a(((ify)object0).hashCode(), ((ify)object1).hashCode()) : v;
    }
}

