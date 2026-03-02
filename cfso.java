public final class cfso implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glfh glfh0 = (glfh)((ProtoLiteBuilder)object0).b_message;
        glfh0.c = ((glfc)object1).d;
        glfh0.b |= 1;
    }
}

