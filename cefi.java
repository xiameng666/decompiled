public final class cefi implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        geje geje0 = (geje)((ProtoLiteBuilder)object0).b_message;
        geje0.b |= 0x40;
        geje0.i = f;
    }
}

