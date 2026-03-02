public final class bgwc implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        gxod gxod0 = gxod.b(((gxof)object0).c);
        if(gxod0 == null) {
            gxod0 = gxod.g;
        }
        if(gxod0.equals(gxod.a)) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gxof)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((gxof)object0))));
            gxod gxod1 = gxod.b;
            if(!((gxoc)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gxoc)hftp0))).ensureMutable();
            }
            gxof gxof0 = (gxof)((gxoc)hftp0).b_message;
            gxof0.c = gxod1.a();
            return (gxof)((ProtoLiteBuilder)(((gxoc)hftp0))).N_build();
        }
        return (gxof)object0;
    }
}

