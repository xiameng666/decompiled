public final class iaxs extends ibcc {
    private boolean b;
    private final iapk c;
    private final iauz d;
    private final ialc[] e;

    public iaxs(iapk iapk0, iauz iauz0, ialc[] arr_ialc) {
        gftb.b(((boolean)(iapk0.h() ^ 1)), "error must not be OK");
        this.c = iapk0;
        this.d = iauz0;
        this.e = arr_ialc;
    }

    public iaxs(iapk iapk0, ialc[] arr_ialc) {
        this(iapk0, iauz.a, arr_ialc);
    }

    @Override  // ibcc
    public final void b(iayp iayp0) {
        iayp0.b("error", this.c);
        iayp0.b("progress", this.d);
    }

    @Override  // ibcc
    public final void m(iava iava0) {
        gftb.r(((boolean)(this.b ^ 1)), "already started");
        this.b = true;
        for(int v = 0; true; ++v) {
            ialc[] arr_ialc = this.e;
            if(v >= arr_ialc.length) {
                break;
            }
            ialc ialc0 = arr_ialc[v];
        }
        iaof_metadata iaof0 = new iaof_metadata();
        iava0.a(this.c, this.d, iaof0);
    }
}

