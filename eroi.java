public final class eroi implements gfsi {
    public final ProtoLiteBuilder a;

    public eroi(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eqok)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eqok)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqok eqok0 = (eqok)hftp0.b_message;
        eqoj eqoj0 = (eqoj)this.a.N_build();
        eqoj0.getClass();
        eqok0.e = eqoj0;
        eqok0.b |= 4;
        return (eqok)hftp0.N_build();
    }
}

