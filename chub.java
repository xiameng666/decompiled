public final class chub implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gllw gllw0 = (gllw)((ProtoLiteBuilder)object0).b_message;
        ((String)object1).getClass();
        gllw0.b |= 1;
        gllw0.c = (String)object1;
    }
}

