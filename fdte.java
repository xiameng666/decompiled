public final class fdte implements fdtw {
    @Override  // fdtw
    public final MessageLite a(MessageLite hfvm0, hlbb hlbb0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hlbd)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hlbd)hfvm0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlbd hlbd0 = (hlbd)hftp0.b_message;
        hlbb0.getClass();
        hlbd0.c = hlbb0;
        hlbd0.b |= 1;
        return (hlbd)hftp0.N_build();
    }
}

