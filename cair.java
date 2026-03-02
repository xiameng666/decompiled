final class cair extends ibsl implements ibtw {
    int a;
    final caiy b;
    final String c;

    public cair(caiy caiy0, String s, ibrl ibrl0) {
        this.b = caiy0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cair)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cair(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.b(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

