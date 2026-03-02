import java.util.Comparator;

public final class dayx implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((heav)object0).d, ((heav)object1).d);
    }
}

