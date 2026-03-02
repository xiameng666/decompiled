public final class cgai implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        double f = (double)(((Double)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        cnma cnma0 = (cnma)((ProtoLiteBuilder)object0).b_message;
        cnma0.b |= 0x8000;
        cnma0.r = f;
    }
}

