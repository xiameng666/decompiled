public final class choy implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gljx gljx0 = (gljx)((ProtoLiteBuilder)object0).b_message;
        gljx0.b |= 2;
        gljx0.d = v;
    }
}

