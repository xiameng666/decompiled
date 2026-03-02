public final class gmse implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.AesEaxKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gngh.a).v_newBuilder();
        gngi gngi0 = gmsi.b(((gmpa)gmni0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gngi0.getClass();
        ((gngh)hftv0).c = gngi0;
        ((gngh)hftv0).b |= 1;
        int v = ((gmpa)gmni0).a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gngh)hftp1.b_message).d = v;
        ByteString hfsf0 = ((gngh)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).c = hfsf0;
        gnim gnim0 = gmsi.c(((gmpa)gmni0).d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

