public final class bgil implements gfsi {
    public final gfsi a;

    public bgil(gfsi gfsi0) {
        this.a = gfsi0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((heqb)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((heqb)object0))));
        hept hept0 = ((heqb)object0).s;
        if(hept0 == null) {
            hept0 = hept.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hept0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)hept0));
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)this.a.apply(hftp1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        heqb heqb0 = (heqb)hftp0.b_message;
        hept hept1 = (hept)hftp2.N_build();
        hept1.getClass();
        heqb0.s = hept1;
        heqb0.b |= 0x40000;
        return (heqb)hftp0.N_build();
    }
}

