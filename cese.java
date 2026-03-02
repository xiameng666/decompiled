public final class cese implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gioa gioa0 = (gioa)((ProtoLiteBuilder)object0).b_message;
        gioa0.b |= 8;
        gioa0.f = v;
    }
}

