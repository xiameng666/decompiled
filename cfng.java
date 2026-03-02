public final class cfng implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gliz gliz0 = (gliz)((ProtoLiteBuilder)object0).b_message;
        gliz0.b |= 0x20;
        gliz0.h = v;
    }
}

