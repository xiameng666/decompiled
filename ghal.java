import j..util.Objects;
import java.util.AbstractList;

public final class ghal extends AbstractList {
    final ghas a;

    public ghal(ghas ghas0) {
        Objects.requireNonNull(ghas0);
        this.a = ghas0;
        super();
    }

    @Override
    public final Object get(int v) {
        return this.a.b(v);
    }

    @Override
    public final int size() {
        return this.a.d.size();
    }
}

