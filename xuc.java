import java.util.Comparator;

final class xuc implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = xud.a(((xve)object0).a);
        int v1 = xud.a(((xve)object1).a);
        if(v < v1) {
            return -1;
        }
        return v == v1 ? 0 : 1;
    }
}

