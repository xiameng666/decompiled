public final class cfpe implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glkk glkk0 = (glkk)((ProtoLiteBuilder)object0).b_message;
        glkk0.b |= 8;
        glkk0.f = v;
    }
}

