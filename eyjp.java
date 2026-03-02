public final class eyjp extends ibsl implements ibtw {
    int a;
    final eyjw b;

    public eyjp(eyjw eyjw0, ibrl ibrl0) {
        this.b = eyjw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyjp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyjp(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                object0 = this.b.d(this);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
            case 1: {
                break;
            }
            default: {
                return ibom.a;
            }
        }
        if(((exwv)object0) != null) {
            eygk eygk0 = this.b.i.a(((exwv)object0).d);
            this.a = 2;
            if(this.b.h(((exwv)object0), eygk0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

