public final class cefj implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        geje geje0 = (geje)((ProtoLiteBuilder)object0).b_message;
        geje0.b |= 0x80;
        geje0.j = v;
    }
}

