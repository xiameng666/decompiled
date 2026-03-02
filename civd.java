public final class civd implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        cnma cnma0 = (cnma)((ProtoLiteBuilder)object0).b_message;
        cnma0.b |= 8;
        cnma0.f = v;
    }
}

