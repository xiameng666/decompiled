public final class cicn implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzie gzie0 = (gzie)((ProtoLiteBuilder)object0).b_message;
        gzie0.b |= 0x80;
        gzie0.j = v;
    }
}

