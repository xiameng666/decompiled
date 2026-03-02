public final class bykg implements ibts {
    public final gra a;
    public final jhb b;
    public final gra c;

    public bykg(gra gra0, jhb jhb0, gra gra1) {
        this.a = gra0;
        this.b = jhb0;
        this.c = gra1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gra gra0 = this.a;
        gra gra1 = this.c;
        if(((Boolean)object0).booleanValue()) {
            gra0.b(bykh.b(gra1));
            return ibom.a;
        }
        iwj iwj0 = new iwj(bykh.b(gra1));
        gra0.b(this.b.a(iwj0).a.b);
        return ibom.a;
    }
}

