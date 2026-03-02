public final class cfev implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glkz glkz0 = (glkz)((ProtoLiteBuilder)object0).b_message;
        glkz0.b |= 16;
        glkz0.g = v;
    }
}

