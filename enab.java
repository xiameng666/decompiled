public final class enab implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((enws)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((enws)object0))));
        if(!((enwo)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((enwo)hftp0))).ensureMutable();
        }
        enws enws0 = (enws)((enwo)hftp0).b_message;
        enws0.b &= -17;
        enws0.i = enws.a.i;
        return (enws)((ProtoLiteBuilder)(((enwo)hftp0))).N_build();
    }
}

