final class ftwj extends ibsl implements ibtw {
    int a;
    final hix b;

    public ftwj(hix hix0, ibrl ibrl0) {
        this.b = hix0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ftwj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ftwj(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                this.a = 1;
                if(iccv.c(100L, this) == object1) {
                    return object1;
                }
            label_8:
                hix.b(this.b);
            }
            catch(Exception unused_ex) {
            }
            return ibom.a;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Exception unused_ex) {
                return ibom.a;
            }
        }
        goto label_8;
    }
}

