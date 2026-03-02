final class askq extends ibsl implements ibtw {
    int a;
    final askr b;
    final asdv c;
    final grjo d;

    public askq(askr askr0, asdv asdv0, grjo grjo0, ibrl ibrl0) {
        this.b = askr0;
        this.c = asdv0;
        this.d = grjo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((askq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new askq(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                if(this.b.a(((asdu)this.c).a, askr.b, this.d, this) != object1) {
                    goto label_7;
                }
                break;
            }
            case 1: {
            label_7:
                this.a = 2;
                asmp asmp0 = new asmp(this.b.d, ((asdu)this.c).a, null);
                Object object2 = icbd.a(this.b.d.e, asmp0, this);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
                if(object2 != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                return ibom.a;
            }
        }
        return object1;
    }
}

