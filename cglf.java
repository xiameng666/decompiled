public final class cglf implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpt gkpt0 = (gkpt)((ProtoLiteBuilder)object0).b_message;
        ((ByteString)object1).getClass();
        gkpt0.b |= 8;
        gkpt0.f = (ByteString)object1;
    }
}

