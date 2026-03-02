public final class fmxs implements fmoz {
    public final fmya a;

    public fmxs(fmya fmya0) {
        this.a = fmya0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        fmya fmya0 = this.a;
        if(fmya0.l != null && fmya0.n && fmya0.k.e().i()) {
            fmya0.q = (gged_interceptors)fmya0.k.e().d();
            if(fmya0.o) {
                fmya0.y.N(fmya0.b, fmya0.a);
            }
            int v = fmya0.m;
            boolean z = fmya0.q.size() > v;
            fmya0.r = z;
            if(z) {
                fmya0.q = fmya0.q.b(0, v);
            }
            for(Object object1: fmya0.f.values()) {
                fmeo fmeo0 = (fmeo)((fmpd)object0).a(((fmpa)object1));
                if(fmeo0 != null) {
                    fmya0.s.put(fmeo0.a, fmeo0);
                }
            }
            fmya0.d();
        }
    }
}

