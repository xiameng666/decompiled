public final class cehm implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejq gejq0 = (gejq)((ProtoLiteBuilder)object0).b_message;
        gejq0.b |= 0x40;
        gejq0.i = f;
    }
}

