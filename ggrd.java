final class ggrd extends ggqn {
    private static final int[] c;
    private int[] d;
    private int[] e;
    private int[] f;
    private int[] g;
    private int[] h;
    private int[] i;

    static {
        ggrd.c = new int[0];
    }

    public ggrd(glww glww0) {
        super(glww0);
        this.d = ggrd.c;
        this.e = ggrd.c;
        this.f = ggrd.c;
        this.g = ggrd.c;
        this.h = ggrd.c;
        this.i = ggrd.c;
    }

    @Override  // ggqn
    public final int a(glww glww0) {
        int v12;
        glww glww1 = this.b;
        int v = glww0.c();
        int v1 = glww1.c() - v;
        int v2 = Math.abs(v1);
        if(v2 > 100) {
            return 0x7FFFFFFF;
        }
        if(v1 <= 0) {
            this.d(v2, false);
            for(int v3 = 0; v3 <= v2; ++v3) {
                this.h[v3] = v2 - v3 - 1;
                this.i[v3] = -1;
            }
        }
        else {
            this.c(v2, false);
            for(int v4 = 0; v4 <= v2; ++v4) {
                this.e[v4] = -1;
                this.f[v4] = -1;
            }
        }
        int v5 = v2;
        int v6 = 1;
        while(true) {
            int v7 = (v5 - v1) / 2;
            this.d(v7, true);
            if(v6 != 0) {
                this.h[v7] = -1;
            }
            int v8 = v7;
            int v9 = -1;
            while(v8 > 0) {
                int[] arr_v = this.g;
                v9 = ggrd.e(v1 + v8, v5 - v8, glww1, glww0, this.i[v8 - 1], this.h[v8], v9);
                arr_v[v8] = v9;
                v7 = v7;
                --v8;
            }
            int v10 = v7;
            int v11 = (v5 + v1) / 2;
            this.c(v11, true);
            if(v6 == 0) {
                v12 = 0;
            }
            else {
                this.e[v11] = v10 - 1;
                v12 = 1;
            }
            if(v12 != 0) {
                v10 = -1;
            }
            int v13 = v10;
            for(int v14 = v11; v14 > 0; --v14) {
                int[] arr_v1 = this.d;
                v13 = ggrd.e(v1 - v14, v5 - v14, glww1, glww0, v13, this.e[v14], this.f[v14 - 1]);
                arr_v1[v14] = v13;
            }
            int v15 = ggrd.e(v1, v5, glww1, glww0, v13, this.e[0], v9);
            if(v15 != v) {
                ++v5;
                if(v5 <= 100 && v5 >= 0) {
                    int[] arr_v2 = this.d;
                    int[] arr_v3 = this.g;
                    arr_v3[0] = v15;
                    arr_v2[0] = v15;
                    int[] arr_v4 = this.e;
                    this.f = arr_v4;
                    this.e = arr_v2;
                    this.d = arr_v4;
                    int[] arr_v5 = this.i;
                    this.i = this.h;
                    this.h = arr_v3;
                    this.g = arr_v5;
                    v6 = v12 ^ 1;
                    v1 = v1;
                    continue;
                }
                return v5;
            }
            break;
        }
        return v5;
    }

    private final void c(int v, boolean z) {
        if(this.d.length <= v) {
            this.f = ggrd.f(this.f, v + 1, z);
            this.e = ggrd.f(this.e, v + 1, z);
            this.d = ggrd.f(this.d, v + 1, false);
        }
    }

    private final void d(int v, boolean z) {
        if(this.g.length <= v) {
            this.i = ggrd.f(this.i, v + 1, z);
            this.h = ggrd.f(this.h, v + 1, z);
            this.g = ggrd.f(this.g, v + 1, false);
        }
    }

    private static final int e(int v, int v1, glww glww0, glww glww1, int v2, int v3, int v4) {
        int v5 = v1 == 0 ? 0 : Math.max(Math.max(v3, v4) + 1, v2);
        int v6 = Math.min(glww1.c(), glww0.c() - v);
        while(v5 < v6 && glww0.a(v5 + v) == glww1.a(v5)) {
            ++v5;
        }
        return v5;
    }

    private static final int[] f(int[] arr_v, int v, boolean z) {
        int[] arr_v1 = new int[v];
        if(z) {
            System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
        }
        return arr_v1;
    }
}

