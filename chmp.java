public final class chmp implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gljs gljs0 = (gljs)((ProtoLiteBuilder)object0).b_message;
        gljs0.b |= 2;
        gljs0.d = v;
    }
}

