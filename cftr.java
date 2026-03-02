public final class cftr implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glfa glfa0 = (glfa)((ProtoLiteBuilder)object0).b_message;
        glfa0.b |= 8;
        glfa0.f = v;
    }
}

