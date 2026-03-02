public final class cezq implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btbd btbd0 = (btbd)((ProtoLiteBuilder)object0).b_message;
        btbd0.b |= 0x20;
        btbd0.h = v;
    }
}

