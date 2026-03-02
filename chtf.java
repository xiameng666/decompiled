public final class chtf implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glmb glmb0 = (glmb)((ProtoLiteBuilder)object0).b_message;
        glmb0.b |= 16;
        glmb0.g = f;
    }
}

