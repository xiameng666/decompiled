public final class civs implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gixx gixx0 = gixx.s;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((gixy)((ProtoLiteBuilder)object0).b_message).d = gixx0.H;
        ((gixy)((ProtoLiteBuilder)object0).b_message).b |= 1;
        cnzg cnzg0 = ((gixy)((ProtoLiteBuilder)object0).b_message).v;
        if(cnzg0 == null) {
            cnzg0 = cnzg.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)cnzg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)cnzg0));
        if(!((cnze)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cnze)hftp0))).ensureMutable();
        }
        ((cnzg)((cnze)hftp0).b_message).c = 1;
        ((cnzg)((cnze)hftp0).b_message).b |= 1;
        ((cnze)hftp0).k(((cnzl)object1));
        cnzg cnzg1 = (cnzg)((ProtoLiteBuilder)(((cnze)hftp0))).N_build();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gixy gixy0 = (gixy)((ProtoLiteBuilder)object0).b_message;
        cnzg1.getClass();
        gixy0.v = cnzg1;
        gixy0.b |= 0x40000;
    }
}

