final class ctkq extends ibsl implements ibtw {
    int a;
    final icih b;

    public ctkq(icih icih0, ibrl ibrl0) {
        this.b = icih0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctkq)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctkq(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cubs cubs0 = cubr.a(((ProtoLiteMessage)ctze.a).v_newBuilder());
            cubs0.b(hfxt.a(new byte[0]));
            ctze ctze0 = cubs0.a();
            this.a = 1;
            if(this.b.a(ctze0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

