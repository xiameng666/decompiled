public final class chuj implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((int)(((Integer)object1))));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glmc glmc0 = (glmc)((ProtoLiteBuilder)object0).b_message;
        glmc0.b |= 1;
        glmc0.c = v;
    }
}

