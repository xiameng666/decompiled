import j..util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class iany implements Iterator {
    final ianz a;
    private boolean b;
    private int c;

    public iany(ianz ianz0) {
        Objects.requireNonNull(ianz0);
        this.a = ianz0;
        super();
        this.b = true;
        this.c = ianz0.b;
    }

    @Override
    public final boolean hasNext() {
        if(!this.b) {
            while(true) {
                int v = this.c;
                ianz ianz0 = this.a;
                iaof_metadata iaof0 = ianz0.c;
                if(v >= iaof0.f) {
                    break;
                }
                if(Arrays.equals(ianz0.a.b, iaof0.k(v))) {
                    this.b = true;
                    return true;
                }
                ++this.c;
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = false;
        int v = this.c;
        this.c = v + 1;
        return this.a.c.f(v, this.a.a);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

