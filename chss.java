public final class chss implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glel glel0 = (glel)((ProtoLiteBuilder)object0).b_message;
        glel0.b |= 0x100;
        glel0.k = z;
    }
}

