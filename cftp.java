public final class cftp implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glfa glfa0 = (glfa)((ProtoLiteBuilder)object0).b_message;
        glfa0.b |= 16;
        glfa0.g = f;
    }
}

