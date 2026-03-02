import java.util.Comparator;

public final class fdqc implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = ((fdyo)object0).b;
        int v1 = ((fdyo)object1).b;
        return v == v1 ? ((fdyo)object0).a(((fdyo)object1)) : Integer.compare(v, v1);
    }
}

