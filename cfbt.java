public final class cfbt implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((int)(((Integer)object1))));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btbz btbz0 = (btbz)((ProtoLiteBuilder)object0).b_message;
        btbz0.b |= 8;
        btbz0.f = v;
    }
}

