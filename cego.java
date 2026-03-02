public final class cego implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejn gejn0 = (gejn)((ProtoLiteBuilder)object0).b_message;
        gejn0.b |= 0x20;
        gejn0.h = v;
    }
}

