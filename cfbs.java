public final class cfbs implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btbz btbz0 = (btbz)((ProtoLiteBuilder)object0).b_message;
        ((String)object1).getClass();
        btbz0.b |= 2;
        btbz0.d = (String)object1;
    }
}

