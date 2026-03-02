public final class cgsx implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkwa gkwa0 = (gkwa)((ProtoLiteBuilder)object0).b_message;
        gkwa0.b |= 0x800;
        gkwa0.n = f;
    }
}

