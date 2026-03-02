public final class ashz implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((aqhl)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((aqhl)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqhl aqhl0 = (aqhl)hftp0.b_message;
        aqhl0.b &= -2;
        aqhl0.c = false;
        return (aqhl)hftp0.N_build();
    }
}

