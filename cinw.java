public final class cinw implements cdns {
    @Override  // cdns
    public final ProtoLiteMessage a(ProtoLiteMessage hftv0, cdnt cdnt0, int v) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ghyl)hftv0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ghyl)hftv0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghyl ghyl0 = (ghyl)hftp0.b_message;
        ghyl0.b |= 0x200;
        ghyl0.k = cdnt0.a;
        return (ghyl)hftp0.N_build();
    }
}

