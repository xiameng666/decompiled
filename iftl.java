public final class iftl {
    public int[] a;

    public iftl(byte[] arr_b) {
        if(arr_b.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int v = 0;
        int v1 = iftj.a(arr_b, 0);
        int v2 = ifti.a(v1 - 1);
        if(arr_b.length != v1 * v2 + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.a = new int[v1];
        for(int v3 = 0; v3 < v1; ++v3) {
            int[] arr_v = this.a;
            int v4 = v2 - 1;
            int v5 = 0;
            while(v4 >= 0) {
                v5 |= (arr_b[v3 * v2 + 4 + v4] & 0xFF) << v4 * 8;
                --v4;
            }
            arr_v[v3] = v5;
        }
        int[] arr_v1 = this.a;
        boolean[] arr_z = new boolean[arr_v1.length];
        while(v < arr_v1.length) {
            int v6 = arr_v1[v];
            if(v6 < 0 || v6 >= arr_v1.length || arr_z[v6]) {
                throw new IllegalArgumentException("invalid encoding");
            }
            arr_z[v6] = true;
            ++v;
            continue;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof iftl) ? ifth.a(this.a, ((iftl)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return iftq.b(this.a);
    }

    @Override
    public final String toString() {
        String s = "[" + this.a[0];
        for(int v = 1; true; ++v) {
            int[] arr_v = this.a;
            if(v >= arr_v.length) {
                break;
            }
            s = s + ", " + arr_v[v];
        }
        return s + "]";
    }
}

