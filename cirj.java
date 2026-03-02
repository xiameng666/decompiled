public final class cirj implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glkt glkt0 = (glkt)((ProtoLiteBuilder)object0).b_message;
        glkt0.e = ((glkv)object1).f;
        glkt0.b |= 4;
    }
}

