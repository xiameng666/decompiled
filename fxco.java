public final class fxco implements gfsi {
    public final fxcp a;
    public final int b;

    public fxco(fxcp fxcp0, int v) {
        this.a = fxcp0;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fxcp fxcp0 = this.a;
        fxcq fxcq0 = fxcp0.b;
        long v = fxcq0.a.m().j();
        gged_interceptors gged0 = ((fvtd)object0).b(fxcq0.a.f().b(), fxcq0.a.mH());
        int v1 = gged0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            fvvj fvvj0 = ((fvta)gged0.get(v2)).a();
            if(fvvj0 == null) {
                ++fxcq0.h;
            }
            else {
                long v3 = fvvj0.m();
                int v4 = Long.compare(v3, v);
                if(v4 < 0) {
                    ++fxcq0.i;
                }
                else if(v4 == 0) {
                    ++fxcq0.j;
                }
                else {
                    ++fxcq0.k;
                }
                v = v3;
            }
        }
        fxcp0.a.a(((fvtd)object0), this.b);
        return (fvtd)object0;
    }
}

