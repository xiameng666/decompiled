import java.util.Comparator;

public final class dqqp implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((dqqr)object1).b(), ((dqqr)object0).b());
    }
}

