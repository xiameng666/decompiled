final class dfqq extends ibsl implements ibtw {
    int a;
    final dfqr b;
    final ddag c;

    public dfqq(dfqr dfqr0, ddag ddag0, ibrl ibrl0) {
        this.b = dfqr0;
        this.c = ddag0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dfqq)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dfqq(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        if(v == 0) {
            ibnx.b(object0);
            if(this.b.a) {
                this.a = 1;
                if(this.c.c(this) == object1) {
                    return object1;
                }
            label_10:
                this.a = 2;
                if(this.c.q(this) == object1) {
                    return object1;
                }
            }
            else {
                this.a = 3;
                if(this.c.p(this) == object1) {
                    return object1;
                }
            }
        }
        else {
            ibnx.b(object0);
            if(v == 1) {
                goto label_10;
            }
            return ibom.a;
        }
        return ibom.a;
    }
}

