import java.util.ListIterator;
import java.util.NoSuchElementException;

public abstract class ggqk extends ggqj implements ListIterator {
    private final int a;
    private int b;

    protected ggqk(int v, int v1) {
        gftb.D(v1, v);
        this.a = v;
        this.b = v1;
    }

    protected abstract Object a(int arg1);

    @Override
    @Deprecated
    public final void add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int v = this.b;
        this.b = v + 1;
        return this.a(v);
    }

    @Override
    public final int nextIndex() {
        return this.b;
    }

    @Override
    public final Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        int v = this.b - 1;
        this.b = v;
        return this.a(v);
    }

    @Override
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override
    @Deprecated
    public final void set(Object object0) {
        throw new UnsupportedOperationException();
    }
}

