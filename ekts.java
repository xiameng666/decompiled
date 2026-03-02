public final class ekts extends ibsl implements ibtw {
    int a;

    public ekts(ibrl ibrl0) {
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        icck icck0 = (icck)object0;
        return new ekts(((ibrl)object1)).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ekts(ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            return ektw.a.b(this) == object1 ? object1 : null;
        }
        return null;
    }
}

