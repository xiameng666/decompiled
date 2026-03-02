public final class cfsr implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glfh glfh0 = (glfh)((ProtoLiteBuilder)object0).b_message;
        glfh0.e = ((glfe)object1).d;
        glfh0.b |= 4;
    }
}

