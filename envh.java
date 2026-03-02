public final class envh implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((emit)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((emit)object0))));
        if(!((emis)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emis)hftp0))).ensureMutable();
        }
        emit emit0 = (emit)((emis)hftp0).b_message;
        emit0.b |= 0x100;
        emit0.m = true;
        if(!((emis)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emis)hftp0))).ensureMutable();
        }
        ((emit)((emis)hftp0).b_message).c = 4;
        ((emit)((emis)hftp0).b_message).b |= 1;
        return (emit)((ProtoLiteBuilder)(((emis)hftp0))).N_build();
    }
}

