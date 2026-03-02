final class cbhj extends ibsl implements ibtw {
    int a;
    final cbhk b;
    final String c;

    public cbhj(cbhk cbhk0, String s, ibrl ibrl0) {
        this.b = cbhk0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbhj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbhj(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cbij cbij0 = this.b.ae();
            this.a = 1;
            object0 = cbij0.e(this.c, this);
            if(object0 == object1) {
                return object1;
            }
        }
        Boolean boolean0 = (Boolean)object0;
        return ibom.a;
    }
}

