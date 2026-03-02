public final class eoik implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((emls)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((emls)object0))));
        if(!((emlf)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((emlf)hftp0))).ensureMutable();
        }
        ((emls)((emlf)hftp0).b_message).d().clear();
        return (emls)((ProtoLiteBuilder)(((emlf)hftp0))).N_build();
    }
}

