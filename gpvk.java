import java.util.Comparator;

public final class gpvk implements Comparator {
    public final gpvl a;

    public gpvk(gpvl gpvl0) {
        this.a = gpvl0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((Long)this.a.b.apply(object0)).longValue(), ((Long)this.a.b.apply(object1)).longValue());
    }
}

