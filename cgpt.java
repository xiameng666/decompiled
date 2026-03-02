public final class cgpt implements bbmv {
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
        gkps gkps0 = gkoq1.f == null ? gkps.a : gkoq1.f;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gkps0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gkps0));
        ((gkpr)hftp1).a(((gkpq)object1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkoq gkoq2 = (gkoq)hftp0.b_message;
        gkps gkps1 = (gkps)((ProtoLiteBuilder)(((gkpr)hftp1))).N_build();
        gkps1.getClass();
        gkoq2.f = gkps1;
        gkoq2.b |= 0x40;
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

