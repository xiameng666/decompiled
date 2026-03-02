public final class cibs implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzib gzib0 = (gzib)((ProtoLiteBuilder)object0).b_message;
        gzib0.b |= 2;
        gzib0.d = v;
    }
}

