public final class fxmb implements gfsi {
    public final boolean a;

    public fxmb(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gxom)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gxom)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gxom)hftp0.b_message).b = (this.a ? 3 : 4) - 2;
        return (gxom)hftp0.N_build();
    }
}

