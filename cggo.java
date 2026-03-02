public final class cggo implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gknw gknw0 = (gknw)((ProtoLiteBuilder)object0).b_message;
        gknw0.b |= 0x80000;
        gknw0.v = v;
    }
}

