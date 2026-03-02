final class dfnx extends ibsl implements ibtw {
    int a;
    final dfny b;
    final ddag c;
    private Object d;

    public dfnx(dfny dfny0, ddag ddag0, ibrl ibrl0) {
        this.b = dfny0;
        this.c = ddag0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dfnx)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dfnx(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                this.a = 1;
                if(((icih)this.d).a(dfoi.a, this) == object1) {
                    return object1;
                }
                goto label_9;
            }
            case 1: {
                ibnx.b(object0);
            label_9:
                dfnw dfnw0 = this.b.a;
                if((dfnw0 instanceof dfnt)) {
                    this.a = 2;
                    if(this.c.c(this) == object1) {
                        return object1;
                    }
                    goto label_21;
                }
                else if((dfnw0 instanceof dfnu)) {
                    this.a = 5;
                    if(this.c.c(this) == object1) {
                        return object1;
                    }
                    goto label_29;
                }
                else if(!(dfnw0 instanceof dfnv)) {
                    throw new ibnq();
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
            label_21:
                this.a = 3;
                if(this.c.m(1, this) == object1) {
                    return object1;
                }
                goto label_25;
            }
            case 3: {
                ibnx.b(object0);
            label_25:
                this.a = 4;
                if(this.c.a(this) == object1) {
                    return object1;
                }
                break;
            }
            case 5: {
                ibnx.b(object0);
            label_29:
                this.a = 6;
                if(this.c.m(4, this) == object1) {
                    return object1;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return ibom.a;
    }
}

