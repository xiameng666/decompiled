import java.util.Comparator;

final class ivs implements Comparator {
    public static final ivs a;

    static {
        ivs.a = new ivs();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        int v = Float.compare(((hka)((ibns)object0).a).c, ((hka)((ibns)object1).a).c);
        return v == 0 ? Float.compare(((hka)((ibns)object0).a).e, ((hka)((ibns)object1).a).e) : v;
    }
}

