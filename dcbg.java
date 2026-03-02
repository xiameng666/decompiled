import java.util.Comparator;

public final class dcbg implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Boolean.compare(((Boolean)object0).booleanValue(), ((Boolean)object1).booleanValue());
    }
}

