public final class cgme implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpw gkpw0 = (gkpw)((ProtoLiteBuilder)object0).b_message;
        gkpw0.b |= 8;
        gkpw0.f = f;
    }
}

