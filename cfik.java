public final class cfik implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glky glky0 = (glky)((ProtoLiteBuilder)object0).b_message;
        glky0.b |= 16;
        glky0.g = z;
    }
}

