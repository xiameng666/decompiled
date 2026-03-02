public final class cgoa implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpl gkpl0 = (gkpl)((ProtoLiteBuilder)object0).b_message;
        ((ByteString)object1).getClass();
        gkpl0.b |= 8;
        gkpl0.f = (ByteString)object1;
    }
}

