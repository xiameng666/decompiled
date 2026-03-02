public final class cfwc implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gkng gkng0 = ((gixy)((ProtoLiteBuilder)object0).b_message).J;
        if(gkng0 == null) {
            gkng0 = gkng.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gkng0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gkng0));
        ((gknf)hftp0).a(((gknl)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gixy gixy0 = (gixy)((ProtoLiteBuilder)object0).b_message;
        gkng gkng1 = (gkng)((ProtoLiteBuilder)(((gknf)hftp0))).N_build();
        gkng1.getClass();
        gixy0.J = gkng1;
        gixy0.c |= 1;
    }
}

