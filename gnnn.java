public final class gnnn implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gniv.a).v_newBuilder();
        gniw gniw0 = gnnt.a(((gnln)gmni0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gniw0.getClass();
        ((gniv)hftv0).c = gniw0;
        ((gniv)hftv0).b |= 1;
        int v = ((gnln)gmni0).b;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gniv)hftp1.b_message).d = v;
        ByteString hfsf0 = gnnt.c(((gnln)gmni0).c);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gniv)hftp1.b_message).e = hfsf0;
        ByteString hfsf1 = ((gniv)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).c = hfsf1;
        gnim gnim0 = (gnim)gnnt.g.a(((gnln)gmni0).d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

