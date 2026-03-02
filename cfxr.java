public final class cfxr implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        cnzp cnzp0 = (cnzp)((ProtoLiteBuilder)object0).b_message;
        cnzp0.h = ((cnzv)object1).e;
        cnzp0.b |= 0x20;
    }
}

