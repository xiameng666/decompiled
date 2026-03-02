import j..util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;

final class gguo extends AbstractSet {
    final gguq a;

    public gguo(gguq gguq0) {
        Objects.requireNonNull(gguq0);
        this.a = gguq0;
        super();
    }

    @Override
    public final Iterator iterator() {
        return new ggun(this);
    }

    @Override
    public final int size() {
        return this.a.b;
    }
}

