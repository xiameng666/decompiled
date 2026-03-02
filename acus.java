public final class acus implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((adrv)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((adrv)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((adrv)hftp0.b_message).b = hfvv.a;
        return (adrv)hftp0.N_build();
    }
}

