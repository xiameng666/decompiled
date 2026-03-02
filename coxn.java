public final class coxn implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cpfi)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cpfi)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((cpfi)hftp0.b_message).c = null;
        ((cpfi)hftp0.b_message).b &= -2;
        return (cpfi)hftp0.N_build();
    }
}

