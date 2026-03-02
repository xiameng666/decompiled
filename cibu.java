public final class cibu implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzib gzib0 = (gzib)((ProtoLiteBuilder)object0).b_message;
        gzib0.b |= 0x20;
        gzib0.h = v;
    }
}

