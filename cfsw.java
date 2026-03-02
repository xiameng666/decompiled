public final class cfsw implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glfh glfh0 = (glfh)((ProtoLiteBuilder)object0).b_message;
        glfh0.d = ((glfg)object1).f;
        glfh0.b |= 2;
    }
}

