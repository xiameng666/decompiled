public final class fugf implements ibth {
    public final ibth a;
    public final fhvs b;
    public final fhvw c;

    public fugf(ibth ibth0, fhvs fhvs0, fhvw fhvw0) {
        this.a = ibth0;
        this.b = fhvs0;
        this.c = fhvw0;
    }

    @Override  // ibth
    public final Object a() {
        fhvv fhvv0;
        ibth ibth0 = this.a;
        if(ibth0 != null && ibth0.a() != null) {
            fhvt fhvt0 = new fhvt(gltz.e);
            fhvt0.b(((fhvu)ibth0.a()));
            fhvv0 = fhvt0.a();
        }
        else {
            fhvv0 = fhvv.d();
        }
        fhvs fhvs0 = this.b;
        if(fhvs0 != null) {
            this.c.b(fhvv0, fhvs0);
        }
        return ibom.a;
    }
}

