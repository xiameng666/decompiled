public final class chqj implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glea glea0 = (glea)((ProtoLiteBuilder)object0).b_message;
        glea0.b |= 0x10000;
        glea0.s = v;
    }
}

