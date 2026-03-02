public final class cfyo implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        cnzq cnzq0 = (cnzq)((ProtoLiteBuilder)object0).b_message;
        cnzq0.b |= 8;
        cnzq0.f = v;
    }
}

