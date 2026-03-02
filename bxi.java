public final class bxi {
    private int[] a;
    private int b;
    private int c;
    private int d;

    public bxi() {
        int v = 8;
        if(Integer.bitCount(8) != 1) {
            int v1 = Integer.highestOneBit(7);
            v = v1 + v1;
        }
        this.d = v - 1;
        this.a = new int[v];
    }

    public final int a() {
        int v = this.b;
        if(v == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.b = v + 1 & this.d;
        return this.a[v];
    }

    public final void b(int v) {
        int[] arr_v = this.a;
        int v1 = this.c;
        arr_v[v1] = v;
        int v2 = this.d & v1 + 1;
        this.c = v2;
        int v3 = this.b;
        if(v2 == v3) {
            int v4 = arr_v.length - v3;
            int v5 = arr_v.length + arr_v.length;
            if(v5 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] arr_v1 = new int[v5];
            ibpg.aa(arr_v, arr_v1, 0, v3, arr_v.length);
            ibpg.aa(this.a, arr_v1, v4, 0, this.b);
            this.a = arr_v1;
            this.b = 0;
            this.c = arr_v.length;
            this.d = v5 - 1;
        }
    }

    public final void c() {
        this.c = this.b;
    }

    public final boolean d() {
        return this.b == this.c;
    }
}

