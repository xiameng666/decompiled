public final class ciwo implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        cnzl cnzl0 = (cnzl)((ProtoLiteBuilder)object0).b_message;
        cnzl0.b |= 0x40;
        cnzl0.i = v;
    }
}

