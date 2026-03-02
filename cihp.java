public final class cihp implements cdns {
    @Override  // cdns
    public final ProtoLiteMessage a(ProtoLiteMessage hftv0, cdnt cdnt0, int v) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gixy)hftv0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gixy)hftv0))));
        gkwh gkwh0 = ((gixy)hftv0).E;
        if(gkwh0 == null) {
            gkwh0 = gkwh.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gkwh0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gkwh0));
        double f = cdnt0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkwh gkwh1 = (gkwh)hftp1.b_message;
        gkwh1.b |= 1;
        gkwh1.c = f;
        gkwh gkwh2 = (gkwh)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gixy gixy0 = (gixy)hftp0.b_message;
        gkwh2.getClass();
        gixy0.E = gkwh2;
        gixy0.b |= 0x8000000;
        return (gixy)hftp0.N_build();
    }
}

