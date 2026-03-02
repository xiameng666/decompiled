public final class dvdm implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        if(((String)object0) == null) {
            return guut.a;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guut.a).v_newBuilder();
        guuv guuv0 = guuv.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guut guut0 = (guut)hftp0.b_message;
        guut0.b = guuv0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((guut)hftv0).c = (String)object0;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        guut guut1 = (guut)hftp0.b_message;
        guut1.d = guuu.a(3);
        return (guut)hftp0.N_build();
    }
}

