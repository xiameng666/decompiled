public final class fvtr {
    public int a;
    public int b;
    public int c;
    public final fwyc d;
    public gxfs e;
    private long[] f;
    private long[] g;

    public fvtr(fwyc fwyc0) {
        this.d = fwyc0;
        this.c = 0;
    }

    public final void a(long v, int v1) {
        long[] arr_v = this.f;
        if(arr_v == null || arr_v.length == this.a) {
            long[] arr_v1 = new long[(arr_v == null ? 0 : arr_v.length) + 50];
            if(arr_v != null) {
                for(int v2 = 0; v2 < this.a; ++v2) {
                    arr_v1[v2] = this.f[v2];
                }
            }
            this.f = arr_v1;
        }
        int v3 = this.a;
        this.a = v3 + 1;
        this.f[v3] = v;
        this.c |= v1;
    }

    public final long[] b() {
        if(this.g == null) {
            return new long[0];
        }
        long[] arr_v = new long[this.b];
        for(int v = 0; v < this.b; ++v) {
            arr_v[v] = this.g[v];
        }
        return arr_v;
    }

    public final long[] c() {
        if(this.f == null) {
            return new long[0];
        }
        long[] arr_v = new long[this.a];
        for(int v = 0; v < this.a; ++v) {
            arr_v[v] = this.f[v];
        }
        return arr_v;
    }

    public final void d(long v) {
        long[] arr_v = this.g;
        if(arr_v == null || arr_v.length == this.b) {
            long[] arr_v1 = new long[(arr_v == null ? 0 : arr_v.length) + 5];
            if(arr_v != null) {
                for(int v1 = 0; v1 < this.b; ++v1) {
                    arr_v1[v1] = this.g[v1];
                }
            }
            this.g = arr_v1;
        }
        int v2 = this.b;
        this.b = v2 + 1;
        this.g[v2] = v;
        this.c |= 2;
    }
}

