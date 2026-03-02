public final class chtc implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glmb glmb0 = (glmb)((ProtoLiteBuilder)object0).b_message;
        glmb0.c = ((glly)object1).m;
        glmb0.b |= 1;
    }
}

