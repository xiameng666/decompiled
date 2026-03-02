import j..util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;

final class gqbq extends AbstractSet {
    final gqbt a;

    public gqbq(gqbt gqbt0) {
        Objects.requireNonNull(gqbt0);
        this.a = gqbt0;
        super();
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public final Iterator iterator() {
        return new gqbp(this);
    }

    @Override
    public final boolean remove(Object object0) {
        return this.a.d(object0) != null;
    }

    @Override
    public final int size() {
        return this.a.c;
    }
}

