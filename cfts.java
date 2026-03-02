public final class cfts implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glfa glfa0 = (glfa)((ProtoLiteBuilder)object0).b_message;
        glfa0.b |= 0x20;
        glfa0.h = v;
    }
}

