public final class cgmh implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpw gkpw0 = (gkpw)((ProtoLiteBuilder)object0).b_message;
        ((ByteString)object1).getClass();
        gkpw0.b |= 0x40;
        gkpw0.h = (ByteString)object1;
    }
}

