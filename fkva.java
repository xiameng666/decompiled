public final class fkva implements glzn {
    public final fkvi a;
    public final fkuf b;
    public final int c;

    public fkva(fkvi fkvi0, fkuf fkuf0, int v) {
        this.a = fkvi0;
        this.b = fkuf0;
        this.c = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        boolean z = fkvi.k(((fkvu)object0));
        fkvi fkvi0 = this.a;
        fkuf fkuf0 = this.b;
        int v = this.c;
        if(z && fkvi.j(((fkvu)object0))) {
            fkyz fkyz0 = fkvi0.f;
            fkvt fkvt0 = ((fkvu)object0).d;
            if(fkvt0 == null) {
                fkvt0 = fkvt.a;
            }
            gdta gdta0 = gdta.g(fkyz0.a(fkvt0, v)).h(new fkvf(), gmap.a);
            fkvg fkvg0 = new fkvg();
            return gdta0.e(Exception.class, fkvg0, gmap.a).i(new fkvh(fkvi0, ((fkvu)object0), fkuf0, v), gmap.a);
        }
        return fkvi0.b(fkuf0, v);
    }
}

