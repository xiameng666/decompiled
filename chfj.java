public final class chfj implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ccwq ccwq0 = (ccwq)((ProtoLiteBuilder)object0).b_message;
        ccwq0.b |= 8;
        ccwq0.f = v;
    }
}

