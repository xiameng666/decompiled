public final class fkun implements glzn {
    public final fkvi a;
    public final fkuf b;
    public final int c;

    public fkun(fkvi fkvi0, fkuf fkuf0, int v) {
        this.a = fkvi0;
        this.b = fkuf0;
        this.c = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!fkvi.l(((fkvu)object0), this.b)) {
            return gmbu.h(new fkug());
        }
        fkvi fkvi0 = this.a;
        fkvt fkvt0 = ((fkvu)object0).d;
        if(fkvt0 == null) {
            fkvt0 = fkvt.a;
        }
        return fkvi0.f.a(fkvt0, this.c);
    }
}

