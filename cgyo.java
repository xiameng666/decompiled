public final class cgyo implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        cnzg cnzg0 = ((gixy)((ProtoLiteBuilder)object0).b_message).v;
        if(cnzg0 == null) {
            cnzg0 = cnzg.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)cnzg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)cnzg0));
        ((cnze)hftp0).k(((cnzl)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gixy gixy0 = (gixy)((ProtoLiteBuilder)object0).b_message;
        cnzg cnzg1 = (cnzg)((ProtoLiteBuilder)(((cnze)hftp0))).N_build();
        cnzg1.getClass();
        gixy0.v = cnzg1;
        gixy0.b |= 0x40000;
    }
}

