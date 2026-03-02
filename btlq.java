public final class btlq implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((btno)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((btno)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        btno btno0 = (btno)hftp0.b_message;
        btno0.b &= -2;
        btno0.c = false;
        return (btno)hftp0.N_build();
    }
}

