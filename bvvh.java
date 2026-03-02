final class bvvh {
    public static final gqqk a(fpug fpug0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqqk.a).v_newBuilder();
        int v = (fpug0.c == null ? fpub.a : fpug0.c).c ? 2 : 3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gqqk)hftp0.b_message).c = v - 1;
        ((gqqk)hftp0.b_message).b |= 1;
        boolean z = (fpug0.d == null ? fpuf.a : fpug0.d).b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqqk gqqk0 = (gqqk)hftp0.b_message;
        gqqk0.b |= 2;
        gqqk0.d = z;
        return (gqqk)hftp0.N_build();
    }
}

