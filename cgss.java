public final class cgss implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        double f = (double)(((Double)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkvw gkvw0 = (gkvw)((ProtoLiteBuilder)object0).b_message;
        gkvw0.b |= 0x10000;
        gkvw0.s = f;
    }
}

