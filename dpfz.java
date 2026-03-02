public final class dpfz implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fswu.a).v_newBuilder();
        String s = ((gtit)object0).b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((fswu)hftv0).b |= 1;
        ((fswu)hftv0).c = s;
        String s1 = ((gtit)object0).c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fswu fswu0 = (fswu)hftp0.b_message;
        s1.getClass();
        fswu0.b |= 2;
        fswu0.d = s1;
        return (fswu)hftp0.N_build();
    }
}

