final class igy extends ibur implements ibth {
    final ihc a;

    public igy(ihc ihc0) {
        this.a = ihc0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        ihc ihc0 = this.a;
        ihc0.f.h = 0;
        gwq gwq0 = ihc0.o().k();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ihc ihc1 = ((ify)arr_object[v1]).q();
            ihc1.h = ihc1.i;
            ihc1.i = 0x7FFFFFFF;
            ihc1.t = false;
            if(ihc1.G == 2) {
                ihc1.G = 3;
            }
        }
        ihc0.j(igw.a);
        ihc0.i().K().g();
        ify ify0 = ihc0.o();
        gwq gwq1 = ify0.k();
        Object[] arr_object1 = gwq1.a;
        int v2 = gwq1.b;
        for(int v3 = 0; v3 < v2; ++v3) {
            ify ify1 = (ify)arr_object1[v3];
            if(ify1.q().h != ify1.g()) {
                ify0.T();
                ify0.J();
                if(ify1.g() == 0x7FFFFFFF) {
                    if(ify1.v.c) {
                        igt igt0 = ify1.p();
                        ibuq.c(igt0);
                        igt0.r(false);
                    }
                    ify1.q().t();
                }
            }
        }
        ihc0.j(igx.a);
        return ibom.a;
    }
}

