public final class fjug implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fjci)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fjci)object0))));
        if(!((fjcf)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fjcf)hftp0))).ensureMutable();
        }
        ((fjci)((fjcf)hftp0).b_message).d = hfvv.a;
        return (fjci)((ProtoLiteBuilder)(((fjcf)hftp0))).N_build();
    }
}

