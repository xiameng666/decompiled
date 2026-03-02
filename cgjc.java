public final class cgjc implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkov gkov0 = (gkov)((ProtoLiteBuilder)object0).b_message;
        gkov0.b |= 0x20;
        gkov0.h = z;
    }
}

