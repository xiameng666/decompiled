public final class cfsz implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glfh glfh0 = (glfh)((ProtoLiteBuilder)object0).b_message;
        glfh0.b |= 16;
        glfh0.g = v;
    }
}

