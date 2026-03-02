public final class gmxs implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gnhb.a).v_newBuilder();
        gnhc gnhc0 = gmxy.c(((gmvr)gmni0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gnhb gnhb0 = (gnhb)hftp1.b_message;
        gnhc0.getClass();
        gnhb0.c = gnhc0;
        gnhb0.b |= 1;
        ByteString hfsf0 = ((gnhb)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).c = hfsf0;
        gnim gnim0 = (gnim)gmxy.g.a(((gmvr)gmni0).e);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

