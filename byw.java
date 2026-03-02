import java.util.Iterator;

public final class byw implements ibvi, Iterator {
    public int a;
    final byx b;
    private final Iterator c;

    public byw(byx byx0) {
        this.b = byx0;
        super();
        this.a = -1;
        this.c = ibxv.a(new byv(byx0, this, null));
    }

    @Override
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override
    public final Object next() {
        return this.c.next();
    }

    @Override
    public final void remove() {
        int v = this.a;
        if(v != -1) {
            this.b.a.i(v);
            this.a = -1;
        }
    }
}

