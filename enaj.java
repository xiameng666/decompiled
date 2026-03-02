public final class enaj implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if((((enws)object0).b & 1) != 0) {
            enxb enxb0 = ((enws)object0).e;
            if(enxb0 == null) {
                enxb0 = enxb.a;
            }
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((enws)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((enws)object0))));
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)enxb0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)enxb0));
            if(!((enwy)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((enwy)hftp1))).ensureMutable();
            }
            ((enxb)((enwy)hftp1).b_message).b().clear();
            enxb enxb1 = (enxb)((ProtoLiteBuilder)(((enwy)hftp1))).N_build();
            if(!((enwo)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((enwo)hftp0))).ensureMutable();
            }
            enws enws0 = (enws)((enwo)hftp0).b_message;
            enxb1.getClass();
            enws0.e = enxb1;
            enws0.b |= 1;
            return (enws)((ProtoLiteBuilder)(((enwo)hftp0))).N_build();
        }
        return (enws)object0;
    }
}

