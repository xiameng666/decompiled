final class rty extends ibsl implements ibtw {
    int a;
    Object b;
    final ryh c;

    public rty(ryh ryh0, ibrl ibrl0) {
        this.c = ryh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rty)this.c(((sah)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new rty(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        Object object2 = ((sah)this.b).ff(this.c, this);
        return object2 == object1 ? object1 : object2;
    }
}

