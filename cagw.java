final class cagw extends ibsl implements ibts {
    int a;
    final cahe b;
    final cage c;

    public cagw(cahe cahe0, cage cage0, ibrl ibrl0) {
        this.b = cahe0;
        this.c = cage0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new cagw(this.b, this.c, ((ibrl)object0)).jI(ibom.a);
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
        Object object2 = this.b.b.a(new Long(this.c.a), this);
        return object2 == object1 ? object1 : object2;
    }
}

