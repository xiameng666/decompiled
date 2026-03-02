import j..util.Objects;
import java.util.Map;
import java.util.Set;

final class ggot extends ggkl {
    final ggov a;

    public ggot(ggov ggov0) {
        Objects.requireNonNull(ggov0);
        this.a = ggov0;
        super();
    }

    @Override  // ggkl
    public final Set b() {
        return new ggou(this);
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.a.m(object0);
    }

    @Override
    public final Object get(Object object0) {
        ggov ggov0 = this.a;
        return ggov0.m(object0) ? new ggor(ggov0, Objects.requireNonNull(object0)) : null;
    }

    @Override
    public final Object remove(Object object0) {
        return object0 == null ? null : ((Map)this.a.b.remove(object0));
    }
}

