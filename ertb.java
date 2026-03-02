final class ertb extends ibsl implements ibtw {
    int a;
    Object b;
    final ibnf c;

    public ertb(ibnf ibnf0, ibrl ibrl0) {
        this.c = ibnf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ertb)this.c(((String)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ertb(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return new ibnw(((ibnw)object0).a);
        }
        String s = (String)this.b;
        ersz ersz0 = ((erta)this.c).a();
        this.a = 1;
        Object object2 = ersz.a(ersz0, s, this);
        return object2 == object1 ? object1 : new ibnw(object2);
    }
}

