public final class cgtf implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gkwb gkwb0 = ((gixy)((ProtoLiteBuilder)object0).b_message).G;
        if(gkwb0 == null) {
            gkwb0 = gkwb.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gkwb0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gkwb0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkwb gkwb1 = (gkwb)hftp0.b_message;
        ((gkwa)object1).getClass();
        gkwb1.b();
        gkwb1.d.add(((gkwa)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gixy gixy0 = (gixy)((ProtoLiteBuilder)object0).b_message;
        gkwb gkwb2 = (gkwb)hftp0.N_build();
        gkwb2.getClass();
        gixy0.G = gkwb2;
        gixy0.b |= 0x20000000;
    }
}

