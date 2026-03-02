public final class gbfy extends ibsl implements ibtw {
    int a;
    final gblf b;
    private Object c;

    public gbfy(gblf gblf0, ibrl ibrl0) {
        this.b = gblf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbfy)this.c(((gbla)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new gbfy(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(((gbla)this.c).a(this.b, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

