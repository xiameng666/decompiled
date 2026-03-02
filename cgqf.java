public final class cgqf implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpq gkpq0 = (gkpq)((ProtoLiteBuilder)object0).b_message;
        gkpq0.b |= 0x800;
        gkpq0.n = v;
    }
}

