import java.util.Iterator;

public abstract class ibpw implements ibvi, Iterator {
    public abstract int a();

    @Override
    public final Object next() {
        return this.a();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

