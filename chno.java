public final class chno implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejo gejo0 = (gejo)((ProtoLiteBuilder)object0).b_message;
        gejo0.b |= 0x40;
        gejo0.i = f;
    }
}

