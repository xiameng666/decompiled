final class om implements nm {
    final oo a;

    public om(oo oo0) {
        this.a = oo0;
        super();
    }

    @Override  // nm
    public final void a(na na0, boolean z) {
        if((na0 instanceof nv)) {
            na0.a().i(false);
        }
        nm nm0 = this.a.e;
        if(nm0 != null) {
            nm0.a(na0, z);
        }
    }

    @Override  // nm
    public final boolean b(na na0) {
        oo oo0 = this.a;
        if(na0 != oo0.c) {
            oo0.p = ((nv)na0).m.a;
            return oo0.e == null ? false : oo0.e.b(na0);
        }
        return false;
    }
}

