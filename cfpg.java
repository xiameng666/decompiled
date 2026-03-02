public final class cfpg implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glkk glkk0 = (glkk)((ProtoLiteBuilder)object0).b_message;
        glkk0.b |= 16;
        glkk0.g = v;
    }
}

