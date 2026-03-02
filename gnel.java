public final class gnel implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.HmacKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gnhq.a).v_newBuilder();
        gnhr gnhr0 = gnep.a(((gndo)gmni0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gnhr0.getClass();
        ((gnhq)hftv0).c = gnhr0;
        ((gnhq)hftv0).b |= 1;
        int v = ((gndo)gmni0).a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gnhq)hftp1.b_message).d = v;
        ByteString hfsf0 = ((gnhq)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).c = hfsf0;
        gnim gnim0 = (gnim)gnep.a.a(((gndo)gmni0).c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

