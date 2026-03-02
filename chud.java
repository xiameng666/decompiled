public final class chud implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gllw gllw0 = (gllw)((ProtoLiteBuilder)object0).b_message;
        gllw0.b |= 8;
        gllw0.f = v;
    }
}

