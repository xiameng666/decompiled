public final class cehj implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejq gejq0 = (gejq)((ProtoLiteBuilder)object0).b_message;
        gejq0.b |= 0x20;
        gejq0.h = f;
    }
}

