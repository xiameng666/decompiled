public final class cehr implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejr gejr0 = (gejr)((ProtoLiteBuilder)object0).b_message;
        gejr0.b |= 0x100;
        gejr0.k = f;
    }
}

