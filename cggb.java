public final class cggb implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gknv gknv0 = (gknv)((ProtoLiteBuilder)object0).b_message;
        gknv0.b |= 1;
        gknv0.d = v;
    }
}

