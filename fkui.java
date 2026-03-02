public final class fkui implements gfsi {
    public final fkvi a;

    public fkui(fkvi fkvi0) {
        this.a = fkvi0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(fkvi.k(((fkvu)object0))) {
            gssv gssv0 = ((fkvu)object0).c;
            if(gssv0 == null) {
                gssv0 = gssv.a;
            }
            return gfsx.m(gssv0);
        }
        return this.a.a();
    }
}

