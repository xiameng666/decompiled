public final class djax implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dcjb)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dcjb)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dcjb)hftp0.b_message).b().clear();
        return (dcjb)hftp0.N_build();
    }
}

