public final class cflr implements bbmw {
    @Override  // bbmw
    public final Object a(Object object0, Object object1) {
        int v = hgan.a(((Integer)object0).intValue());
        if(v == 0) {
            throw new IllegalStateException();
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gliy.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gliy)hftp0.b_message).c = v - 1;
        ((gliy)hftp0.b_message).b |= 1;
        int v1 = (int)(((Integer)object1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gliy gliy0 = (gliy)hftp0.b_message;
        gliy0.b |= 2;
        gliy0.d = v1;
        return (gliy)hftp0.N_build();
    }
}

