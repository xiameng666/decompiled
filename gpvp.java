import java.util.AbstractList;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public final class gpvp extends AbstractList implements RandomAccess {
    private static final Object a;
    private Object[] b;
    private int c;
    private int d;

    static {
        gpvp.a = new Object();
    }

    public gpvp() {
        this.b = new Object[16];
    }

    private final void a(int v) {
        if(v >= 0 && v < this.size()) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final void add(int v, Object object0) {
        if(v < 0 || v > this.size()) {
            throw new IndexOutOfBoundsException();
        }
        this.b();
        int v1 = this.size();
        int v2 = this.d + 1;
        this.d = v2;
        this.d = v2 % this.b.length;
        while(v1 > v) {
            this.set(v1, this.get(v1 - 1));
            --v1;
        }
        this.set(v, object0);
    }

    public final void addLast(Object object0) {
        this.b();
        Object[] arr_object = this.b;
        int v = this.d;
        int v1 = v + 1;
        this.d = v1;
        arr_object[v] = object0;
        this.d = v1 % arr_object.length;
    }

    private final void b() {
        int v = this.size();
        if(v != this.b.length - 1) {
            return;
        }
        Object[] arr_object = new Object[v + v + 1];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = this.b[(this.c + v1) % this.b.length];
        }
        this.b = arr_object;
        this.c = 0;
        this.d = v;
    }

    @Override
    public final Object get(int v) {
        this.a(v);
        return this.b[(this.c + v) % this.b.length];
    }

    public final Object removeFirst() {
        if(this.isEmpty()) {
            throw new NoSuchElementException();
        }
        Object[] arr_object = this.b;
        int v = this.c;
        Object object0 = arr_object[v];
        arr_object[v] = gpvp.a;
        this.c = v + 1;
        this.c = (v + 1) % arr_object.length;
        return object0;
    }

    @Override
    public final Object set(int v, Object object0) {
        this.a(v);
        this.b[(this.c + v) % this.b.length] = object0;
        return object0;
    }

    @Override
    public final int size() {
        return (this.d - this.c + this.b.length) % this.b.length;
    }
}

