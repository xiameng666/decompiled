final class dlot extends ibsl implements ibtw {
    int a;
    final frli b;

    public dlot(frli frli0, ibrl ibrl0) {
        this.b = frli0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlot)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dlot(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = ftqa.a(this.b, this);
            if(object0 == object1) {
                return object1;
            }
        }
        switch(((dxgc)object0).b) {
            case 0: {
                object2 = dxgb.a;
                break;
            }
            case 1: {
                object2 = dxgb.b;
                break;
            }
            default: {
                object2 = null;
            }
        }
        return object2 == null ? dxgb.c : object2;
    }
}

