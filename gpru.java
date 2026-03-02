import java.util.Comparator;

public final class gpru implements Comparator {
    public final long a;

    public gpru(long v) {
        this.a = v;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((gprw)object0).a.a(this.a), ((gprw)object1).a.a(this.a));
    }
}

