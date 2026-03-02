public final class cesv implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ccwq ccwq0 = (ccwq)((ProtoLiteBuilder)object0).b_message;
        ccwq0.b |= 4;
        ccwq0.e = z;
    }
}

