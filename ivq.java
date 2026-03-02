import java.util.Comparator;

public final class ivq implements Comparator {
    final Comparator a;

    public ivq(Comparator comparator0) {
        this.a = comparator0;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        int v = this.a.compare(object0, object1);
        return v == 0 ? ibrc.a(Integer.valueOf(((iug)object0).d), Integer.valueOf(((iug)object1).d)) : v;
    }
}

