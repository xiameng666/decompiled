public final class fdtc implements fdtw {
    @Override  // fdtw
    public final MessageLite a(MessageLite hfvm0, hlbb hlbb0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hlbc)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hlbc)hfvm0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlbc hlbc0 = (hlbc)hftp0.b_message;
        hlbb0.getClass();
        hlbc0.c = hlbb0;
        hlbc0.b |= 1;
        return (hlbc)hftp0.N_build();
    }
}

