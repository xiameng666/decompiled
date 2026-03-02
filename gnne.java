public final class gnne implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gnir.a).v_newBuilder();
        gnis gnis0 = gnnk.a(((gnlb)gmni0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gnis0.getClass();
        ((gnir)hftv0).c = gnis0;
        ((gnir)hftv0).b |= 1;
        int v = ((gnlb)gmni0).b;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gnir)hftp1.b_message).d = v;
        ByteString hfsf0 = gnnk.c(((gnlb)gmni0).c);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gnir)hftp1.b_message).e = hfsf0;
        ByteString hfsf1 = ((gnir)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).c = hfsf1;
        gnim gnim0 = (gnim)gnnk.g.a(((gnlb)gmni0).d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

