public final class dxyv implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dygd)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dygd)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dygd)hftp0.b_message).c = null;
        ((dygd)hftp0.b_message).b &= -2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dygd)hftp0.b_message).e = 0L;
        return (dygd)hftp0.N_build();
    }
}

