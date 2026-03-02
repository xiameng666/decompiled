public final class cgmu implements bbmv {
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
        gkph gkph0 = gkoq1.k == null ? gkph.a : gkoq1.k;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gkph0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gkph0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkph gkph1 = (gkph)hftp1.b_message;
        ((gkpi)object1).getClass();
        gkph1.b();
        gkph1.b.add(((gkpi)object1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkoq gkoq2 = (gkoq)hftp0.b_message;
        gkph gkph2 = (gkph)hftp1.N_build();
        gkph2.getClass();
        gkoq2.k = gkph2;
        gkoq2.b |= 0x800;
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

