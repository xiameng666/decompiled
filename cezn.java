public final class cezn implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btbd btbd0 = (btbd)((ProtoLiteBuilder)object0).b_message;
        btbd0.f = ((btcc)object1).f;
        btbd0.b |= 8;
    }
}

