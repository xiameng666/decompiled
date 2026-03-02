public final class chob implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejp gejp0 = (gejp)((ProtoLiteBuilder)object0).b_message;
        gejp0.b |= 16;
        gejp0.g = v;
    }
}

