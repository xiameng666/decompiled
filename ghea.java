import java.util.Arrays;

public final class ghea {
    public int[] a;
    public int b;

    public ghea() {
        this.b = 0;
        this.a = new int[16];
    }

    public final int a(int v) {
        if(v >= 0 && v < this.b) {
            return this.a[v];
        }
        throw new ArrayIndexOutOfBoundsException("get at index " + v + " out of bounds on vector of size " + this.b);
    }

    public final void b(int v) {
        int v1 = this.b;
        if(v1 == this.a.length) {
            int v2 = Integer.highestOneBit(Math.max(v1 + 1, v1));
            int v3 = Math.max(16, (v2 == v1 + 1 ? Integer.highestOneBit(Math.max(v1 + 1, v1)) : v2 + v2));
            int[] arr_v = this.a;
            if(v3 > arr_v.length) {
                this.a = Arrays.copyOf(arr_v, v3);
            }
        }
        int v4 = this.b;
        this.a[v4] = v;
        this.b = v4 + 1;
    }

    public final void c() {
        this.b = 0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("IntSequence of ");
        stringBuilder0.append(this.b);
        stringBuilder0.append(" elements");
        if(this.b == 0) {
            stringBuilder0.append(".");
            return stringBuilder0.toString();
        }
        ghdz ghdz0 = new ghdz(this);
        stringBuilder0.append(": [");
        stringBuilder0.append(ghdz0.a());
        for(int v = 1; ghdz0.b() && v < 16; ++v) {
            stringBuilder0.append(", ");
            stringBuilder0.append(ghdz0.a());
        }
        if(this.b > 16) {
            stringBuilder0.append("...");
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

