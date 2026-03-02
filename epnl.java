final class epnl extends ibsl implements ibtw {
    Object a;
    final int b;

    public epnl(int v, ibrl ibrl0) {
        this.b = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epnl)this.c(((ProtoLiteBuilder)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epnl(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        epoo epoo0 = (epoo)hftp0.b_message;
        epoo0.b |= 1;
        epoo0.c = this.b;
        Object object1 = hftp0.N_build();
        ibuq.e(object1, "build(...)");
        return object1;
    }
}

