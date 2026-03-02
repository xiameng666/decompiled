public final class cfgv implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glky glky0 = (glky)((ProtoLiteBuilder)object0).b_message;
        glky0.k = ((bbdg)object1).a();
        glky0.b |= 0x400;
    }
}

