final class lbq extends ibsl implements ibts {
    Object a;
    int b;
    final lcc c;

    public lbq(lcc lcc0, ibrl ibrl0) {
        this.c = lcc0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new lbq(this.c, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                try {
                    this.b = 1;
                    object0 = this.c.i(true, this);
                    if(object0 != object1) {
                        return new ibns(((lec)object0), Boolean.valueOf(true));
                    label_10:
                        ibnx.b(object0);
                        return new ibns(((lec)object0), Boolean.valueOf(true));
                    }
                    return object1;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_10;
            }
            default: {
                Object object2 = this.a;
                ibnx.b(object0);
                return new ibns(new ldo(((Throwable)object2), ((Number)object0).intValue()), Boolean.valueOf(true));
            }
        }
        lct lct0 = this.c.c();
        this.a = throwable0;
        this.b = 2;
        Object object3 = lct0.a(this);
        return object3 != object1 ? new ibns(new ldo(throwable0, ((Number)object3).intValue()), Boolean.valueOf(true)) : object1;
    }
}

