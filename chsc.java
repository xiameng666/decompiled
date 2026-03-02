public final class chsc implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glel glel0 = (glel)((ProtoLiteBuilder)object0).b_message;
        glel0.b |= 0x8000;
        glel0.r = f;
    }
}

