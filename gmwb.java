public final class gmwb implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gnhv.a).v_newBuilder();
        gnhw gnhw0 = gmwh.b(((gmvz)gmni0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gnhv gnhv0 = (gnhv)hftp1.b_message;
        gnhw0.getClass();
        gnhv0.c = gnhw0;
        gnhv0.b |= 1;
        ByteString hfsf0 = ((gnhv)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).c = hfsf0;
        gnim gnim0 = (gnim)gmwh.g.a(((gmvz)gmni0).d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

