public final class coim implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cobt)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cobt)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((cobt)hftp0.b_message).b().clear();
        return (cobt)hftp0.N_build();
    }
}

