public final class cgor implements bbmv {
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
        gkpo gkpo0 = gkoq1.j == null ? gkpo.a : gkoq1.j;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gkpo0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gkpo0));
        if(!((gkpn)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gkpn)hftp1))).ensureMutable();
        }
        gkpo gkpo1 = (gkpo)((gkpn)hftp1).b_message;
        ((gkpp)object1).getClass();
        gkpo1.b();
        gkpo1.b.add(((gkpp)object1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkoq gkoq2 = (gkoq)hftp0.b_message;
        gkpo gkpo2 = (gkpo)((ProtoLiteBuilder)(((gkpn)hftp1))).N_build();
        gkpo2.getClass();
        gkoq2.j = gkpo2;
        gkoq2.b |= 0x400;
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

