public final class chac implements cdhy {
    @Override  // cdhy
    public final ProtoLiteMessage a(ProtoLiteMessage hftv0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gixy)hftv0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gixy)hftv0))));
        gixx gixx0 = gixx.s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gixy)hftp0.b_message).d = gixx0.H;
        ((gixy)hftp0.b_message).b |= 1;
        cnzg cnzg0 = ((gixy)hftv0).v;
        if(cnzg0 == null) {
            cnzg0 = cnzg.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)cnzg0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)cnzg0));
        if(!((cnze)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cnze)hftp1))).ensureMutable();
        }
        ((cnzg)((cnze)hftp1).b_message).c = 2;
        ((cnzg)((cnze)hftp1).b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gixy gixy0 = (gixy)hftp0.b_message;
        cnzg cnzg1 = (cnzg)((ProtoLiteBuilder)(((cnze)hftp1))).N_build();
        cnzg1.getClass();
        gixy0.v = cnzg1;
        gixy0.b |= 0x40000;
        return (gixy)hftp0.N_build();
    }
}

