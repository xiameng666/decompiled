import j..util.Objects;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class gqbr implements Iterator {
    gqbs a;
    gqbs b;
    int c;
    final gqbt d;

    public gqbr(gqbt gqbt0) {
        Objects.requireNonNull(gqbt0);
        this.d = gqbt0;
        super();
        this.a = gqbt0.e.d;
        this.b = null;
        this.c = gqbt0.d;
    }

    public final gqbs a() {
        gqbt gqbt0 = this.d;
        gqbs gqbs0 = this.a;
        if(gqbs0 == gqbt0.e) {
            throw new NoSuchElementException();
        }
        if(gqbt0.d != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = gqbs0.d;
        this.b = gqbs0;
        return gqbs0;
    }

    @Override
    public final boolean hasNext() {
        return this.a != this.d.e;
    }

    @Override
    public final void remove() {
        gqbs gqbs0 = this.b;
        if(gqbs0 == null) {
            throw new IllegalStateException();
        }
        this.d.e(gqbs0, true);
        this.b = null;
        this.c = this.d.d;
    }
}

