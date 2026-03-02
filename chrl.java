public final class chrl implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glef glef0 = (glef)((ProtoLiteBuilder)object0).b_message;
        glef0.b |= 8;
        glef0.f = f;
    }
}

