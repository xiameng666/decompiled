import java.util.Comparator;

public final class blkn implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((hery)object0).j, ((hery)object1).j);
    }
}

