public final class ddma implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = (int)(((Integer)object0));
        if(v == -1) {
            return ccnw.a;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccnw.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ccnt.a).v_newBuilder();
        boolean z = true;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((ccnt)hftv0).b = v != 0;
        if(v == 0 || v == 4) {
            z = false;
        }
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ccnt)hftp1.b_message).c = z;
        ccnt ccnt0 = (ccnt)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ccnw ccnw0 = (ccnw)hftp0.b_message;
        ccnt0.getClass();
        ccnw0.c = ccnt0;
        ccnw0.b = 4;
        return (ccnw)hftp0.N_build();
    }
}

