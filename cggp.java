public final class cggp implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gknq gknq0 = ((gixy)((ProtoLiteBuilder)object0).b_message).q;
        if(gknq0 == null) {
            gknq0 = gknq.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gknq0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gknq0));
        gknq gknq1 = ((gixy)((ProtoLiteBuilder)object0).b_message).q;
        if(gknq1 == null) {
            gknq1 = gknq.a;
        }
        gknp gknp0 = gknq1.e == null ? gknp.a : gknq1.e;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gknp0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gknp0));
        if(!((gkno)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gkno)hftp1))).ensureMutable();
        }
        gknp gknp1 = (gknp)((gkno)hftp1).b_message;
        ((gknw)object1).getClass();
        gknp1.b();
        gknp1.b.add(((gknw)object1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gknq gknq2 = (gknq)hftp0.b_message;
        gknp gknp2 = (gknp)((ProtoLiteBuilder)(((gkno)hftp1))).N_build();
        gknp2.getClass();
        gknq2.e = gknp2;
        gknq2.b |= 4;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gixy gixy0 = (gixy)((ProtoLiteBuilder)object0).b_message;
        gknq gknq3 = (gknq)hftp0.N_build();
        gknq3.getClass();
        gixy0.q = gknq3;
        gixy0.b |= 0x2000;
    }
}

