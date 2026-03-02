import java.util.concurrent.TimeUnit;

public final class fvrw {
    public final int a;
    public int b;
    public int c;
    public long[] d;
    public float[][] e;
    private final long f;
    private final long g;

    public fvrw(int v, int v1, int v2, int v3) {
        this.a = v;
        this.d = new long[v1];
        this.e = new float[v][v1];
        long v4 = 0x7FFFFFFFFFFFFFFFL;
        this.f = v2 == 0 ? 0x7FFFFFFFFFFFFFFFL : TimeUnit.NANOSECONDS.convert(1L, TimeUnit.SECONDS) / ((long)v2);
        if(v3 != 0) {
            v4 = TimeUnit.NANOSECONDS.convert(1L, TimeUnit.SECONDS) / ((long)v3);
        }
        this.g = v4;
    }

    public final float a(int v, int v1) {
        float[] arr_f = this.e[v1];
        return arr_f[this.g(v)];
    }

    public final int b(long v, int v1) {
        if(this.e()) {
            return -1;
        }
        if(v1 == -1) {
            return 0;
        }
        if(this.d(v1) == v) {
            return v1;
        }
        return v1 == this.c - 1 ? -1 : v1 + 1;
    }

    public final int c(long v) {
        int v2;
        if(!this.e()) {
            for(int v1 = 0; true; ++v1) {
                v2 = this.c;
                if(v1 >= v2) {
                    break;
                }
                if(this.d(v1) > v) {
                    return v1 == 0 ? -1 : v1 - 1;
                }
            }
            return v2 - 1;
        }
        return -1;
    }

    public final long d(int v) {
        long[] arr_v = this.d;
        return arr_v[this.g(v)];
    }

    public final boolean e() {
        return this.c == 0;
    }

    public final void f(long v, float[] arr_f) {
        if(!this.e()) {
            long v2 = v - this.d[(this.b + this.c - 1) % this.d.length];
            if(v2 > this.g) {
                this.b = 0;
                this.c = 0;
            }
            else if(v2 < this.f) {
                return;
            }
        }
        long[] arr_v = this.d;
        int v3 = (this.b + this.c) % arr_v.length;
        arr_v[v3] = v;
        for(int v1 = 0; v1 < this.a; ++v1) {
            this.e[v1][v3] = arr_f[v1];
        }
        int v4 = this.c;
        int v5 = this.d.length;
        if(v4 == v5) {
            this.b = (this.b + 1) % v5;
            return;
        }
        this.c = v4 + 1;
    }

    private final int g(int v) {
        if(v >= 0 && v < this.c) {
            return (this.b + v) % this.d.length;
        }
        throw new IndexOutOfBoundsException("Index " + v + " out of bound. Current size=" + this.c);
    }
}

