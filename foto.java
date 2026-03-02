public final class foto implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iddc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        iddc iddc0 = (iddc)hftp0.b_message;
        ((iddk)object0).getClass();
        iddc0.d = (iddk)object0;
        iddc0.c = 3;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)iddb.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        iddb.b(((iddb)hftp1.b_message));
        iddb iddb0 = (iddb)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        iddc iddc1 = (iddc)hftp0.b_message;
        iddb0.getClass();
        iddc1.e = iddb0;
        iddc1.b |= 1;
        return (iddc)hftp0.N_build();
    }
}

