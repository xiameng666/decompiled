public final class cicf implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzie gzie0 = (gzie)((ProtoLiteBuilder)object0).b_message;
        gzie0.b |= 4;
        gzie0.e = v;
    }
}

