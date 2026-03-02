public final class chvx implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        bszd bszd0 = (bszd)((ProtoLiteBuilder)object0).b_message;
        bszd0.b |= 4;
        bszd0.e = v;
    }
}

