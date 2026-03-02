import java.util.Comparator;

public final class muc implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((mue)object0).a - ((mue)object1).a;
    }
}

