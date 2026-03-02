public final class ciui implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        cnma cnma0 = (cnma)((ProtoLiteBuilder)object0).b_message;
        cnma0.b |= 0x20000;
        cnma0.t = z;
    }
}

