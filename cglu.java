public final class cglu implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpw gkpw0 = (gkpw)((ProtoLiteBuilder)object0).b_message;
        gkpw0.k = ((gkpz)object1).f;
        gkpw0.b |= 0x200;
    }
}

