import j..util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class gqbo extends AbstractSet {
    final gqbt a;

    public gqbo(gqbt gqbt0) {
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
        return (object0 instanceof Map.Entry) && this.a.b(((Map.Entry)object0)) != null;
    }

    @Override
    public final Iterator iterator() {
        return new gqbn(this);
    }

    @Override
    public final boolean remove(Object object0) {
        if((object0 instanceof Map.Entry)) {
            gqbt gqbt0 = this.a;
            gqbs gqbs0 = gqbt0.b(((Map.Entry)object0));
            if(gqbs0 != null) {
                gqbt0.e(gqbs0, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public final int size() {
        return this.a.c;
    }
}

