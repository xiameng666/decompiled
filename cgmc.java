public final class cgmc implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpw gkpw0 = (gkpw)((ProtoLiteBuilder)object0).b_message;
        gkpw0.b |= 16;
        gkpw0.g = v;
    }
}

