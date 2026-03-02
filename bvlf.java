import java.util.Comparator;

public final class bvlf implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        ibuq.f(((bvlo)object0), "a");
        ibuq.f(((bvlo)object1), "b");
        int v = ibuq.a(((bvlo)object0).c, ((bvlo)object1).c);
        return v == 0 ? ((bvlo)object0).b.compareTo(((bvlo)object1).b) : v;
    }
}

