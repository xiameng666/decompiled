public final class fdsu implements fdtw {
    @Override  // fdtw
    public final MessageLite a(MessageLite hfvm0, hlbb hlbb0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hlay)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hlay)hfvm0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlay hlay0 = (hlay)hftp0.b_message;
        hlbb0.getClass();
        hlay0.c = hlbb0;
        hlay0.b |= 1;
        return (hlay)hftp0.N_build();
    }
}

