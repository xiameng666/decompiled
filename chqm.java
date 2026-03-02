public final class chqm implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glea glea0 = (glea)((ProtoLiteBuilder)object0).b_message;
        glea0.b |= 1;
        glea0.c = z;
    }
}

