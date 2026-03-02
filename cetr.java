public final class cetr implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((glgi)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((glgi)object0))).ensureMutable();
        }
        glgk glgk0 = (glgk)((glgi)object0).b_message;
        glgk0.c = ((bbcu)object1).a();
        glgk0.b |= 1;
    }
}

