public final class cffb implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((int)(((Integer)object1))));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glkz glkz0 = (glkz)((ProtoLiteBuilder)object0).b_message;
        glkz0.b |= 0x800;
        glkz0.n = v;
    }
}

