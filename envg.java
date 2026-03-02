public final class envg implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((emit)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((emit)object0))));
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        if(!((emis)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emis)hftp0))).ensureMutable();
        }
        emit emit0 = (emit)((emis)hftp0).b_message;
        hfwn0.getClass();
        emit0.e = hfwn0;
        emit0.b |= 4;
        if(!((emis)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emis)hftp0))).ensureMutable();
        }
        ((emit)((emis)hftp0).b_message).c = 4;
        ((emit)((emis)hftp0).b_message).b |= 1;
        return (emit)((ProtoLiteBuilder)(((emis)hftp0))).N_build();
    }
}

