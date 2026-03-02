import java.util.AbstractList;
import java.util.RandomAccess;

public final class gpvo extends AbstractList implements RandomAccess {
    public long a;
    public int[] b;
    public int c;
    public int d;

    public gpvo(long v) {
        this.b = new int[16];
        this.a = v;
    }

    public final Long a(int v) {
        this.f(v);
        return (long)(((long)this.b[(this.c + v) % this.b.length]) + this.a);
    }

    @Override
    public final void add(int v, Object object0) {
        this.b(v, ((Long)object0));
    }

    public final void b(int v, Long long0) {
        if(v < 0 || v > this.size()) {
            throw new IndexOutOfBoundsException();
        }
        this.c();
        int v1 = this.size();
        int v2 = this.d + 1;
        this.d = v2;
        this.d = v2 % this.b.length;
        while(v1 > v) {
            int v3 = this.c + v1;
            this.b[v3 % this.b.length] = this.b[(v3 - 1) % this.b.length];
            --v1;
        }
        this.e(v, long0);
    }

    public final void c() {
        int v = this.size();
        if(v != this.b.length - 1) {
            return;
        }
        int[] arr_v = new int[v * 3 / 2 + 1];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = this.b[(this.c + v1) % this.b.length];
        }
        this.b = arr_v;
        this.c = 0;
        this.d = v;
    }

    public final void d(long v) {
        if(v > 0x5FFFFFFDL) {
            this.a += 0x3FFFFFFFL;
            for(int v1 = 0; true; ++v1) {
                int[] arr_v = this.b;
                if(v1 >= arr_v.length) {
                    break;
                }
                arr_v[v1] += 0xC0000001;
            }
        }
    }

    public final void e(int v, Long long0) {
        this.f(v);
        int v1 = (int)(((long)long0) - this.a);
        this.b[(this.c + v) % this.b.length] = v1;
        this.d(((long)v1));
    }

    private final void f(int v) {
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
        Object object1 = (Long)object0;
        this.e(v, ((Long)object1));
        return object1;
    }

    @Override
    public final int size() {
        return (this.d - this.c + this.b.length) % this.b.length;
    }
}

