public final class dyco implements gfsi {
    public final String a;

    public dyco(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eudq)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eudq)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eudq eudq0 = (eudq)hftp0.b_message;
        this.a.getClass();
        eudq0.b |= 0x400;
        eudq0.l = this.a;
        return (eudq)hftp0.N_build();
    }
}

