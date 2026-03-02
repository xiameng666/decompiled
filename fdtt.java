public final class fdtt implements fdtw {
    @Override  // fdtw
    public final MessageLite a(MessageLite hfvm0, hlbb hlbb0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hlax)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hlax)hfvm0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlax hlax0 = (hlax)hftp0.b_message;
        hlbb0.getClass();
        hlax0.c = hlbb0;
        hlax0.b |= 1;
        return (hlax)hftp0.N_build();
    }
}

