public final class cgzt implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        cnzm cnzm0 = (cnzm)((ProtoLiteBuilder)object0).b_message;
        cnzm0.b |= 0x400;
        cnzm0.m = f;
    }
}

