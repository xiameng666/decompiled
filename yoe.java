import java.util.Comparator;

public final class yoe implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((yuj)object0).c.compareTo(((yuj)object1).c);
    }
}

