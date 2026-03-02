public final class cgee implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((gkqd)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gkqd)object0))).ensureMutable();
        }
        gkqn gkqn0 = (gkqn)((gkqd)object0).b_message;
        gkqn0.b |= 0x200;
        gkqn0.n = v;
    }
}

