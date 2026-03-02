import java.util.Comparator;

public final class gqma implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((gqms)object0).d().compareTo(((gqms)object1).d());
    }
}

