public final class akas implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        long v = System.currentTimeMillis();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajwt)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ajwt)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ajwt)hftp0.b_message).f = v;
        return (ajwt)hftp0.N_build();
    }
}

