public final class dcpq implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gyqv)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gyqv)object0))));
        if(hftp0.a_defaultInstance.isImmutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        hftp0.b_message = hftp0.P_newInstance();
        return (gyqv)hftp0.N_build();
    }
}

