public final class cgnv implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpl gkpl0 = (gkpl)((ProtoLiteBuilder)object0).b_message;
        ((ByteString)object1).getClass();
        gkpl0.b |= 4;
        gkpl0.e = (ByteString)object1;
    }
}

