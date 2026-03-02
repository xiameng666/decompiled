public final class cegi implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejn gejn0 = (gejn)((ProtoLiteBuilder)object0).b_message;
        gejn0.e = ((gehu)object1).d;
        gejn0.b |= 4;
    }
}

