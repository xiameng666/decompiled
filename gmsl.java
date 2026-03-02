public final class gmsl implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gngn.a).v_newBuilder();
        int v = ((gmpm)gmni0).a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gngn)hftp1.b_message).b = v;
        ByteString hfsf0 = ((gngn)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).c = hfsf0;
        gnim gnim0 = gmsp.b(((gmpm)gmni0).d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

