public final class gbfn extends ibsl implements ibtw {
    int a;
    final gbks b;
    private Object c;

    public gbfn(gbks gbks0, ibrl ibrl0) {
        this.b = gbks0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbfn)this.c(((gbkj)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new gbfn(this.b, ibrl0);
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
            if(((gbkj)this.c).b(new gbks[]{this.b}, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

