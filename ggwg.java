import j..util.Objects;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

public final class ggwg extends AbstractSet {
    final int a;
    final ggwh b;

    public ggwg(ggwh ggwh0, int v) {
        Objects.requireNonNull(ggwh0);
        this.b = ggwh0;
        super();
        this.a = v;
    }

    final int a() {
        return this.b.c[this.a + 1];
    }

    final int b() {
        return this.a == -1 ? 0 : this.b.c[this.a];
    }

    final Object c(int v) {
        return this.b.b[this.b() + v];
    }

    @Override
    public final boolean contains(Object object0) {
        int v = this.b();
        int v1 = this.a();
        return Arrays.binarySearch(this.b.b, v, v1, object0, (this.a == -1 ? ggwh.a : ggwj.a)) >= 0;
    }

    @Override
    public final Iterator iterator() {
        return new ggwf(this);
    }

    @Override
    public final int size() {
        return this.a() - this.b();
    }
}

