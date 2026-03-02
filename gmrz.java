public final class gmrz implements gnba {
    @Override  // gnba
    public final gnbs a(gmni gmni0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gnic.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).b = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gnfz.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gnge.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gngf.a).v_newBuilder();
        int v = ((gmoq)gmni0).c;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((gngf)hftp3.b_message).b = v;
        gngf gngf0 = (gngf)hftp3.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        gngf0.getClass();
        ((gnge)hftv0).c = gngf0;
        ((gnge)hftv0).b |= 1;
        int v1 = ((gmoq)gmni0).a;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gnge)hftp2.b_message).d = v1;
        gnge gnge0 = (gnge)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gnfz gnfz0 = (gnfz)hftp1.b_message;
        gnge0.getClass();
        gnfz0.c = gnge0;
        gnfz0.b |= 1;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gnhq.a).v_newBuilder();
        gnhr gnhr0 = gmsd.c(((gmoq)gmni0));
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp4.b_message;
        gnhr0.getClass();
        ((gnhq)hftv1).c = gnhr0;
        ((gnhq)hftv1).b |= 1;
        int v2 = ((gmoq)gmni0).b;
        if(!hftv1.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((gnhq)hftp4.b_message).d = v2;
        gnhq gnhq0 = (gnhq)hftp4.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gnfz gnfz1 = (gnfz)hftp1.b_message;
        gnhq0.getClass();
        gnfz1.d = gnhq0;
        gnfz1.b |= 2;
        ByteString hfsf0 = ((gnfz)hftp1.N_build()).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gnic)hftp0.b_message).c = hfsf0;
        gnim gnim0 = gmsd.d(((gmoq)gmni0).e);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gnic gnic0 = (gnic)hftp0.b_message;
        gnic0.d = gnim0.a();
        return gnbo.b(((gnic)hftp0.N_build()));
    }
}

