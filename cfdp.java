public final class cfdp implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glhl glhl0 = (glhl)((ProtoLiteBuilder)object0).b_message;
        glhl0.b |= 2;
        glhl0.d = v;
    }
}

