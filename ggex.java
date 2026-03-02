import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Iterator;
import java.util.Map.Entry;

final class ggex extends ggqj {
    final Iterator a;
    Object b;
    Iterator c;
    final ggfd d;

    public ggex(ggfd ggfd0) {
        Objects.requireNonNull(ggfd0);
        this.d = ggfd0;
        super();
        this.a = ggfd0.map.v().om();
        this.b = null;
        this.c = gggw.a;
    }

    @Override
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override
    public final Object next() {
        if(!this.c.hasNext()) {
            Object object0 = this.a.next();
            this.b = ((Map.Entry)object0).getKey();
            this.c = ((ggds)((Map.Entry)object0).getValue()).om();
        }
        Object object1 = Objects.requireNonNull(this.b);
        Object object2 = this.c.next();
        return new AbstractMap.SimpleImmutableEntry(object1, object2);
    }
}

