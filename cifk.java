public final class cifk implements bbmw {
    @Override  // bbmw
    public final Object a(Object object0, Object object1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzih.a).v_newBuilder();
        int v = (int)(((Integer)object0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzih gzih0 = (gzih)hftp0.b_message;
        gzih0.b |= 1;
        gzih0.c = v;
        int v1 = (int)(((Integer)object1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzih gzih1 = (gzih)hftp0.b_message;
        gzih1.b |= 2;
        gzih1.d = v1;
        return (gzih)hftp0.N_build();
    }
}

