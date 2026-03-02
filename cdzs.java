public final class cdzs implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        geao geao0 = (geao)((ProtoLiteBuilder)object0).b_message;
        geao0.b |= 8;
        geao0.f = v;
    }
}

