public final class fdtp implements fdtw {
    @Override  // fdtw
    public final MessageLite a(MessageLite hfvm0, hlbb hlbb0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hlbe)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hlbe)hfvm0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlbe hlbe0 = (hlbe)hftp0.b_message;
        hlbb0.getClass();
        hlbe0.c = hlbb0;
        hlbe0.b |= 1;
        return (hlbe)hftp0.N_build();
    }
}

