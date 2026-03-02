public final class cimf implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ccwq ccwq0 = (ccwq)((ProtoLiteBuilder)object0).b_message;
        ((ByteString)object1).getClass();
        ccwq0.b |= 0x80;
        ccwq0.j = (ByteString)object1;
    }
}

