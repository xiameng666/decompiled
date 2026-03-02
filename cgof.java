public final class cgof implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gkoq gkoq0 = ((gixy)((ProtoLiteBuilder)object0).b_message).f;
        if(gkoq0 == null) {
            gkoq0 = gkoq.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gkoq0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gkoq0));
        gkoq gkoq1 = ((gixy)((ProtoLiteBuilder)object0).b_message).f;
        if(gkoq1 == null) {
            gkoq1 = gkoq.a;
        }
        gkpm gkpm0 = gkoq1.i == null ? gkpm.a : gkoq1.i;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gkpm0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gkpm0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkpm gkpm1 = (gkpm)hftp1.b_message;
        ((gkpl)object1).getClass();
        gkpm1.b();
        gkpm1.b.add(((gkpl)object1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkoq gkoq2 = (gkoq)hftp0.b_message;
        gkpm gkpm2 = (gkpm)hftp1.N_build();
        gkpm2.getClass();
        gkoq2.i = gkpm2;
        gkoq2.b |= 0x200;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gixy gixy0 = (gixy)((ProtoLiteBuilder)object0).b_message;
        gkoq gkoq3 = (gkoq)hftp0.N_build();
        gkoq3.getClass();
        gixy0.f = gkoq3;
        gixy0.b |= 4;
    }
}

