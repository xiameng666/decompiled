public final class chvn implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hhaa hhaa0 = (hhaa)((ProtoLiteBuilder)object0).b_message;
        hhaa0.b |= 0x40;
        hhaa0.i = f;
    }
}

