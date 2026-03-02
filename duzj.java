public final class duzj implements ibth {
    public final duzo a;
    public final hkas b;

    public duzj(duzo duzo0, hkas hkas0) {
        this.a = duzo0;
        this.b = hkas0;
    }

    @Override  // ibth
    public final Object a() {
        hjzq hjzq0 = this.b.c == null ? hjzq.a : this.b.c;
        hjzl hjzl0 = hjzq0.b == null ? hjzl.a : hjzq0.b;
        duzo duzo0 = this.a;
        switch((hkbm.a(hjzl0.f) == 0 ? 1 : hkbm.a(hjzl0.f)) - 2) {
            case 1: {
                duzo0.y(hwpi.f());
                return ibom.a;
            }
            case 2: {
                hwfe.c();
                duzo0.y(hwfe.a.b().b());
                return ibom.a;
            }
            default: {
                return ibom.a;
            }
        }
    }
}

