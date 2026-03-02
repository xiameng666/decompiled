public final class apcr implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((apap)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((apap)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((apap)hftp0.b_message).l = false;
        return (apap)hftp0.N_build();
    }
}

