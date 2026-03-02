public final class cgik implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkov gkov0 = (gkov)((ProtoLiteBuilder)object0).b_message;
        ((ByteString)object1).getClass();
        gkov0.b |= 0x8000;
        gkov0.r = (ByteString)object1;
    }
}

