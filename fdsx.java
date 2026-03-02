public final class fdsx implements fdtw {
    @Override  // fdtw
    public final MessageLite a(MessageLite hfvm0, hlbb hlbb0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hlau)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hlau)hfvm0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlau hlau0 = (hlau)hftp0.b_message;
        hlbb0.getClass();
        hlau0.c = hlbb0;
        hlau0.b |= 1;
        return (hlau)hftp0.N_build();
    }
}

