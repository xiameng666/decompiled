import j..util.Objects;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class ggwf implements Iterator {
    final ggwg a;
    private int b;

    public ggwf(ggwg ggwg0) {
        Objects.requireNonNull(ggwg0);
        this.a = ggwg0;
        super();
        this.b = 0;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override
    public final Object next() {
        int v = this.b;
        ggwg ggwg0 = this.a;
        if(v >= ggwg0.size()) {
            throw new NoSuchElementException();
        }
        Object object0 = ggwg0.b.b[ggwg0.b() + v];
        this.b = v + 1;
        return object0;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

