final class buvb extends ibsl implements ibtw {
    Object a;
    final String b;

    public buvb(String s, ibrl ibrl0) {
        this.b = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buvb)this.c(((buye)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new buvb(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        buye buye0 = (buye)this.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)buye0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)buye0));
        buyg buyg0 = buyf.a(hftp0);
        ProtoLiteBuilder hftp1 = buyg0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        String s = this.b;
        buye buye1 = (buye)hftp1.b_message;
        buye1.b |= 1;
        if(s == null) {
            s = "";
        }
        buye1.c = s;
        return buyg0.a();
    }
}

