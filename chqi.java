public final class chqi implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glea glea0 = (glea)((ProtoLiteBuilder)object0).b_message;
        glea0.t = ((glec)object1).f;
        glea0.b |= 0x20000;
    }
}

