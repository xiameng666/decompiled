public final class cfyj implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        cnzq cnzq0 = (cnzq)((ProtoLiteBuilder)object0).b_message;
        cnzq0.b |= 0x8000;
        cnzq0.r = v;
    }
}

