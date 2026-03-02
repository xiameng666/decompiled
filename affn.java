public final class affn implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        giva giva0 = (giva)((ProtoLiteBuilder)object0).b_message;
        giva0.p = ((bxqx)object1).j;
        giva0.b |= 0x2000;
    }
}

