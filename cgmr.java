public final class cgmr implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gkor gkor0 = ((gkpi)((ProtoLiteBuilder)object0).b_message).d;
        if(gkor0 == null) {
            gkor0 = gkor.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gkor0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gkor0));
        int v = (int)(((Integer)object1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkor gkor1 = (gkor)hftp0.b_message;
        gkor1.b |= 16;
        gkor1.g = v;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpi gkpi0 = (gkpi)((ProtoLiteBuilder)object0).b_message;
        gkor gkor2 = (gkor)hftp0.N_build();
        gkor2.getClass();
        gkpi0.d = gkor2;
        gkpi0.b |= 2;
    }
}

