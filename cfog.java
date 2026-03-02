public final class cfog implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((gljf)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gljf)object0))).ensureMutable();
        }
        gljg gljg0 = (gljg)((gljf)object0).b_message;
        gljg0.b |= 0x20;
        gljg0.h = v;
    }
}

