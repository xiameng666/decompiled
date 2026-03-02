public final class ajio {
    public static final void a(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghqf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghqf)hftp0.b_message).c = v - 1;
        ((ghqf)hftp0.b_message).b |= 1;
        ghqf ghqf0 = (ghqf)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.K;
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
        ghqf0.getClass();
        ghon0.H = ghqf0;
        ghon0.c |= 0x100;
        ajiu.b(((ghon)hftp1.N_build()));
    }
}

