public final class chai implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        cnzm cnzm0 = (cnzm)((ProtoLiteBuilder)object0).b_message;
        cnzm0.d = ((cnzd)object1).d;
        cnzm0.b |= 2;
    }
}

