public final class fdth implements fdtw {
    @Override  // fdtw
    public final MessageLite a(MessageLite hfvm0, hlbb hlbb0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hlaz)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hlaz)hfvm0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlaz hlaz0 = (hlaz)hftp0.b_message;
        hlbb0.getClass();
        hlaz0.c = hlbb0;
        hlaz0.b |= 1;
        return (hlaz)hftp0.N_build();
    }
}

