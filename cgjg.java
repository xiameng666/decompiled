public final class cgjg implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        int v = (int)(((Integer)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkov gkov0 = (gkov)((ProtoLiteBuilder)object0).b_message;
        gkov0.b |= 0x200;
        gkov0.l = v;
    }
}

