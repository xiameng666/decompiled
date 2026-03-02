public final class dpqx implements fkio {
    @Override  // fkio
    public final gmcd a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fjau.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fjau fjau0 = (fjau)hftp0.b_message;
        fjau0.b |= 0x20;
        fjau0.d = "GddWalletIssuerLocation";
        return gmbu.i(((fjau)hftp0.N_build()));
    }
}

