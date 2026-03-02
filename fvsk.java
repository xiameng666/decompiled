import java.util.Comparator;

final class fvsk implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = Long.compare(((fvsl)object0).b - ((fvsl)object1).c, 0L);
        if(v == 0) {
            return 0;
        }
        return v < 0 ? -1 : 1;
    }
}

