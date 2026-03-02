public final class cfyi implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        cnzq cnzq0 = (cnzq)((ProtoLiteBuilder)object0).b_message;
        cnzq0.b |= 0x4000;
        cnzq0.q = f;
    }
}

