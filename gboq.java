public final class gboq {
    public static final hdzp a;
    public static final hdzp b;

    static {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdzp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hdzp)hftv0).b |= 1;
        ((hdzp)hftv0).c = 0.4f;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdzp.b(((hdzp)hftp0.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hdzp)hftv1).b |= 4;
        ((hdzp)hftv1).e = 0.2f;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdzp.c(((hdzp)hftp0.b_message));
        gboq.a = (hdzp)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hdzp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((hdzp)hftv2).b |= 1;
        ((hdzp)hftv2).c = 0.0f;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        hdzp.b(((hdzp)hftp1.b_message));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((hdzp)hftv3).b |= 4;
        ((hdzp)hftv3).e = 1.0f;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        hdzp.c(((hdzp)hftp1.b_message));
        gboq.b = (hdzp)hftp1.N_build();
    }

    public static hdzk a(int v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdzk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdzk)hftp0.b_message).c = 1;
        ((hdzk)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hdzl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hdzl)hftv0).b |= 1;
        ((hdzl)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hdzl hdzl0 = (hdzl)hftp1.b_message;
        hdzl0.b |= 2;
        hdzl0.d = v1;
        hdzl hdzl1 = (hdzl)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdzk hdzk0 = (hdzk)hftp0.b_message;
        hdzl1.getClass();
        hdzk0.d = hdzl1;
        hdzk0.b |= 2;
        return (hdzk)hftp0.N_build();
    }

    public static ProtoLiteBuilder b(hdzp hdzp0, int v, hdzk hdzk0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdzq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hdzp0.getClass();
        ((hdzq)hftv0).c = hdzp0;
        ((hdzq)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hdzq)hftv1).b |= 2;
        ((hdzq)hftv1).d = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdzq hdzq0 = (hdzq)hftp0.b_message;
        hdzk0.getClass();
        hdzq0.f = hdzk0;
        hdzq0.b |= 8;
        return hftp0;
    }

    public static ProtoLiteBuilder c(hdzp hdzp0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdzk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdzk)hftp0.b_message).c = 2;
        ((hdzk)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hdzo.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hdzo)hftv0).b |= 4;
        ((hdzo)hftv0).e = 30;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hdzo)hftp1.b_message).c = 3;
        ((hdzo)hftp1.b_message).b |= 1;
        hdzo hdzo0 = (hdzo)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdzk hdzk0 = (hdzk)hftp0.b_message;
        hdzo0.getClass();
        hdzk0.e = hdzo0;
        hdzk0.b |= 4;
        return gboq.b(hdzp0, 300, ((hdzk)hftp0.N_build()));
    }
}

