import j..util.Objects;
import java.util.Comparator;
import java.util.Map.Entry;

public final class ggfu implements Comparator {
    public final Comparator a;

    public ggfu(Comparator comparator0) {
        this.a = comparator0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        Map.Entry map$Entry0 = (Map.Entry)object0;
        Map.Entry map$Entry1 = (Map.Entry)object1;
        Objects.requireNonNull(map$Entry0);
        Objects.requireNonNull(map$Entry1);
        Object object2 = map$Entry0.getKey();
        Object object3 = map$Entry1.getKey();
        return this.a.compare(object2, object3);
    }
}

