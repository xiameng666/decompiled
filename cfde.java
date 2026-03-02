public final class cfde implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glhl glhl0 = (glhl)((ProtoLiteBuilder)object0).b_message;
        glhl0.b |= 0x400;
        glhl0.h = f;
    }
}

