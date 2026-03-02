public final class cgqr implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gkvz gkvz0 = ((gixy)((ProtoLiteBuilder)object0).b_message).H;
        if(gkvz0 == null) {
            gkvz0 = gkvz.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gkvz0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gkvz0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkvz gkvz1 = (gkvz)hftp0.b_message;
        ((gkvw)object1).getClass();
        gkvz1.b();
        gkvz1.d.add(((gkvw)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gixy gixy0 = (gixy)((ProtoLiteBuilder)object0).b_message;
        gkvz gkvz2 = (gkvz)hftp0.N_build();
        gkvz2.getClass();
        gixy0.H = gkvz2;
        gixy0.b |= 0x40000000;
    }
}

