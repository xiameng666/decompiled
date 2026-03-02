public final class fkuo implements glzn {
    public final fkvi a;
    public final fkuf b;
    public final int c;

    public fkuo(fkvi fkvi0, fkuf fkuf0, int v) {
        this.a = fkvi0;
        this.b = fkuf0;
        this.c = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        boolean z = fkvi.k(((fkvu)object0));
        fkvi fkvi0 = this.a;
        if(z && fkvi.j(((fkvu)object0))) {
            fkyz fkyz0 = fkvi0.f;
            fkvt fkvt0 = ((fkvu)object0).d;
            if(fkvt0 == null) {
                fkvt0 = fkvt.a;
            }
            gdta gdta0 = gdta.g(fkyz0.a(fkvt0, this.c)).h(new fkvf(), gmap.a);
            fkuk fkuk0 = new fkuk();
            return gdta0.e(Exception.class, fkuk0, gmap.a).i(new fkul(fkvi0, ((fkvu)object0), this.b), gmap.a);
        }
        return gmbu.i(fkvi0.a());
    }
}

