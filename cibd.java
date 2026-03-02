public final class cibd implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzhy gzhy0 = (gzhy)((ProtoLiteBuilder)object0).b_message;
        gzhy0.b |= 0x10000;
        gzhy0.r = v;
    }
}

