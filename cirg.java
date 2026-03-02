public final class cirg implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glks glks0 = (glks)((ProtoLiteBuilder)object0).b_message;
        ((String)object1).getClass();
        glks0.b |= 1;
        glks0.c = (String)object1;
    }
}

