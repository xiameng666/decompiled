public final class dpgi implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtiv.a).v_newBuilder();
        String s = ((fswu)object0).c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gtiv)hftv0).b |= 1;
        ((gtiv)hftv0).c = s;
        String s1 = ((fswu)object0).d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtiv gtiv0 = (gtiv)hftp0.b_message;
        s1.getClass();
        gtiv0.b |= 2;
        gtiv0.d = s1;
        return (gtiv)hftp0.N_build();
    }
}

