final class ghch {
    public boolean a;
    public ghae b;
    public ggym c;
    public int[] d;
    public int e;
    private final ggzc f;

    public ghch() {
        this.a = false;
        this.b = ggxv.e;
        this.c = new ggym(ggym.k(ggym.l(0), 30));
        this.f = new ggzc();
        this.d = new int[8];
        this.a(ghae.q(ghbj.i(0, -1.0, -1.0)));
    }

    public final void a(ghae ghae0) {
        this.f.b(this.b, ghae0);
        this.b = ghae0;
    }

    public final void b(int v, ghae ghae0, ghae ghae1) {
        ggzc ggzc0 = this.f;
        if(ggzc0.c != ghae0) {
            ggzc0.c(ghae0);
        }
        if(ggzc0.d(ghae1)) {
            this.c(v);
        }
    }

    public final void c(int v) {
        int[] arr_v1;
        int v1 = this.e;
        int v2 = 0;
        if(v1 == 0) {
            this.d[0] = v;
            this.e = 1;
            return;
        }
        int[] arr_v = this.d;
        if(arr_v[0] == v) {
            this.e = v1 - 1;
            if(v1 > 1) {
                System.arraycopy(arr_v, 1, arr_v, 0, v1 - 1);
            }
            return;
        }
        while(true) {
            arr_v1 = this.d;
            int v3 = arr_v1[v2];
            if(v3 >= v) {
                break;
            }
            int v4 = this.e;
            if(v2 + 1 != v4) {
                ++v2;
                continue;
            }
            this.e = v4 + 1;
            arr_v1[v4] = v;
            return;
        }
        if(v3 == v) {
            int v5 = this.e - 1;
            this.e = v5;
            System.arraycopy(arr_v1, v2 + 1, arr_v1, v2, v5 - v2);
            return;
        }
        System.arraycopy(arr_v1, v2, arr_v1, v2 + 1, this.e - v2);
        this.d[v2] = v;
        ++this.e;
    }
}

