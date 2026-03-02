public final class dpid implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkod.a).v_newBuilder();
        hknp hknp0 = ((dpea)object0).c;
        if(hknp0 == null) {
            hknp0 = hknp.b;
        }
        hjqu hjqu0 = hknp0.g == null ? hjqu.a : hknp0.g;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkod hkod0 = (hkod)hftp0.b_message;
        hjqu0.getClass();
        hkod0.c = hjqu0;
        hkod0.b |= 1;
        hknp hknp1 = ((dpea)object0).c;
        if(hknp1 == null) {
            hknp1 = hknp.b;
        }
        hfwn hfwn0 = hknp1.h == null ? hfwn.a : hknp1.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfwn0.getClass();
        ((hkod)hftv0).e = hfwn0;
        ((hkod)hftv0).b |= 2;
        long v = ((dpea)object0).d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkod)hftp0.b_message).d = v;
        return (hkod)hftp0.N_build();
    }
}

