public final class cesd implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gioa gioa0 = (gioa)((ProtoLiteBuilder)object0).b_message;
        ((String)object1).getClass();
        gioa0.b |= 1;
        gioa0.c = (String)object1;
    }
}

