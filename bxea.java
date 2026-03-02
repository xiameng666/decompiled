import java.util.Comparator;

public final class bxea implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.valueOf(((bxeb)object1).c).compareTo(Long.valueOf(((bxeb)object0).c));
    }
}

