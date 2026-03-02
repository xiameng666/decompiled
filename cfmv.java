public final class cfmv implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gliz gliz0 = (gliz)((ProtoLiteBuilder)object0).b_message;
        gliz0.b |= 0x400000;
        gliz0.z = v;
    }
}

