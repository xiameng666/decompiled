public final class envk implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((emit)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((emit)object0))));
        if(!((emis)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emis)hftp0))).ensureMutable();
        }
        ((emit)((emis)hftp0).b_message).i = hfvv.a;
        return (emit)((ProtoLiteBuilder)(((emis)hftp0))).N_build();
    }
}

