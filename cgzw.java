public final class cgzw implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        cnzm cnzm0 = (cnzm)((ProtoLiteBuilder)object0).b_message;
        cnzm0.b |= 0x2000;
        cnzm0.p = v;
    }
}

