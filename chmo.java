public final class chmo implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gljs gljs0 = (gljs)((ProtoLiteBuilder)object0).b_message;
        gljs0.c = ((gljr)object1).c;
        gljs0.b |= 1;
    }
}

