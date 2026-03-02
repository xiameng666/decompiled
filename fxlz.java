public final class fxlz implements gfsi {
    public final gxol a;

    public fxlz(gxol gxol0) {
        this.a = gxol0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gxom)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gxom)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxom gxom0 = (gxom)hftp0.b_message;
        gxom0.d = this.a.a();
        return (gxom)hftp0.N_build();
    }
}

