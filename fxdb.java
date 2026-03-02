public final class fxdb {
    public final fwze a;
    public fvuo b;

    public fxdb(fwze fwze0) {
        this.b = new fvuo();
        this.a = fwze0;
    }

    public final void a(fvuc fvuc0, fvuo fvuo0) {
        fvvj fvvj0 = fvuc0.b();
        if(fvvj0 != null) {
            fvtm fvtm0 = fvuc0.a() == null ? fvtm.h(fvvj0.m()) : fvuc0.a();
            if(fvvj0.d() != 0 || fvtm0.i()) {
                fvuo0.d(gged_interceptors.l(fvtm0), gged_interceptors.l(new fvtc(fvvj0, 1)), this.a.mH(), this.a.f().b());
            }
        }
    }
}

