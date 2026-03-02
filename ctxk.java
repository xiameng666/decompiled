final class ctxk extends ibsl implements ibtw {
    int a;
    Object b;
    final ctxs c;

    public ctxk(ctxs ctxs0, ibrl ibrl0) {
        this.c = ctxs0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctxk)this.c(((byte[])object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctxk(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ctzb.a), ((byte[])this.b), 0, ((byte[])this.b).length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((ctzb)hftv0), "parseFrom(...)");
            this.a = 1;
            object0 = this.c.d();
            if(object0 == object1) {
                return object1;
            }
        }
        return ((ctyz)object0).toBytesArray();
    }
}

