public final class cgpx implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpq gkpq0 = (gkpq)((ProtoLiteBuilder)object0).b_message;
        gkpq0.b |= 0x20;
        gkpq0.h = z;
    }
}

