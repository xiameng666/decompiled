final class cbow extends ibsl implements ibtw {
    int a;
    final cbpb b;
    private Object c;

    public cbow(cbpb cbpb0, ibrl ibrl0) {
        this.b = cbpb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbow)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cbow(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        cbov cbov0;
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            cbov0 = new cbov(((ichm)this.c), this.b);
            try {
                this.b.e.registerSessionCallback(cbov0);
                this.c = cbov0;
                this.a = 1;
                if(iccv.b(this) == object1) {
                    return object1;
                }
            }
            catch(Throwable throwable0) {
                this.b.e.unregisterSessionCallback(cbov0);
                throw throwable0;
            }
        }
        else {
            cbov0 = (cbov)this.c;
            try {
                ibnx.b(object0);
                throw new ibnm();
            }
            catch(Throwable throwable0) {
                this.b.e.unregisterSessionCallback(cbov0);
                throw throwable0;
            }
        }
        throw new ibnm();
    }
}

