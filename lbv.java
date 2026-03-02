final class lbv extends ibsl implements ibtw {
    int a;
    final lcc b;

    public lbv(lcc lcc0, ibrl ibrl0) {
        this.b = lcc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lbv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new lbv(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                lcc lcc0 = this.b;
                lcd lcd0 = lcc0.d;
                if((lcd0.a() instanceof lcs)) {
                    return lcd0.a();
                }
                try {
                    this.a = 1;
                    if(lcc0.f(this) == object1) {
                        return object1;
                    }
                    break;
                label_12:
                    ibnx.b(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                return new ldo(throwable0, -1);
            }
            case 1: {
                goto label_12;
            }
            default: {
                ibnx.b(object0);
                return (lec)object0;
            }
        }
        this.a = 2;
        object0 = this.b.g(false, this);
        return object0 == object1 ? object1 : ((lec)object0);
    }
}

