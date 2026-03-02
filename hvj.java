public final class hvj {
    public final hzk a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final hvs f;
    public final bzd g;
    public final byd h;

    public hvj(hzk hzk0) {
        this.a = hzk0;
        this.g = new bzd(null);
        this.f = new hvs();
        this.h = new byd(10);
    }

    public final void a() {
        if(this.d) {
            this.d = true;
            return;
        }
        this.f.d.g();
    }

    public final void b() {
        if(this.b) {
            this.c = true;
            return;
        }
        Object[] arr_object = this.f.d.a;
        int v = this.f.d.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ((hvr)arr_object[v1]).a();
        }
        this.a();
    }

    public final void c(hfb hfb0) {
        if(this.b) {
            this.e = true;
            this.g.p(hfb0);
            return;
        }
        bzd bzd0 = this.f.e;
        bzd0.k();
        bzd0.p(this.f);
        while(bzd0.g()) {
            hvs hvs0 = (hvs)bzd0.h(bzd0.b - 1);
            int v = 0;
            while(true) {
                gwq gwq0 = hvs0.d;
                if(v >= gwq0.b) {
                    break;
                }
                hvr hvr0 = (hvr)gwq0.a[v];
                if(ibuq.m(hvr0.a, hfb0)) {
                    gwq0.m(hvr0);
                    hvr0.a();
                }
                else {
                    bzd0.p(hvr0);
                    ++v;
                }
            }
        }
    }
}

