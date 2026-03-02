public final class cerx implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gioa gioa0 = (gioa)((ProtoLiteBuilder)object0).b_message;
        gioa0.b |= 4;
        gioa0.e = f;
    }
}

