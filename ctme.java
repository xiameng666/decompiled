public final class ctme extends ibsl implements ibtw {
    int a;
    final ctmk b;

    public ctme(ctmk ctmk0, ibrl ibrl0) {
        this.b = ctmk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctme)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctme(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                icig icig0 = this.b.a.b();
                icjo icjo0 = new icjo(new ctln(this.b, null), icig0);
                ctmd ctmd0 = new ctmd(this.b);
                this.a = 1;
                if(icjo0.oR(ctmd0, this) == object1) {
                    return object1;
                }
                goto label_15;
            }
            catch(Throwable throwable0) {
                this.b.a.a("AppCastService");
                throw throwable0;
            }
            return object1;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                this.b.a.a("AppCastService");
                throw throwable0;
            }
        }
    label_15:
        this.b.a.a("AppCastService");
        return ibom.a;
    }
}

