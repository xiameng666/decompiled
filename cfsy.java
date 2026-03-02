public final class cfsy implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glfh glfh0 = (glfh)((ProtoLiteBuilder)object0).b_message;
        glfh0.b |= 8;
        glfh0.f = f;
    }
}

