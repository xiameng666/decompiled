public final class chqz implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glea glea0 = (glea)((ProtoLiteBuilder)object0).b_message;
        glea0.b |= 0x400;
        glea0.m = f;
    }
}

