final class rtk extends ibsl implements ibtw {
    int a;
    final ryh b;
    private Object c;

    public rtk(ryh ryh0, ibrl ibrl0) {
        this.b = ryh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rtk)this.c(((sag)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new rtk(this.b, ibrl0);
        ibrl1.c = object0;
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
        Object object2 = ((sag)this.c).ff(this.b, this);
        return object2 == object1 ? object1 : object2;
    }
}

