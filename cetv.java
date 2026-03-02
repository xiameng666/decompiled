public final class cetv implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((glgi)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((glgi)object0))).ensureMutable();
        }
        glgk glgk0 = (glgk)((glgi)object0).b_message;
        glgk0.b |= 0x20;
        glgk0.h = v;
    }
}

