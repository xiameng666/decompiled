final class ctxl extends ibsl implements ibtw {
    int a;
    Object b;
    final ctxs c;

    public ctxl(ctxs ctxs0, ibrl ibrl0) {
        this.c = ctxs0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctxl)this.c(((byte[])object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctxl(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ctzc.a), ((byte[])this.b), 0, ((byte[])this.b).length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((ctzc)hftv0), "parseFrom(...)");
            this.a = 1;
            object0 = this.c.e(((ctzc)hftv0));
            if(object0 == object1) {
                return object1;
            }
        }
        return ((ctzd)object0).toBytesArray();
    }
}

