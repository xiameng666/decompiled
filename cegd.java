public final class cegd implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejn gejn0 = (gejn)((ProtoLiteBuilder)object0).b_message;
        ((String)object1).getClass();
        gejn0.b |= 1;
        gejn0.c = (String)object1;
    }
}

