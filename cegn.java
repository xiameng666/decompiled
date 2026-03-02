public final class cegn implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejn gejn0 = (gejn)((ProtoLiteBuilder)object0).b_message;
        gejn0.b |= 16;
        gejn0.g = f;
    }
}

