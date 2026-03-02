public final class cgvf implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        coad coad0 = (coad)((ProtoLiteBuilder)object0).b_message;
        coad0.b |= 0x2000;
        coad0.p = v;
    }
}

