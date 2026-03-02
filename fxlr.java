public final class fxlr implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gxom)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gxom)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gxom)hftp0.b_message).c = true;
        return (gxom)hftp0.N_build();
    }
}

