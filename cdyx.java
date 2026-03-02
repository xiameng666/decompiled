public final class cdyx implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ccwq ccwq0 = (ccwq)((ProtoLiteBuilder)object0).b_message;
        ccwq0.b |= 0x40;
        ccwq0.i = v;
    }
}

