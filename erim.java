import java.util.Comparator;

final class erim implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = ((eroh)object0).d;
        int v1 = ((eroh)object1).d;
        if(v > v1) {
            return -1;
        }
        if(v == v1) {
            int v2 = ((eroh)object0).b;
            int v3 = ((eroh)object1).b;
            if(v2 > v3) {
                return -1;
            }
            return v2 == v3 ? 0 : 1;
        }
        return 1;
    }
}

