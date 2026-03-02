public final class ajir {
    public static final void a(ajiq ajiq0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghqh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v = ajiq0.d;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if(v == 0) {
            throw null;
        }
        ((ghqh)hftv0).f = v - 1;
        ((ghqh)hftv0).b |= 8;
        String s = ajiq0.a;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghqh ghqh0 = (ghqh)hftp0.b_message;
            ghqh0.b |= 1;
            ghqh0.c = s;
        }
        int v1 = ajiq0.b;
        if(v1 > 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghqh ghqh1 = (ghqh)hftp0.b_message;
            ghqh1.b |= 4;
            ghqh1.e = v1;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghqr.a).v_newBuilder();
        int v2 = ajiq0.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ghqr)hftp1.b_message).c = v2 - 1;
        ((ghqr)hftp1.b_message).b |= 1;
        long v3 = System.currentTimeMillis();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghqr ghqr0 = (ghqr)hftp1.b_message;
        ghqr0.b |= 4;
        ghqr0.e = v3;
        ghqr ghqr1 = (ghqr)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghqh ghqh2 = (ghqh)hftp0.b_message;
        ghqr1.getClass();
        ghqh2.d = ghqr1;
        ghqh2.b |= 2;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.J;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((ghon)hftp2.b_message).e = ghom0.av;
        ((ghon)hftp2.b_message).b |= 1;
        ghqh ghqh3 = (ghqh)hftp0.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp2.b_message;
        ghqh3.getClass();
        ghon0.G = ghqh3;
        ghon0.c |= 0x80;
        ajiu.b(((ghon)hftp2.N_build()));
    }

    public static final void b(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghqj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghqj)hftp0.b_message).c = v - 1;
        ((ghqj)hftp0.b_message).b |= 1;
        ghqj ghqj0 = (ghqj)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.L;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((ghon)hftv0).e = ghom0.av;
        ((ghon)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp1.b_message;
        ghqj0.getClass();
        ghon0.I = ghqj0;
        ghon0.c |= 0x200;
        ajiu.b(((ghon)hftp1.N_build()));
    }
}

