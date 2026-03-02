import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class bwxx implements Iterator {
    private Object a;

    private final void a() {
        if(this.a == null) {
            this.a = this.e();
        }
    }

    protected abstract Object e();

    @Override
    public final boolean hasNext() {
        this.a();
        return this.a != null;
    }

    @Override
    public final Object next() {
        this.a();
        Object object0 = this.a;
        if(object0 == null) {
            throw new NoSuchElementException();
        }
        this.a = null;
        return object0;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

