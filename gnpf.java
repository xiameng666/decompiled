public final class gnpf implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gngb.a).v_newBuilder();
        int v = ((gnoc)gmni0).e();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gngb)hftp1.b_message).d = v;
        gngc gngc0 = gnpj.a(((gnoc)gmni0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gngb gngb0 = (gngb)hftp1.b_message;
        gngc0.getClass();
        gngb0.c = gngc0;
        gngb0.b |= 1;
        ByteString hfsf0 = ((gngb)hftp1.N_build()).getDefaultInstanceForType();
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

