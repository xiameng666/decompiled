import j..util.Objects;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

final class ggoo implements Iterator {
    final Iterator a;
    Map.Entry b;
    Iterator c;
    final ggov d;

    public ggoo(ggov ggov0) {
        Objects.requireNonNull(ggov0);
        this.d = ggov0;
        super();
        this.a = ggov0.b.entrySet().iterator();
        this.c = gggy.a;
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext() || this.c.hasNext();
    }

    @Override
    public final Object next() {
        if(!this.c.hasNext()) {
            Object object0 = this.a.next();
            this.b = (Map.Entry)object0;
            this.c = ((Map)((Map.Entry)object0).getValue()).entrySet().iterator();
        }
        Objects.requireNonNull(this.b);
        Object object1 = this.c.next();
        return new ggpl(this.b.getKey(), ((Map.Entry)object1).getKey(), ((Map.Entry)object1).getValue());
    }

    @Override
    public final void remove() {
        this.c.remove();
        if(((Map)((Map.Entry)Objects.requireNonNull(this.b)).getValue()).isEmpty()) {
            this.a.remove();
            this.b = null;
        }
    }
}

