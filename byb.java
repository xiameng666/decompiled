import java.util.Arrays;

public final class byb {
    public long[] a;
    public int b;

    public byb() {
        this(null);
    }

    public byb(int v) {
        this.a = v == 0 ? byh.a : new long[v];
    }

    public byb(byte[] arr_b) {
        this(16);
    }

    public final void a(int v) {
        long[] arr_v = this.a;
        if(arr_v.length < v) {
            long[] arr_v1 = Arrays.copyOf(arr_v, Math.max(v, arr_v.length * 3 / 2));
            ibuq.e(arr_v1, "copyOf(...)");
            this.a = arr_v1;
        }
    }

    public final void b(long v) {
        this.a(this.b + 1);
        int v1 = this.b;
        this.a[v1] = v;
        this.b = v1 + 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof byb)) {
            int v = this.b;
            if(((byb)object0).b == v) {
                long[] arr_v = this.a;
                long[] arr_v1 = ((byb)object0).a;
                ibwm ibwm0 = ibwt.q(0, v);
                int v1 = ibwm0.a;
                int v2 = ibwm0.b;
                if(v1 <= v2) {
                    while(true) {
                        if(arr_v[v1] != arr_v1[v1]) {
                            return false;
                        }
                        if(v1 == v2) {
                            break;
                        }
                        ++v1;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        long[] arr_v = this.a;
        int v = this.b;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            long v3 = arr_v[v1];
            v2 += ((int)(v3 ^ v3 >>> 0x20)) * 0x1F;
        }
        return v2;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        long[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = arr_v[v1];
            if(v1 != 0) {
                stringBuilder0.append(", ");
            }
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            stringBuilder0.append(v2);
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

