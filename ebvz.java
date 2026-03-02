public final class ebvz implements dypn {
    @Override  // dypn
    public final dylc a(dylc dylc0, dylc dylc1) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dylc0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)dylc0));
        dymg dymg0 = dylc1.e == null ? dymg.a : dylc1.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dylc dylc2 = (dylc)hftp0.b_message;
        dymg0.getClass();
        dylc2.e = dymg0;
        dylc2.b |= 4;
        return (dylc)hftp0.N_build();
    }
}

