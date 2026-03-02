import java.util.Comparator;

public final class bwtk implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((bwky)object0).e, ((bwky)object1).e);
    }
}

