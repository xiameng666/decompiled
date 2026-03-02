public final class gmtp implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.XAesGcmKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gnja.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gnjb.a).v_newBuilder();
        int v = ((gmrq)gmni0).b;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gnjb)hftp2.b_message).b = v;
        gnjb gnjb0 = (gnjb)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gnja gnja0 = (gnja)hftp1.b_message;
        gnjb0.getClass();
        gnja0.d = gnjb0;
        gnja0.b |= 1;
        ByteString hfsf0 = ((gnja)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).c = hfsf0;
        gnim gnim0 = gmtt.b(((gmrq)gmni0).a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

