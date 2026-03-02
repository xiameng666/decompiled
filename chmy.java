public final class chmy implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejo gejo0 = (gejo)((ProtoLiteBuilder)object0).b_message;
        gejo0.b |= 0x100;
        gejo0.k = v;
    }
}

