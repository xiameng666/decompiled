import java.util.AbstractList;
import java.util.RandomAccess;

public final class gpvj extends AbstractList implements RandomAccess {
    public float[] a;
    public int b;
    public int c;

    public gpvj() {
        this.a = new float[16];
    }

    public final Float a(int v) {
        this.e(v);
        return (float)this.a[(this.b + v) % this.a.length];
    }

    @Override
    public final void add(int v, Object object0) {
        this.b(v, ((Float)object0));
    }

    public final void b(int v, Float float0) {
        if(v < 0 || v > this.size()) {
            throw new IndexOutOfBoundsException();
        }
        this.c();
        int v1 = this.size();
        int v2 = this.c + 1;
        this.c = v2;
        this.c = v2 % this.a.length;
        while(v1 > v) {
            int v3 = this.b + v1;
            this.a[v3 % this.a.length] = this.a[(v3 - 1) % this.a.length];
            --v1;
        }
        this.d(v, float0);
    }

    public final void c() {
        int v = this.size();
        if(v != this.a.length - 1) {
            return;
        }
        float[] arr_f = new float[v * 3 / 2 + 1];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_f[v1] = this.a[(this.b + v1) % this.a.length];
        }
        this.a = arr_f;
        this.b = 0;
        this.c = v;
    }

    public final void d(int v, Float float0) {
        this.e(v);
        this.a[(this.b + v) % this.a.length] = (float)float0;
    }

    private final void e(int v) {
        if(v >= 0 && v < this.size()) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final Object get(int v) {
        return this.a(v);
    }

    @Override
    public final Object set(int v, Object object0) {
        Object object1 = (Float)object0;
        this.d(v, ((Float)object1));
        return object1;
    }

    @Override
    public final int size() {
        return (this.c - this.b + this.a.length) % this.a.length;
    }
}

