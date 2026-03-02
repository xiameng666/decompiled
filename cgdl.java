public final class cgdl implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        long v = (long)(((Long)object1));
        if(!((gkqd)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gkqd)object0))).ensureMutable();
        }
        gkqn gkqn0 = (gkqn)((gkqd)object0).b_message;
        gkqn0.b |= 0x800;
        gkqn0.p = v;
    }
}

