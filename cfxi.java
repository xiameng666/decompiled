public final class cfxi implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        cnzp cnzp0 = (cnzp)((ProtoLiteBuilder)object0).b_message;
        cnzp0.b |= 0x80;
        cnzp0.j = v;
    }
}

