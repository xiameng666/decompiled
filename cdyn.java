public final class cdyn implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ccwq ccwq0 = (ccwq)((ProtoLiteBuilder)object0).b_message;
        ccwq0.d = ((ccwp)object1).g;
        ccwq0.b |= 2;
    }
}

