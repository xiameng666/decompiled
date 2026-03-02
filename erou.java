public final class erou implements gfsi {
    public final int a;

    public erou(int v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eqol)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eqol)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqol eqol0 = (eqol)hftp0.b_message;
        eqol0.b |= 1;
        eqol0.c = this.a;
        return (eqol)hftp0.N_build();
    }
}

