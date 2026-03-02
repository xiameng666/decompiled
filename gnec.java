public final class gnec implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.AesCmacKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gnfw.a).v_newBuilder();
        gnfx gnfx0 = gneg.b(((gnda)gmni0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gnfx0.getClass();
        ((gnfw)hftv0).d = gnfx0;
        ((gnfw)hftv0).b |= 1;
        int v = ((gnda)gmni0).a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gnfw)hftp1.b_message).c = v;
        ByteString hfsf0 = ((gnfw)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).c = hfsf0;
        gnim gnim0 = gneg.c(((gnda)gmni0).c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

