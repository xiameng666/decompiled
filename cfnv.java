public final class cfnv implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((gljf)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gljf)object0))).ensureMutable();
        }
        gljg gljg0 = (gljg)((gljf)object0).b_message;
        ((String)object1).getClass();
        gljg0.b |= 2;
        gljg0.d = (String)object1;
    }
}

