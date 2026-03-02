import j..util.Objects;
import java.util.Iterator;

final class ggun implements Iterator {
    final gguo a;
    private int b;

    public ggun(gguo gguo0) {
        Objects.requireNonNull(gguo0);
        this.a = gguo0;
        super();
        this.b = 0;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a.a.b;
    }

    @Override
    public final Object next() {
        int v = this.b;
        this.b = v + 1;
        return this.a.a.e(this.a.a.a[v] & 0x1F);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

