public final class cgab implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        cnlt cnlt0 = ((gixy)((ProtoLiteBuilder)object0).b_message).z;
        if(cnlt0 == null) {
            cnlt0 = cnlt.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)cnlt0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)cnlt0));
        ((cnls)hftp0).a(((cnma)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gixy gixy0 = (gixy)((ProtoLiteBuilder)object0).b_message;
        cnlt cnlt1 = (cnlt)((ProtoLiteBuilder)(((cnls)hftp0))).N_build();
        cnlt1.getClass();
        gixy0.z = cnlt1;
        gixy0.b |= 0x400000;
    }
}

