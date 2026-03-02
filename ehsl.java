import j..time.Duration;
import j..util.concurrent.DesugarTimeUnit;
import java.util.concurrent.TimeUnit;

public final class ehsl {
    public int a;
    private final long b;
    private final long c;
    private int d;
    private final long[] e;
    private final float[][] f;

    public ehsl(int v, int v1) {
        this.e = new long[v];
        this.f = new float[3][v];
        this.b = DesugarTimeUnit.convert(TimeUnit.MILLISECONDS, Duration.ofSeconds(1L)) / ((long)v1);
        this.c = DesugarTimeUnit.convert(TimeUnit.MILLISECONDS, Duration.ofSeconds(1L)) / 10L;
    }

    public final float a(int v, int v1) {
        if(this.f(v) && v1 >= 0 && v1 < 3) {
            float[] arr_f = this.f[v1];
            return arr_f[this.h(v)];
        }
        return NaNf;
    }

    public final int b(long v) {
        int v2;
        if(!this.e()) {
            for(int v1 = 0; true; ++v1) {
                v2 = this.a;
                if(v1 >= v2) {
                    break;
                }
                if(this.c(v1) > v) {
                    return v1 == 0 ? -1 : v1 - 1;
                }
            }
            return v2 - 1;
        }
        return -1;
    }

    public final long c(int v) {
        return this.f(v) ? this.e[this.h(v)] : -1L;
    }

    public final void d() {
        this.d = 0;
        this.a = 0;
    }

    public final boolean e() {
        return this.a == 0;
    }

    public final boolean f(int v) {
        return v >= 0 && v < this.a;
    }

    public final void g(long v, float[] arr_f) {
        if(!this.e()) {
            long v1 = v - this.e[(this.d + this.a - 1) % this.e.length];
            if(v1 > this.c) {
                this.d();
            }
            else if(v1 < this.b) {
                return;
            }
        }
        long[] arr_v = this.e;
        int v2 = (this.d + this.a) % arr_v.length;
        arr_v[v2] = v;
        for(int v3 = 0; v3 < 3; ++v3) {
            this.f[v3][v2] = arr_f[v3];
        }
        int v4 = this.a;
        if(v4 == arr_v.length) {
            this.d = (this.d + 1) % arr_v.length;
            return;
        }
        this.a = v4 + 1;
    }

    private final int h(int v) {
        if(this.f(v)) {
            return (this.d + v) % this.e.length;
        }
        throw new IndexOutOfBoundsException("Index " + v + " out of bound. Current size=" + this.a);
    }
}

