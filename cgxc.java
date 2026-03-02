public final class cgxc implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        coac coac0 = (coac)((ProtoLiteBuilder)object0).b_message;
        coac0.b |= 0x8000;
        coac0.r = f;
    }
}

