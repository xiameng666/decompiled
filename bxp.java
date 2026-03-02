import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class bxp implements ibvi, Iterator {
    private int a;
    private int b;
    private boolean c;

    public bxp(int v) {
        this.a = v;
    }

    protected abstract Object a(int arg1);

    protected abstract void b(int arg1);

    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.a(this.b);
        ++this.b;
        this.c = true;
        return object0;
    }

    @Override
    public final void remove() {
        if(!this.c) {
            cad.b("Call next() before removing an element.");
        }
        int v = this.b - 1;
        this.b = v;
        this.b(v);
        --this.a;
        this.c = false;
    }
}

