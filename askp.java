final class askp extends ibsl implements ibtw {
    int a;
    final askr b;
    final asdv c;
    final grjo d;

    public askp(askr askr0, asdv asdv0, grjo grjo0, ibrl ibrl0) {
        this.b = askr0;
        this.c = asdv0;
        this.d = grjo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((askp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new askp(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                if(this.b.a(((asdu)this.c).a, askr.c, this.d, this) != object1) {
                    goto label_7;
                }
                break;
            }
            case 1: {
            label_7:
                askr askr0 = this.b;
                do {
                    Object object2 = askr0.j.b();
                    Boolean boolean0 = (Boolean)object2;
                }
                while(!askr0.j.h(object2, Boolean.valueOf(false)));
                this.a = 2;
                asmo asmo0 = new asmo(askr0.d, null);
                Object object3 = icbd.a(askr0.d.e, asmo0, this);
                if(object3 != object1) {
                    object3 = ibom.a;
                }
                if(object3 != object1) {
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

