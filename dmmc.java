public final class dmmc {
    public static final guez a(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guez.a).v_newBuilder();
        guex guex0 = (guex)((ProtoLiteMessage)guey.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gufc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gufc)hftp1.b_message).d = 4;
        ((gufc)hftp1.b_message).e = v;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gufc)hftp1.b_message).f = 0xFF;
        guex0.l(hftp1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guez guez0 = (guez)hftp0.b_message;
        guey guey0 = (guey)((ProtoLiteBuilder)guex0).N_build();
        guey0.getClass();
        guez0.c = guey0;
        guez0.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (guez)hftv0;
    }
}

