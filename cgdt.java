public final class cgdt implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gkqt gkqt0 = ((gixy)((ProtoLiteBuilder)object0).b_message).m;
        if(gkqt0 == null) {
            gkqt0 = gkqt.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gkqt0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gkqt0));
        gkqt gkqt1 = ((gixy)((ProtoLiteBuilder)object0).b_message).m;
        if(gkqt1 == null) {
            gkqt1 = gkqt.a;
        }
        gkqo gkqo0 = gkqt1.d == null ? gkqo.a : gkqt1.d;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gkqo0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gkqo0));
        ((gkqc)hftp1).a(((gkqn)object1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkqt gkqt2 = (gkqt)hftp0.b_message;
        gkqo gkqo1 = (gkqo)((ProtoLiteBuilder)(((gkqc)hftp1))).N_build();
        gkqo1.getClass();
        gkqt2.d = gkqo1;
        gkqt2.b |= 2;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gixy gixy0 = (gixy)((ProtoLiteBuilder)object0).b_message;
        gkqt gkqt3 = (gkqt)hftp0.N_build();
        gkqt3.getClass();
        gixy0.m = gkqt3;
        gixy0.b |= 0x200;
    }
}

