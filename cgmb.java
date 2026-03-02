public final class cgmb implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkpw gkpw0 = (gkpw)((ProtoLiteBuilder)object0).b_message;
        gkpw0.b |= 2;
        gkpw0.d = v;
    }
}

