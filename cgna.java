public final class cgna implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpi gkpi0 = (gkpi)((ProtoLiteBuilder)object0).b_message;
        gkpi0.b |= 4;
        gkpi0.e = v;
    }
}

