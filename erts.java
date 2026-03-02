public final class erts extends ibsl implements ibtx {
    int a;
    Object b;
    final String c;
    final ertu d;
    final ibvd e;
    private Object f;

    public erts(ibrl ibrl0, String s, ertu ertu0, ibvd ibvd0) {
        this.c = s;
        this.d = ertu0;
        this.e = ibvd0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        erts erts0 = new erts(((ibrl)object2), this.c, this.d, this.e);
        erts0.f = (icih)object0;
        erts0.b = object1;
        return erts0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.f;
            icht icht0 = new icht(new ertt(this.c, this.d, ((erto)this.b), this.e, null));
            this.a = 1;
            if(icir.c(((icih)object2), icht0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

