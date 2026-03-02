public final class cirk implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((int)(((Integer)object1))));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glkt glkt0 = (glkt)((ProtoLiteBuilder)object0).b_message;
        glkt0.b |= 16;
        glkt0.g = v;
    }
}

