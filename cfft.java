public final class cfft implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((glgz)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((glgz)object0))).ensureMutable();
        }
        glhc glhc0 = (glhc)((glgz)object0).b_message;
        glhc0.o = ((glhb)object1).e;
        glhc0.b |= 0x800;
    }
}

