public final class ceip implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejs gejs0 = (gejs)((ProtoLiteBuilder)object0).b_message;
        gejs0.d = ((geig)object1).e;
        gejs0.b |= 2;
    }
}

