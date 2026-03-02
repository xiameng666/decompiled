import java.util.Comparator;

final class fwrw implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = Long.compare(((fvud)object0).c, ((fvud)object1).c);
        if(v > 0) {
            return 1;
        }
        return v == 0 ? 0 : -1;
    }
}

