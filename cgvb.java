public final class cgvb implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        coad coad0 = (coad)((ProtoLiteBuilder)object0).b_message;
        coad0.b |= 0x40;
        coad0.i = f;
    }
}

