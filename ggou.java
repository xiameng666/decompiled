import j..util.Objects;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

final class ggou extends ggod {
    final ggov a;
    final ggot b;

    public ggou(ggot ggot0) {
        Objects.requireNonNull(ggot0);
        this.b = ggot0;
        Objects.requireNonNull(ggot0.a);
        this.a = ggot0.a;
        super();
    }

    @Override
    public final void clear() {
        this.a.b.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        return (object0 instanceof Map.Entry) && ((Map.Entry)object0).getKey() != null && (((Map.Entry)object0).getValue() instanceof Map) && ggam.c(this.b.a.b.entrySet(), ((Map.Entry)object0));
    }

    @Override
    public final boolean isEmpty() {
        return this.a.b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        Set set0 = this.b.a.b.keySet();
        Objects.requireNonNull(this.b.a);
        return ggkm.l(set0, new ggos(this.b.a));
    }

    @Override
    public final boolean remove(Object object0) {
        return (object0 instanceof Map.Entry) && ((Map.Entry)object0).getKey() != null && (((Map.Entry)object0).getValue() instanceof Map) && this.b.a.b.entrySet().remove(((Map.Entry)object0));
    }

    @Override
    public final int size() {
        return this.b.a.b.size();
    }
}

