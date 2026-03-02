import j..util.Objects;
import java.util.Arrays;
import java.util.Locale;

public final class cjdt {
    public int a;
    public int b;
    public int c;
    public double[] d;

    public cjdt(int v, int v1) {
        this.a = v;
        this.b = v1;
        int v2 = v * v1;
        this.c = v2;
        this.d = new double[v2];
    }

    public cjdt(double[][] arr2_f) {
        this(3, arr2_f[0].length);
        int v1 = 0;
        for(int v = 0; v < this.b; ++v) {
            for(int v2 = 0; v2 < this.a; ++v2) {
                this.d[v1] = arr2_f[v2][v];
                ++v1;
            }
        }
    }

    public final double a(int v, int v1) {
        int v2 = this.a;
        if(v < v2 && v1 >= 0 && v1 < this.b) {
            return this.d[v1 * v2 + v];
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Requested index out of bounds: %d must be within [0,%d] and %d must be within [0,%d]", v, ((int)(this.a - 1)), v1, ((int)(this.b - 1))));
    }

    public static cjdt b(int v) {
        cjdt cjdt0 = new cjdt(v, v);
        for(int v1 = 0; v1 < cjdt0.c; v1 += v + 1) {
            cjdt0.d[v1] = 1.0;
        }
        return cjdt0;
    }

    public final String c(char c) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < this.a; ++v) {
            for(int v1 = 0; v1 < this.b; ++v1) {
                stringBuilder0.append(String.format(Locale.US, "%8f", this.a(v, v1)));
                stringBuilder0.append("    ");
            }
            stringBuilder0.append(c);
        }
        return stringBuilder0.toString();
    }

    @Override
    public final Object clone() {
        Object object0 = new cjdt(this.a, this.b);
        ((cjdt)object0).d(this);
        return object0;
    }

    public final void d(cjdt cjdt0) {
        if(cjdt0.a != this.a || cjdt0.b != this.b) {
            throw new IllegalArgumentException(String.format(Locale.US, "Size of this matrix is %d x %d but size of other is %d x %d", ((int)this.a), ((int)this.b), ((int)cjdt0.a), ((int)cjdt0.b)));
        }
        for(int v = 0; v < this.c; ++v) {
            this.d[v] = cjdt0.d[v];
        }
    }

    public final void e(int v, int v1, double f) {
        int v2 = this.a;
        if(v >= v2 || v1 >= this.b) {
            throw new IllegalArgumentException(String.format(Locale.US, "Requested index out of bounds: %d must be within [0,%d] and %d must be within [0,%d]", v, ((int)(this.a - 1)), v1, ((int)(this.b - 1))));
        }
        this.d[v1 * v2 + v] = f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof cjdt)) {
            return false;
        }
        if(this.a == ((cjdt)object0).a && this.b == ((cjdt)object0).b) {
            for(int v = 0; v < this.c; ++v) {
                if(this.d[v] != ((cjdt)object0).d[v]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Deprecated
    public final void f(int v, int v1) {
        int v2 = v * v1;
        if(v2 > this.d.length) {
            this.d = new double[v2];
        }
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override
    public final int hashCode() {
        int v = this.a;
        if(this.b * v != this.c) {
            int v1 = 1;
            for(int v2 = 0; v2 < this.c; ++v2) {
                long v3 = Double.doubleToLongBits(this.d[v2]);
                v1 = v1 * 0x1F + ((int)(v3 ^ v3 >>> 0x20));
            }
            return (v1 * 0x1F + this.a) * 0x1F + this.b;
        }
        return Objects.hash(new Object[]{v, ((int)this.b), Arrays.hashCode(this.d)});
    }

    @Override
    public final String toString() {
        return this.c('\n');
    }
}

