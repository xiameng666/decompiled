import java.util.ListIterator;

final class iez implements ibvi, ListIterator {
    final ifb a;
    private int b;
    private final int c;
    private final int d;

    public iez(ifb ifb0, int v, int v1) {
        if(1 == (v1 & 1)) {
            v = 0;
        }
        this(ifb0, v, 0, ifb0.a());
    }

    public iez(ifb ifb0, int v, int v1, int v2) {
        this.a = ifb0;
        super();
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    @Override
    public final void add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.d;
    }

    @Override
    public final boolean hasPrevious() {
        return this.b > this.c;
    }

    @Override
    public final Object next() {
        int v = this.b;
        this.b = v + 1;
        Object object0 = this.a.b.c(v);
        ibuq.d(object0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (hfb)object0;
    }

    @Override
    public final int nextIndex() {
        return this.b - this.c;
    }

    @Override
    public final Object previous() {
        int v = this.b - 1;
        this.b = v;
        Object object0 = this.a.b.c(v);
        ibuq.d(object0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (hfb)object0;
    }

    @Override
    public final int previousIndex() {
        return this.b - this.c - 1;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void set(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

