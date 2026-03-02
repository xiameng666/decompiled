public final class cglx implements bbmv {
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
        gkqa gkqa0 = gkoq1.e == null ? gkqa.a : gkoq1.e;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gkqa0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gkqa0));
        ((gkpx)hftp1).a(((gkpw)object1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkoq gkoq2 = (gkoq)hftp0.b_message;
        gkqa gkqa1 = (gkqa)((ProtoLiteBuilder)(((gkpx)hftp1))).N_build();
        gkqa1.getClass();
        gkoq2.e = gkqa1;
        gkoq2.b |= 0x20;
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

