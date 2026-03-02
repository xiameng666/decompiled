public final class chwi implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((int)(((Integer)object1))));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        bszr bszr0 = (bszr)((ProtoLiteBuilder)object0).b_message;
        bszr0.b |= 2;
        bszr0.d = v;
    }
}

