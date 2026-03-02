public final class cigy implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gziu gziu0 = (gziu)((ProtoLiteBuilder)object0).b_message;
        gziu0.b |= 0x20000;
        gziu0.t = v;
    }
}

