public final class chtx implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((int)(((Integer)object1))));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gllw gllw0 = (gllw)((ProtoLiteBuilder)object0).b_message;
        gllw0.b |= 2;
        gllw0.d = v;
    }
}

