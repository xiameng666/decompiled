public final class chkt implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glge glge0 = (glge)((ProtoLiteBuilder)object0).b_message;
        glge0.b |= 0x40;
        glge0.h = v;
    }
}

