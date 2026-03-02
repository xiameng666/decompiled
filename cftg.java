public final class cftg implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glfa glfa0 = (glfa)((ProtoLiteBuilder)object0).b_message;
        glfa0.c = ((glex)object1).f;
        glfa0.b |= 1;
    }
}

