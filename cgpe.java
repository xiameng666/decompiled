public final class cgpe implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpq gkpq0 = (gkpq)((ProtoLiteBuilder)object0).b_message;
        gkpq0.b |= 0x8000;
        gkpq0.r = f;
    }
}

