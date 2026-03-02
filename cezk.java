public final class cezk implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btbd btbd0 = (btbd)((ProtoLiteBuilder)object0).b_message;
        btbd0.b |= 4;
        btbd0.e = z;
    }
}

