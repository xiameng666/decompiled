final class ctvn extends ibsl implements ibtw {
    int a;
    final ctvs b;
    final ykf c;

    public ctvn(ctvs ctvs0, ykf ykf0, ibrl ibrl0) {
        this.b = ctvs0;
        this.c = ykf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctvn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctvn(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            ibuq.f(this.c, "client");
            ((ggtj)this.b.b.h()).x("Starting to listen to incoming notifications");
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cuau.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((cuau)hftv0), "request");
            byte[] arr_b = ((cuau)hftv0).toBytesArray();
            Object object2 = new cubc(this.c.h("NotificationSyncRpcService", "ReadNotificationShadeEvents", arr_b)).oR(new ctvq(this.c, this.b), this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

