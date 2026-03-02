final class fxcv implements fvtb {
    public int a;
    public int b;
    public int c;
    private final fwyd d;
    private final fvrf e;
    private final fvtk f;
    private final fvqd g;
    private final fvwz h;

    public fxcv(fwyd fwyd0, fvrf fvrf0, fvtk fvtk0, fvqd fvqd0, fvwz fvwz0) {
        this.d = fwyd0;
        this.e = fvrf0;
        this.f = fvtk0;
        this.g = fvqd0;
        this.h = fvwz0;
    }

    @Override  // fvtb
    public final void a(fvtd fvtd0, int v) {
        gged_interceptors gged0 = fvtd0.b(this.d.b(), this.h);
        int v1 = gged0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            fvta fvta0 = (fvta)gged0.get(v2);
            fvvj fvvj0 = fvta0.a();
            fvtm fvtm0 = fvta0.b;
            long v3 = fvtm0.f;
            if(v3 == 0L) {
                ++this.c;
                v3 = 0L;
            }
            if(fvvj0 == null) {
                ++this.a;
                this.b(fvtm0);
            }
            else {
                if(fvvj0.m() == 0L) {
                    ++this.b;
                }
                if(fvvj0.m() > v3) {
                    this.b(fvtm0);
                    this.c(fvvj0);
                }
                else {
                    this.c(fvvj0);
                    this.b(fvtm0);
                }
            }
        }
    }

    private final void b(fvtm fvtm0) {
        this.e.g();
        long v = this.d.b();
        this.f.c(v, fvtm0);
        this.g.d(fvtm0);
    }

    private final void c(fvvj fvvj0) {
        this.g.p(fvvj0);
    }
}

