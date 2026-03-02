public final class fdtk implements fdtw {
    @Override  // fdtw
    public final MessageLite a(MessageLite hfvm0, hlbb hlbb0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hlas)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hlas)hfvm0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlas hlas0 = (hlas)hftp0.b_message;
        hlbb0.getClass();
        hlas0.c = hlbb0;
        hlas0.b |= 1;
        return (hlas)hftp0.N_build();
    }
}

