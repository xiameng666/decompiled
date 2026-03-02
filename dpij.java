public final class dpij implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dpea.a).v_newBuilder();
        hknp hknp0 = ((hkob)object0).d;
        if(hknp0 == null) {
            hknp0 = hknp.b;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dpea dpea0 = (dpea)hftp0.b_message;
        hknp0.getClass();
        dpea0.c = hknp0;
        dpea0.b |= 1;
        hkod hkod0 = ((hkob)object0).b;
        if(hkod0 == null) {
            hkod0 = hkod.a;
        }
        long v = hkod0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dpea)hftp0.b_message).d = v;
        return (dpea)hftp0.N_build();
    }
}

