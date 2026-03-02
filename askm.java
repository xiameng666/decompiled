final class askm extends ibsl implements ibtw {
    int a;
    final boolean b;
    final askr c;

    public askm(boolean z, askr askr0, ibrl ibrl0) {
        this.b = z;
        this.c = askr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((askm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new askm(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            if(this.b) {
                this.a = 1;
                Object object2 = this.c.e.b(true, this);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
                if(object2 == object1) {
                    return object1;
                }
            }
            else {
                this.a = 2;
                if(this.c.e.a(this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

