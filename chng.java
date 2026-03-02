public final class chng implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejo gejo0 = (gejo)((ProtoLiteBuilder)object0).b_message;
        gejo0.d = ((gehy)object1).f;
        gejo0.b |= 2;
    }
}

