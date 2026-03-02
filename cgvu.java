public final class cgvu implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        coad coad0 = (coad)((ProtoLiteBuilder)object0).b_message;
        coad0.b |= 0x1000000;
        coad0.A = z;
    }
}

