public final class cgfw implements bbmv {
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
        gknn gknn0 = gknq1.f == null ? gknn.a : gknq1.f;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gknn0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gknn0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gknn gknn1 = (gknn)hftp1.b_message;
        ((gknv)object1).getClass();
        gknn1.b();
        gknn1.b.add(((gknv)object1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gknq gknq2 = (gknq)hftp0.b_message;
        gknn gknn2 = (gknn)hftp1.N_build();
        gknn2.getClass();
        gknq2.f = gknn2;
        gknq2.b |= 8;
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

