public final class gmqn implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.KmsAeadKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gnij.a).v_newBuilder();
        String s = ((gmqm)gmni0).a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gnij gnij0 = (gnij)hftp1.b_message;
        s.getClass();
        gnij0.b = s;
        ByteString hfsf0 = ((gnij)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).c = hfsf0;
        gnim gnim0 = gmqr.b(((gmqm)gmni0).b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

