public final class apda implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((apap)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((apap)object0))));
        apao apao0 = apao.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        apap apap0 = (apap)hftp0.b_message;
        apap0.d = apao0.a();
        return (apap)hftp0.N_build();
    }
}

