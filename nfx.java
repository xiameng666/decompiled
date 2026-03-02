import java.util.Comparator;

public final class nfx implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Integer.compare(((nfy)object1).c, ((nfy)object0).c);
    }
}

