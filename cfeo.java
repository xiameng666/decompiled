public final class cfeo implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glkz glkz0 = (glkz)((ProtoLiteBuilder)object0).b_message;
        glkz0.b |= 2;
        glkz0.d = v;
    }
}

