import java.util.Comparator;

public final class emcq implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((emlw)object0).c, ((emlw)object1).c);
    }
}

