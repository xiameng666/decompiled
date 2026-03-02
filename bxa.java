import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

final class bxa implements Iterator, Map.Entry {
    int a;
    int b;
    boolean c;
    final bxd d;

    public bxa(bxd bxd0) {
        this.d = bxd0;
        super();
        this.a = bxd0.d_num - 1;
        this.b = -1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this.c) {
            return (object0 instanceof Map.Entry) ? ibuq.m(((Map.Entry)object0).getKey(), this.d.f(this.b)) && ibuq.m(((Map.Entry)object0).getValue(), this.d.i(this.b)) : false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final Object getKey() {
        if(this.c) {
            return this.d.f(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final Object getValue() {
        if(this.c) {
            return this.d.i(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override
    public final int hashCode() {
        if(!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object object0 = this.d.f(this.b);
        Object object1 = this.d.i(this.b);
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        if(object1 != null) {
            v = object1.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        ++this.b;
        this.c = true;
        return this;
    }

    @Override
    public final void remove() {
        if(!this.c) {
            throw new IllegalStateException();
        }
        this.d.g(this.b);
        --this.b;
        --this.a;
        this.c = false;
    }

    @Override
    public final Object setValue(Object object0) {
        if(this.c) {
            return this.d.h(this.b, object0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final String toString() {
        return this.getKey() + "=" + this.getValue();
    }
}

