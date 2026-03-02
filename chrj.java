public final class chrj implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glef glef0 = (glef)((ProtoLiteBuilder)object0).b_message;
        glef0.b |= 4;
        glef0.e = v;
    }
}

