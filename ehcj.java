public final class ehcj {
    public static void a(String s, int v, int v1) {
        efpr efpr0 = efpr.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gisq)hftv0).c = v1 - 1;
        ((gisq)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gisq gisq0 = (gisq)hftp0.b_message;
        gisq0.b |= 2;
        gisq0.d = v;
        efpr0.m(s, ((gisq)hftp0.N_build()));
    }
}

