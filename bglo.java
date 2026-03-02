public final class bglo implements evqk {
    @Override  // evqk
    public final evql a(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkn.a).v_newBuilder();
        String s = Long.toHexString(((Long)bbmq.c.i()).longValue());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkn grkn0 = (grkn)hftp1.b_message;
        s.getClass();
        grkn0.b |= 1;
        grkn0.c = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkr grkr0 = (grkr)hftp0.b_message;
        grkn grkn1 = (grkn)hftp1.N_build();
        grkn1.getClass();
        grkr0.d = grkn1;
        grkr0.b |= 4;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grko.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grko grko0 = (grko)hftp2.b_message;
        ((String)object0).getClass();
        grko0.b = 1;
        grko0.c = (String)object0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkr grkr1 = (grkr)hftp0.b_message;
        grko grko1 = (grko)hftp2.N_build();
        grko1.getClass();
        grkr1.c = grko1;
        grkr1.b |= 1;
        return evrg.d(((grkr)hftp0.N_build()));
    }
}

