public final class cgwr implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        coac coac0 = (coac)((ProtoLiteBuilder)object0).b_message;
        coac0.b |= 0x100;
        coac0.k = v;
    }
}

