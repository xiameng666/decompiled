public final class enad implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        enxi enxi0 = ((enws)object0).f;
        if(enxi0 == null) {
            enxi0 = enxi.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)enxi0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)enxi0));
        if(!((enxh)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((enxh)hftp0))).ensureMutable();
        }
        ((enxi)((enxh)hftp0).b_message).d = hfvv.a;
        enxi enxi1 = (enxi)((ProtoLiteBuilder)(((enxh)hftp0))).N_build();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((enws)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((enws)object0))));
        if(!((enwo)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((enwo)hftp1))).ensureMutable();
        }
        enws enws0 = (enws)((enwo)hftp1).b_message;
        enxi1.getClass();
        enws0.f = enxi1;
        enws0.b |= 2;
        return (enws)((ProtoLiteBuilder)(((enwo)hftp1))).N_build();
    }
}

