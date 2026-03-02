import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;

final class ggfv extends gged_interceptors {
    final ggfw a;

    public ggfv(ggfw ggfw0) {
        Objects.requireNonNull(ggfw0);
        this.a = ggfw0;
        super();
    }

    @Override
    public final Object get(int v) {
        return new AbstractMap.SimpleImmutableEntry(this.a.a.d.d.get(v), this.a.a.e.get(v));
    }

    @Override  // ggds
    public final boolean oo() {
        return true;
    }

    @Override
    public final int size() {
        return this.a.a.size();
    }

    @Override  // gged_interceptors
    public Object writeReplace() {
        return ((gged_interceptors)this).super.writeReplace();
    }
}

