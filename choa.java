public final class choa implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gejp gejp0 = (gejp)((ProtoLiteBuilder)object0).b_message;
        gejp0.b |= 8;
        gejp0.f = f;
    }
}

