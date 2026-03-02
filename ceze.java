public final class ceze implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        double f = (double)(((long)(((Long)object1))));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btbc btbc0 = (btbc)((ProtoLiteBuilder)object0).b_message;
        btbc0.b |= 2;
        btbc0.d = f;
    }
}

