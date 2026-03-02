import java.util.Iterator;

public final class byt implements ibvi, Iterator {
    public int a;
    final byu b;
    private final Iterator c;

    public byt(byu byu0) {
        this.b = byu0;
        super();
        this.a = -1;
        this.c = ibxv.a(new bys(byu0, this, null));
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
            this.b.a.e(v);
            this.a = -1;
        }
    }
}

