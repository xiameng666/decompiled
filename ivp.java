import java.util.Comparator;

public final class ivp implements Comparator {
    final Comparator a;
    final Comparator b;

    public ivp(Comparator comparator0, Comparator comparator1) {
        this.a = comparator0;
        this.b = comparator1;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        int v = this.a.compare(object0, object1);
        return v == 0 ? this.b.compare(((iug)object0).a, ((iug)object1).a) : v;
    }
}

