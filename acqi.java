public final class acqi {
    public static byte[] a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gquc.a).v_newBuilder();
        gqud gqud0 = acqq.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gquc gquc0 = (gquc)hftp0.b_message;
        gqud0.getClass();
        gquc0.c = gqud0;
        gquc0.b |= 1;
        return ((gquc)hftp0.N_build()).toBytesArray();
    }
}

