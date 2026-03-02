import java.util.Arrays;

public final class hlym implements Cloneable {
    public final int a;
    public final int b;
    private final int c;
    private final int[] d;

    public hlym(int v, int v1) {
        if(v <= 0 || v1 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.a = v;
        this.b = v1;
        int v2 = (v + 0x1F) / 0x20;
        this.c = v2;
        this.d = new int[v2 * v1];
    }

    private hlym(int v, int v1, int v2, int[] arr_v) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = arr_v;
    }

    public final void a() {
        int[] arr_v = this.d;
        for(int v = 0; v < arr_v.length; ++v) {
            arr_v[v] = 0;
        }
    }

    public final void b(int v, int v1) {
        int v2 = v1 * this.c + v / 0x20;
        this.d[v2] |= 1 << (v & 0x1F);
    }

    public final void c(int v, int v1, int v2, int v3) {
        if(v1 < 0 || v < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if(v3 <= 0 || v2 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int v4 = v3 + v1;
        if(v4 <= this.b) {
            int v5 = v2 + v;
            if(v5 <= this.a) {
                while(v1 < v4) {
                    int v6 = this.c;
                    for(int v7 = v; v7 < v5; ++v7) {
                        int v8 = v1 * v6 + (v7 >> 5);
                        this.d[v8] |= 1 << (v7 & 0x1F);
                    }
                    ++v1;
                }
                return;
            }
        }
        throw new IllegalArgumentException("The region must fit inside the matrix");
    }

    @Override
    public final Object clone() {
        int[] arr_v = (int[])this.d.clone();
        return new hlym(this.a, this.b, this.c, arr_v);
    }

    public final boolean d(int v, int v1) {
        return (this.d[v1 * this.c + v / 0x20] >>> (v & 0x1F) & 1) != 0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof hlym) ? this.a == ((hlym)object0).a && this.b == ((hlym)object0).b && this.c == ((hlym)object0).c && Arrays.equals(this.d, ((hlym)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.d);
        return (((this.a * 0x1F + this.a) * 0x1F + this.b) * 0x1F + this.c) * 0x1F + v;
    }

    @Override
    public final String toString() {
        int v = this.a;
        int v1 = this.b;
        StringBuilder stringBuilder0 = new StringBuilder((v + 1) * v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            for(int v3 = 0; v3 < v; ++v3) {
                stringBuilder0.append((this.d(v3, v2) ? "X " : "  "));
            }
            stringBuilder0.append("\n");
        }
        return stringBuilder0.toString();
    }
}

