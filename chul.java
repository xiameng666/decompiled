public final class chul implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glmc glmc0 = (glmc)((ProtoLiteBuilder)object0).b_message;
        glmc0.b |= 4;
        glmc0.e = f;
    }
}

