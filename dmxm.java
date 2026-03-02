public final class dmxm implements ibth {
    public final dmyx a;
    public final gra b;
    public final gui c;

    public dmxm(dmyx dmyx0, gra gra0, gui gui0) {
        this.a = dmyx0;
        this.b = gra0;
        this.c = gui0;
    }

    @Override  // ibth
    public final Object a() {
        if(!dmyx.N(this.c)) {
            this.a.B().f(this.a.av, hkid.k).z(dmyb.a);
            return ibom.a;
        }
        this.b.b(Boolean.valueOf(true));
        return ibom.a;
    }
}

