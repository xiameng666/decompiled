public final class ciro implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glkt glkt0 = (glkt)((ProtoLiteBuilder)object0).b_message;
        ((ByteString)object1).getClass();
        glkt0.b |= 8;
        glkt0.f = (ByteString)object1;
    }
}

