public final class bjog implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((bjoj)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((bjoj)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((bjoj)hftp0.b_message).b = true;
        return (bjoj)hftp0.N_build();
    }
}

