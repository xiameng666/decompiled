final class betv extends ibsl implements ibtw {
    Object a;
    final boolean b;

    public betv(boolean z, ibrl ibrl0) {
        this.b = z;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((betv)this.c(((bgov)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new betv(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        bgov bgov0 = (bgov)this.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bgov0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)bgov0));
        bgox bgox0 = bgow.a(hftp0);
        ProtoLiteBuilder hftp1 = bgox0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        bgov bgov1 = (bgov)hftp1.b_message;
        bgov1.b |= 2;
        bgov1.e = this.b;
        return bgox0.a();
    }
}

