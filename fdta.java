public final class fdta implements fdtw {
    @Override  // fdtw
    public final MessageLite a(MessageLite hfvm0, hlbb hlbb0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hlar)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hlar)hfvm0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlar hlar0 = (hlar)hftp0.b_message;
        hlbb0.getClass();
        hlar0.c = hlbb0;
        hlar0.b |= 1;
        return (hlar)hftp0.N_build();
    }
}

