public final class chtd implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((int)(((Integer)object1))));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glmb glmb0 = (glmb)((ProtoLiteBuilder)object0).b_message;
        glmb0.b |= 8;
        glmb0.f = v;
    }
}

