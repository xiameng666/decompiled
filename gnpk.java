public final class gnpk implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gngk.a).v_newBuilder();
        int v = ((gnon)gmni0).d();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gngk)hftp1.b_message).e = v;
        gngl gngl0 = gnpo.a(((gnon)gmni0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gngk gngk0 = (gngk)hftp1.b_message;
        gngl0.getClass();
        gngk0.d = gngl0;
        gngk0.b |= 1;
        ByteString hfsf0 = ((gngk)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gnic)hftv0).c = hfsf0;
        gnim gnim0 = gnim.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

