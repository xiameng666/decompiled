import java.util.Arrays;

public final class fvsf {
    public static final fvsf a;
    public final int b;
    public final int c;
    public final long[] d;
    public final float[][] e;

    static {
        fvsf.a = new fvsf();
    }

    private fvsf() {
        this.d = new long[0];
        this.e = new float[0][0];
        this.b = 0;
        this.c = 0;
    }

    public fvsf(long[] arr_v, float[][] arr2_f) {
        this(arr_v, arr2_f, 0, arr_v.length);
    }

    private fvsf(long[] arr_v, float[][] arr2_f, int v, int v1) {
        if(arr2_f.length != 0 && arr_v.length != arr2_f[0].length) {
            throw new IllegalArgumentException("Lengths of timestampNanos and values are not equal.");
        }
        if(v < 0 || v >= arr_v.length || v1 <= 0 || v + v1 > arr_v.length) {
            throw new IndexOutOfBoundsException("Internal array length=" + arr_v.length + ", startIndex=" + v + ", length=" + v1);
        }
        this.d = arr_v;
        this.e = arr2_f;
        this.b = v;
        this.c = v1;
    }

    public final float a(int v, int v1) {
        float[] arr_f = this.e[v1];
        return arr_f[this.c(v)];
    }

    public final int b() {
        return this.e.length;
    }

    public final int c(int v) {
        if(v >= 0 && v < this.c) {
            return this.b + v;
        }
        throw new IndexOutOfBoundsException("Try to access index at " + v + ", the total length is " + this.c);
    }

    public final long d(int v) {
        return this.d[this.c(v)];
    }

    public final fvsf e(int v, int v1) {
        if(v1 == 0) {
            return fvsf.a;
        }
        int v2 = this.c(v);
        return new fvsf(this.d, this.e, v2, v1);
    }

    public final fvsf f(long v) {
        int v3;
        int v1;
        if(Long.compare(v, 0L) < 0) {
            v1 = 0;
        }
        else {
            int v2 = this.c;
            if(v2 == 0) {
                v3 = -1;
            }
            else {
                int v4 = Arrays.binarySearch(this.d, this.b, v2 + this.b, v);
                v3 = v4 < 0 ? v4 + this.b : v4 - this.b;
            }
            if(v3 >= 0) {
                v1 = v3;
            }
            else if(-v3 - 2 >= 0 && v - this.d(-v3 - 2) <= 0L) {
                v1 = -v3 - 2;
            }
            else {
                v1 = -v3 - 1;
            }
        }
        int v5 = this.c - 1;
        return v1 > v5 ? fvsf.a : this.e(v1, v5 - v1 + 1);
    }
}

