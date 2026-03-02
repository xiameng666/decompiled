public final class cftn implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        boolean z = ((Boolean)object1).booleanValue();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glfa glfa0 = (glfa)((ProtoLiteBuilder)object0).b_message;
        glfa0.b |= 4;
        glfa0.e = z;
    }
}

