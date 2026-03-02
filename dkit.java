import java.util.Comparator;

public final class dkit implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = ((gcjz)object1).b - ((gcjz)object0).b;
        return v == 0 ? ((gcjz)object0).a - ((gcjz)object1).a : v;
    }
}

