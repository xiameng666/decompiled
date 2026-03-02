import j..util.Objects;
import java.util.AbstractList;

final class ggyn extends AbstractList {
    final long a;
    final long b;
    final ghdw c;

    public ggyn() {
        throw null;
    }

    public ggyn(ggyo ggyo0, ghdw ghdw0, long v, long v1) {
        this.c = ghdw0;
        this.a = v;
        this.b = v1;
        Objects.requireNonNull(ggyo0);
        super();
    }

    @Override
    public final Object get(int v) {
        return new ggym((ggxg.a(this.c.d, this.c.a + ((long)v) * ((long)this.c.b), this.c.b) << ((int)this.a)) + this.b);
    }

    @Override
    public final int size() {
        return this.c.c;
    }
}

