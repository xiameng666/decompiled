final class ezra extends ibsl implements ibtw {
    int a;
    final ezrc b;

    public ezra(ezrc ezrc0, ibrl ibrl0) {
        this.b = ezrc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ezra)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ezra(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.b.b(this.b.a, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((byte[])object0) != null) {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ezmc.a), ((byte[])object0), 0, ((byte[])object0).length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (ezmc)hftv0;
        }
        return null;
    }
}

