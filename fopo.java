import java.util.Comparator;

public final class fopo implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((fopp)object0).a.a, ((fopp)object1).a.a);
    }
}

