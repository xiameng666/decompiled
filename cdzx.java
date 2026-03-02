public final class cdzx implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        geao geao0 = (geao)((ProtoLiteBuilder)object0).b_message;
        geao0.b |= 16;
        geao0.g = v;
    }
}

