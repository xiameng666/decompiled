public final class erwi extends ibsl implements ibtx {
    int a;
    Object b;
    final erwq c;
    private Object d;

    public erwi(ibrl ibrl0, erwq erwq0) {
        this.c = erwq0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        erwi erwi0 = new erwi(((ibrl)object2), this.c);
        erwi0.d = (icih)object0;
        erwi0.b = object1;
        return erwi0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.d;
            erve erve0 = (erve)this.b;
            icig icig0 = this.c.n.a();
            this.a = 1;
            if(icir.c(((icih)object2), icig0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

