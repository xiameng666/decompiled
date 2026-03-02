final class ddes extends ibsl implements ibtw {
    int a;
    final hix b;

    public ddes(hix hix0, ibrl ibrl0) {
        this.b = hix0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ddes)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ddes(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(iccv.c(200L, this) == object1) {
                return object1;
            }
        }
        try {
            hix.b(this.b);
        }
        catch(IllegalStateException unused_ex) {
        }
        return ibom.a;
    }
}

