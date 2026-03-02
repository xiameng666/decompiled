import java.util.Collections;
import java.util.Comparator;

public final class ggwj {
    public static final Comparator a;
    public static final ggwj b;
    public final ggwh c;

    static {
        ggwj.a = new ggwc();
        ggwj.b = new ggwj(new ggwh(Collections.EMPTY_LIST));
    }

    public ggwj(ggwh ggwh0) {
        this.c = ggwh0;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggwj) && ((ggwj)object0).c.equals(this.c);
    }

    @Override
    public final int hashCode() {
        return ~this.c.hashCode();
    }

    @Override
    public final String toString() {
        return this.c.toString();
    }
}

