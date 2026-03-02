public final class cgtj implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkwa gkwa0 = (gkwa)((ProtoLiteBuilder)object0).b_message;
        gkwa0.b |= 0x80;
        gkwa0.j = v;
    }
}

