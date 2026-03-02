public final class erom implements gfsi {
    public final byte a;

    public erom(byte b) {
        this.a = b;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eqok)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eqok)object0))));
        eqoi eqoi0 = this.a == 1 ? eqoi.b : eqoi.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqok eqok0 = (eqok)hftp0.b_message;
        eqok0.d = eqoi0.a();
        eqok0.b |= 2;
        return (eqok)hftp0.N_build();
    }
}

