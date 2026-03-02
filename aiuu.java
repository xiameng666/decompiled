public final class aiuu implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajba)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ajba)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ajba)hftp0.b_message).c = null;
        ((ajba)hftp0.b_message).b &= -2;
        return (ajba)hftp0.N_build();
    }
}

