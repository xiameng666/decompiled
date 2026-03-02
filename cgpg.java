public final class cgpg implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpq gkpq0 = (gkpq)((ProtoLiteBuilder)object0).b_message;
        gkpq0.b |= 0x10000;
        gkpq0.s = v;
    }
}

