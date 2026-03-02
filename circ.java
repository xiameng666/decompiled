public final class circ implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((int)(((Integer)object1))));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        glks glks0 = (glks)((ProtoLiteBuilder)object0).b_message;
        glks0.b |= 16;
        glks0.g = v;
    }
}

