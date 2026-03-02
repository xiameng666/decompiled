public final class cffn implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((glgz)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((glgz)object0))).ensureMutable();
        }
        glhc glhc0 = (glhc)((glgz)object0).b_message;
        glhc0.b |= 0x40;
        glhc0.j = v;
    }
}

