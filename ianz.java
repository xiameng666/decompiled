import j..util.Objects;
import java.util.Iterator;

final class ianz implements Iterable {
    public final iaoa a;
    public final int b;
    final iaof_metadata c;

    public ianz(iaof_metadata iaof0, iaoa iaoa0, int v) {
        Objects.requireNonNull(iaof0);
        this.c = iaof0;
        super();
        this.a = iaoa0;
        this.b = v;
    }

    @Override
    public final Iterator iterator() {
        return new iany(this);
    }
}

