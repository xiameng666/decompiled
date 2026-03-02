public final class rsi extends ibsl implements ibtw {
    Object a;
    final String b;

    public rsi(String s, ibrl ibrl0) {
        this.b = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rsi)this.c(((rsn)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new rsi(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        rsn rsn0 = (rsn)this.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)rsn0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)rsn0));
        String s = this.b;
        s.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        rsn rsn1 = (rsn)hftp0.b_message;
        hfvh hfvh0 = rsn1.b;
        if(!hfvh0.b) {
            rsn1.b = hfvh0.a();
        }
        rsn1.b.remove(s);
        Object object1 = hftp0.N_build();
        ibuq.e(object1, "build(...)");
        return object1;
    }
}

