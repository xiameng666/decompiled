public final class fxzo implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gwkl)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gwkl)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwkl gwkl0 = (gwkl)hftp0.b_message;
        gwkl0.b |= 1;
        gwkl0.c = true;
        return (gwkl)hftp0.N_build();
    }
}

