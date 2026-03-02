public final class ceiv implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejs gejs0 = (gejs)((ProtoLiteBuilder)object0).b_message;
        gejs0.b |= 16;
        gejs0.g = v;
    }
}

