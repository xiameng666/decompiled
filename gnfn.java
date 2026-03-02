public final class gnfn implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.HkdfPrfKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gnhn.a).v_newBuilder();
        gnho gnho0 = gnfr.b(((gnfb)gmni0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gnho0.getClass();
        ((gnhn)hftv0).c = gnho0;
        ((gnhn)hftv0).b |= 1;
        int v = ((gnfb)gmni0).a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gnhn)hftp1.b_message).d = v;
        ByteString hfsf0 = ((gnhn)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gnic)hftv1).c = hfsf0;
        gnim gnim0 = gnim.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

