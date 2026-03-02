final class ctya extends ibsl implements ibtw {
    int a;
    Object b;
    final ctye c;

    public ctya(ctye ctye0, ibrl ibrl0) {
        this.c = ctye0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctya)this.c(((byte[])object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctya(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)cuai.a), ((byte[])this.b), 0, ((byte[])this.b).length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((cuai)hftv0), "parseFrom(...)");
            this.a = 1;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cuaj.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            ProtoLiteMessage hftv1 = hftp0.N_build();
            ibuq.e(hftv1, "build(...)");
            object0 = (cuaj)hftv1;
            if(object0 == object1) {
                return object1;
            }
        }
        return ((cuaj)object0).toBytesArray();
    }
}

