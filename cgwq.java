public final class cgwq implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        cnzg cnzg0 = ((gixy)((ProtoLiteBuilder)object0).b_message).v;
        if(cnzg0 == null) {
            cnzg0 = cnzg.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)cnzg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)cnzg0));
        if(!((cnze)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cnze)hftp0))).ensureMutable();
        }
        cnzg cnzg1 = (cnzg)((cnze)hftp0).b_message;
        ((coac)object1).getClass();
        cnzg1.d();
        cnzg1.f.add(((coac)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gixy gixy0 = (gixy)((ProtoLiteBuilder)object0).b_message;
        cnzg cnzg2 = (cnzg)((ProtoLiteBuilder)(((cnze)hftp0))).N_build();
        cnzg2.getClass();
        gixy0.v = cnzg2;
        gixy0.b |= 0x40000;
    }
}

