public final class cgqq implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkvw gkvw0 = (gkvw)((ProtoLiteBuilder)object0).b_message;
        gkvw0.b |= 0x100000;
        gkvw0.w = v;
    }
}

