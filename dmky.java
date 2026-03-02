class dmky extends gfsd {
    @Override  // gfsd
    protected final Object a(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fswu.a).v_newBuilder();
        String s = ((hkkh)object0).b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((fswu)hftv0).b |= 1;
        ((fswu)hftv0).c = s;
        String s1 = ((hkkh)object0).c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fswu fswu0 = (fswu)hftp0.b_message;
        s1.getClass();
        fswu0.b |= 2;
        fswu0.d = s1;
        return (fswu)hftp0.N_build();
    }

    @Override  // gfsd
    protected final Object b(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkkh.a).v_newBuilder();
        if((((fswu)object0).b & 1) != 0) {
            String s = ((fswu)object0).c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkkh hkkh0 = (hkkh)hftp0.b_message;
            s.getClass();
            hkkh0.b = s;
        }
        if((((fswu)object0).b & 2) != 0) {
            String s1 = ((fswu)object0).d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkkh hkkh1 = (hkkh)hftp0.b_message;
            s1.getClass();
            hkkh1.c = s1;
        }
        return (hkkh)hftp0.N_build();
    }
}

