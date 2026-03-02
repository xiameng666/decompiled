public final class chtm implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glmb glmb0 = (glmb)((ProtoLiteBuilder)object0).b_message;
        glmb0.i = ((glma)object1).d;
        glmb0.b |= 0x40;
    }
}

