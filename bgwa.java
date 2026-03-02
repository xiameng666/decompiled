public final class bgwa implements gfsi {
    public final gxod a;

    public bgwa(gxod gxod0) {
        this.a = gxod0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gxof)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gxof)object0))));
        if(!((gxoc)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gxoc)hftp0))).ensureMutable();
        }
        gxof gxof0 = (gxof)((gxoc)hftp0).b_message;
        gxof0.c = this.a.a();
        return (gxof)((ProtoLiteBuilder)(((gxoc)hftp0))).N_build();
    }
}

