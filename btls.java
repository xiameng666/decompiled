import java.util.Comparator;

final class btls implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.valueOf(((btue)object0).e).compareTo(Long.valueOf(((btue)object1).e));
    }
}

