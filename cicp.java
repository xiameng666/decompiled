public final class cicp implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzie gzie0 = (gzie)((ProtoLiteBuilder)object0).b_message;
        gzie0.b |= 0x100;
        gzie0.k = v;
    }
}

