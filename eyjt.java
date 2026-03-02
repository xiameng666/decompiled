final class eyjt extends ibsl implements ibtw {
    int a;
    final eyjw b;
    final exwv c;
    final eygi d;
    final icbr e;

    public eyjt(eyjw eyjw0, exwv exwv0, icbr icbr0, eygi eygi0, ibrl ibrl0) {
        this.b = eyjw0;
        this.c = exwv0;
        this.e = icbr0;
        this.d = eygi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyjt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyjt(this.b, this.c, this.e, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                object0 = this.b.m(this.c, this.e, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                break;
            }
            default: {
                return object0;
            }
        }
        Object object2 = (eyja)((ibns)object0).a;
        eyce eyce0 = (eyce)((ibns)object0).b;
        if(object2.a == eyjx.a) {
            ibuq.c(object2.d);
            ibuq.c(eyce0);
            this.a = 2;
            Object object3 = this.b.e(this.c, this.d, eyce0, object2.d, object2.f, this);
            return object3 == object1 ? object1 : object3;
        }
        this.b.j();
        return object2;
    }
}

