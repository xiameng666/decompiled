public final class chxg implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btan btan0 = (btan)((ProtoLiteBuilder)object0).b_message;
        btan0.b |= 4;
        btan0.e = v;
    }
}

