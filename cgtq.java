public final class cgtq implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkwa gkwa0 = (gkwa)((ProtoLiteBuilder)object0).b_message;
        ((ByteString)object1).getClass();
        gkwa0.b |= 0x200;
        gkwa0.l = (ByteString)object1;
    }
}

