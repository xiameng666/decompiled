public final class chst implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glel glel0 = (glel)((ProtoLiteBuilder)object0).b_message;
        glel0.b |= 0x400;
        glel0.m = v;
    }
}

