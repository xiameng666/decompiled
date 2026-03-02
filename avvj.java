public final class avvj implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((avvi)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((avvi)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((avvi)hftp0.b_message).b = true;
        return (avvi)hftp0.N_build();
    }
}

