public final class cfbq implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btbz btbz0 = (btbz)((ProtoLiteBuilder)object0).b_message;
        btbz0.c = ((btby)object1).f;
        btbz0.b |= 1;
    }
}

