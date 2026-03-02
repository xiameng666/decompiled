public final class cgoo implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpp gkpp0 = (gkpp)((ProtoLiteBuilder)object0).b_message;
        gkpp0.b |= 16;
        gkpp0.g = v;
    }
}

