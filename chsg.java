public final class chsg implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glel glel0 = (glel)((ProtoLiteBuilder)object0).b_message;
        glel0.c = ((glmg)object1).d;
        glel0.b |= 1;
    }
}

