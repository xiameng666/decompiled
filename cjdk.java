final class cjdk extends ibsl implements ibtw {
    int a;
    final cjdm b;
    final cjdi c;
    final ibuz d;

    public cjdk(cjdm cjdm0, cjdi cjdi0, ibuz ibuz0, ibrl ibrl0) {
        this.b = cjdm0;
        this.c = cjdi0;
        this.d = ibuz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cjdk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cjdk(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            try {
                ibnx.b(object0);
                this.d.a = true;
                return ibom.a;
            }
            catch(Exception exception0) {
                goto label_13;
            }
        }
        ibnx.b(object0);
        Object object2 = this.b.a;
        if(object2 != null) {
            try {
                this.a = 1;
                if(this.c.c(object2) == object1) {
                    return object1;
                }
                this.d.a = true;
            }
            catch(Exception exception0) {
            label_13:
                if((exception0 instanceof RuntimeException)) {
                    throw exception0;
                }
                this.b.d(exception0);
            }
            return ibom.a;
        }
        return ibom.a;
    }
}

